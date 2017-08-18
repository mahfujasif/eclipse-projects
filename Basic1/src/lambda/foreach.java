package lambda;

import java.util.ArrayList;
import java.util.List;

public class foreach {
	public static void main(String args[])
	{
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(4);
		ll.add(6);
		ll.add(48);
		ll.add(54);
		ll.forEach
		(
			(n)->System.out.println(n)
		);
	}
}
