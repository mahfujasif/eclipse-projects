package StreamTest;

import java.util.Arrays;
import java.util.List;

public class stream1 {
	public static void main(String args[])
	{
		List<String> ml = Arrays.asList("a1","b1","c2","a2","b2","c1");
		
		ml
		.stream()
		.filter(s->s.startsWith("c"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
		
		
	}

}
