/*Wednesday, May 23, 2012 by Irvan Abdurrahman*/

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Belajar{
		public static void main(String[] args){
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				System.out.println(dateFormat.format(date));
				
				Calendar cal = Calendar.getInstance();
				System.out.println(dateFormat.format(cal.getTime()));		
		}
}