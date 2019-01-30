package currency;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class csvWriter {	
	public void Write(String title, String[] fdata) throws IOException {
		Calendar now = Calendar.getInstance();
		String date_now=now.getTime().toString();
		date_now=date_now.substring(4,10)+" "+date_now.substring(24, 28);
		CSVWriter csvWriter = new CSVWriter(new FileWriter("final_data.csv",true));
        csvWriter.writeNext(new String[]{date_now,title,fdata[0],fdata[1]});
        csvWriter.close();
    }
}

