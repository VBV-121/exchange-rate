package currency;

import java.io.IOException;
import java.util.Calendar;	


public class All {
	
	public static void main(String[] args) throws IOException
	{ 
		//create object of the classes 
		Input sites =new Input();
		connection connect = new connection();
		Calendar now = Calendar.getInstance();
		webscraping scrap= new webscraping();
		csvWriter out = new csvWriter();
		logging logs= new logging();
		
		//to read the site and time out from the site file

		String[] site =sites.read_url();
		int[] time_out = sites.read_to();
		
		
		//to run the program at a specific time
		
		int hrs = now.get(Calendar.HOUR);
		if(hrs== 7 || hrs==3 || hrs==6 || hrs==9 )
		{
			for(int i=0;i<site.length;i++)
			{
					//connecting to the site 
					String title = connect.conn(site,time_out,i,0);
					String data = connect.conn(site,time_out,i,1);
					
					//logging site connection events 
					logs.logg();
					
					//to extract the required part from the text portion
					String[] fdata = scrap.scrap(data, title);
					
					//writing the data extracted on to file 	
					out.Write(title, fdata);
					System.out.println("Finished");
				}
		}
		else
		{
			System.out.println("skipped");
		}
	}
}
