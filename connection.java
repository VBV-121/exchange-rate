package currency;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
 
public class connection {
	

	public String conn(String[] site,int[] time_out,int i,int j) throws IOException{
		Document d = Jsoup.connect(site[i]).timeout(time_out[i]).get();
		if(j==1)
		{
			String data = d.select("description").text();
			return(data);
		}
		else 
		{
			String title=d.select("item").select("title").text();
			System.out.println(title);
			return(title);
		}
	}	
}
