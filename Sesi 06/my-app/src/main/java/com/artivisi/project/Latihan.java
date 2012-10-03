/*Wednesday, May 16, 2012 by Irvan Abdurrahman*/

import java.util.*;

public class Latihan {
		public static void main(String[] args) {
				Set set=new HashSet();
				set.add("Second");
				set.add("one");
				set.add("3rd");
				set.add(new Integer (4));
				set.add(new Float (5.0F));
				set.add("Second");
				set.add(new Integer(4));
				System.out.println(set);
		}
}