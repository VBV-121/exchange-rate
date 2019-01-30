package currency;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Element;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Input {

	public String[] read_url() throws IOException
	{
		//read the data from the site xml file 
	    File input = new File("C:\\Users\\vaibh\\eclipse-workspace\\currency\\src\\currency\\site_data.xml");
	    FileInputStream fis = new FileInputStream(input);
		Document d = Jsoup.parse(fis,null,"",Parser.xmlParser());
		
		//creating a list to store the data obtained from the xml file
		List<String> s =new ArrayList<String>();
		
		//converting list to string array and reading the data in list for url
		for(Element e: d.select("url")){
		     s.add(e.text());
		}
		int count =s.size()-1;
	    String[] source = new String[count];
		source= s.toArray(source);
		return source;
	}
	
	
	public int[] read_to() throws IOException
	{
		File input = new File("C:\\Users\\vaibh\\eclipse-workspace\\currency\\src\\currency\\site_data.xml");
	    FileInputStream fis = new FileInputStream(input);
		Document d = Jsoup.parse(fis,null,"",Parser.xmlParser());
		
		List<String> t_o =new ArrayList<String>();
		
		//converting list to string array and reading the data in list for time out
		for(Element e: d.select("to")){
		     t_o.add(e.text());
		}
		
		int count =t_o.size()-1;
		String [] t = new String[count];
		t= t_o.toArray(t);
		
		int[] time_out=new int[count+1];
		for(int i=0;i<t_o.size();i++)
		{
			time_out[i]=Integer.parseInt(t[i]);
		} 
		
		return time_out;
	}
	
	public int[] read_pri() throws IOException
	{
		File input = new File("C:\\Users\\vaibh\\eclipse-workspace\\currency\\src\\currency\\site_data.xml");
		FileInputStream fis = new FileInputStream(input);
		Document d = Jsoup.parse(fis,null,"",Parser.xmlParser());

		List<String> p =new ArrayList<String>();		

		//converting list to string array and reading the data in list for priority
		for(Element e: d.select("p")){
		     p.add(e.text());
		}
		int count =p.size()-1;
		String[] pri = new String[count];
		pri= p.toArray(pri);
		
		int[] priority=new int[count+1];
		for(int i=0;i<p.size();i++)
		{
			priority[i]=Integer.parseInt(pri[i]);
		} 
		
		
		return priority;
	}
}
