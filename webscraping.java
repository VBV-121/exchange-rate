package currency;

import java.io.IOException;

public class webscraping {
	public String[] scrap(String data,String title) throws IOException {

		position pos = new position();
		int[] a = new int[1];
		a= pos.send(title);

		//storing the content in a variable
		String[] f_data=new String[2];
		f_data[0] = data.substring(a[0],a[1]);
		f_data[1] = data.substring(a[2],a[3]);
		System.out.println(f_data[0]);
		System.out.println(f_data[1]);
		return(f_data);
	}

}
