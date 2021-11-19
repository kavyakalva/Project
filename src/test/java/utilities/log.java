package utilities;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.log4j.FileAppender;

public class log extends FileAppender{
	
	public void setFile(String file) {
		if(file.contains("%timestamp")) {
			SimpleDateFormat date = new SimpleDateFormat("yyyy_MM_dd_mm_hh_ss");
			file = file.replaceAll("%timestamp", date.format(new Date(0)));
		}
		super.setFile(file);
	}
}
