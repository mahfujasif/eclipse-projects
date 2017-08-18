package Generic;


public class GenericMthd {
	public static <J extends Comparable<J> > J maxim(J k, J l, J m)
	{
		J max = k;
		if(l.compareTo(max)>0)
			max = l;
		if(m.compareTo(max)>0)
			return m;
		else return max;
	}


	public static void main(String args[])
	{
		Integer[] m = {55,64,85,22};
		Character[] cc = {'p', 'r', 'a', 'n'};
		int a = maxim(m[0],m[1],m[2]);
		char ch = maxim(cc[0],cc[1],cc[2]);
		System.out.println(a);
		System.out.println(ch);
	}
}
