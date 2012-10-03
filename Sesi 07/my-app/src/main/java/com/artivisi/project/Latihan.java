/*Wednesday, May 23, 2012 by Irvan Abdurrahman*/

import java.util.*;
import java.text.*;

public class Latihan{
		public static void main(String[] args){
				showDateFormat();
				showSimpleDateFormat();
		}
		
		public static void showDateFormat(){
				Date now = new Date();
				System.out.println("Date toString() format: " + now.toString());
				DateFormat df = DateFormat.getInstance();
				System.out.println("Default DateFormat : " + df.format(now));
				df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
				System.out.println("Default DateFormat in west coast : " +df.format(now));
				df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.US);
				System.out.println("Short date time in US : " + df.format(now));
				df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.US);
				System.out.println("Medium date time in US : " + df.format(now));
				df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.FRENCH);
				System.out.println("Short date time in French : " + df.format(now));
				df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.FRENCH);
				System.out.println("Long date time in French : " + df.format(now));
		}
		
		public static void showSimpleDateFormat(){
				Date now = new Date();
				System.out.println("Date toString() format: " + now.toString());
				SimpleDateFormat sdf = new SimpleDateFormat();
				System.out.println("Default SimpleDateFormat : " + sdf.format(now));
				sdf = new SimpleDateFormat("dd-MMM-yyyy");
				System.out.println("The FDA standard format : " + sdf.format(now));
				sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
				System.out.println("Date.toString() format : " + sdf.format(now));
				sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.FRENCH);
				System.out.println("Date.toString() format in French : " + sdf.format(now));
		}
}