/*Wednesday, May 16, 2012 by Irvan Abdurrahman*/

import java.util.*;

public class Praktikum {
		public static void main(String[] args) {
				Vector v=new Vector();
				v.add("Zak");
				v.add("Gordon");
				v.add(0, "Duke");
				v.add("Lara");
				v.add("Zak");
				System.out.println(v);
				String name=(String) v.get(2);
				System.out.println(name);
		}
}