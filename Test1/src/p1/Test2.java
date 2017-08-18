package p1;

public class Test2 {
	public static void main(String args[])
	{
		
		int a[] = {5,4,2,2,55,7};
		for(int x : a)
			System.out.println(x);
		
		
		
		Integer n = 5;
		n = n + 10;
		System.out.println(n);
		
		
		int d = 5;
		Integer b = d;
		String s = b.toString();
		//String sss = d.toString();
		String ss = Integer.toString(d);
		
	}

}
