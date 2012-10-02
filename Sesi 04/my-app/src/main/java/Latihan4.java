// (c) Wednesday, April 25, 2012 by Irvan Abdurrahman

public class Latihan4{
	public static void main(String args[]){
		System.out.println(getReturn());
	}
	
	public static boolean getReturn(){
		String s1 = "Hello";
		String s2 = "java";
		
		if(s1 == s2 ) return true;
		//atau
		if(s1.equals(s2)) return true;
		//atau
		if(s1.compareTo(s2) == 0) return true;
		else return false;
	}

}