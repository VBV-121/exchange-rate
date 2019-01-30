package currency;
import java.io.IOException;

public class position {
	public int[] send(String title) throws IOException {
		int[] a=new int[4];
		if(title.equals("Australian Dollar and Indian Rupee"))
		{
			a[0]=44;
			a[1]=52;
			a[2]=55;
			a[3]=63;
			return a; 
			
		}
		else if (title.equals("Canadian Dollar and Indian Rupee"))
		{
			a[0]=44;
			a[1]=52;
			a[2]=55;
			a[3]=63;
			return a;
		} 
		else if(title.equals("Euro and Indian Rupee"))
		{
			a[0]=44;
			a[1]=52;
			a[2]=55;
			a[3]=63;
			return a;
		}
		else if(title.equals("Indian Rupee and Japanese Yen"))
		{
			a[0]=69;
			a[1]=76;
			a[2]=79;
			a[3]=87;
			return a;
		}
		else if(title.equals("Indian Rupee and Malaysian Ringgit"))
		{
			a[0]=70;
			a[1]=79;
			a[2]=82;
			a[3]=91;			
			return a;
		}
		else if(title.equals("Indian Rupee and Singapore Dollar"))
		{
			a[0]=70;
			a[1]=78;
			a[2]=81;
			a[3]=89;		
			return a;
		}
		else if(title.equals("Indian Rupee and South African Rand"))
		{
			a[0]=71;
			a[1]=80;
			a[2]=83;
			a[3]=91;		
			return a;
		}
		else if(title.equals("Indian Rupee and United States Dollar"))
		{
			a[0]=70;
			a[1]=78;
			a[2]=81;
			a[3]=89;		
			return a;
		}
		else if(title.equals("Pound Sterling and Indian Rupee"))
		{
			a[0]=44;
			a[1]=52;
			a[2]=55;
			a[3]=63;			
			return a;
		}
		else if(title.equals("United Arab Emirates Dirham and Indian Rupee"))
		{
			a[0]=44;
			a[1]=53;
			a[2]=56;
			a[3]=65;			
			return a;
		}
		a[0]=44;
		a[1]=53;
		a[2]=57;
		a[3]=63;		
		return a;
	}
}