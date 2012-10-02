/*Copyright 2012, May 09, Wednesday _ Irvan Abdurrahman*/

package regex;

import java.util.regex.*;

public class RegexCheckEmail{
		public static void main(String[] args){
				String text1 = " Matheas Jabs 50092 KA (021) - 28946300 AA SA mjabs@yahoo.com ";
				
				//Mencari format alamat Email
				regexChecker ( "[A - Z a - z 0 - 9 ._% + -] +@ [A-Za-z0-9._% + -]+\\ .[A-Za-z]{2,4}", text1);
		}
		
		//method untuk mengecek regex dari sebuah string
		public static void regexChecker(String regExp, String textStr){
				Pattern regExpPattern = Pattern.compile(regExp);
				Matcher regExpMatch = regExpPattern.matcher(textStr);
				
				while (regExpMatch.find()){
						if(regExpMatch.group().length()!=0){
								System.out.println(regExpMatch.group().trim());
						}
						
						System.out.println ("Start Index : " + regExpMatch.start());
						System.out.println ("End Index : " + regExpMatch.end());
				}
		}
}