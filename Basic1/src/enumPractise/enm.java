

package enumPractise;


class e{
	enum days{sunday, monday, rests};
	String ss="";
	void pp(String s)
	{
		for(days d:days.values())
				System.out.println(d);
	}
}


public class enm {
	public static void main(String args[])
	{
		e ob = new e();
		ob.pp("sunday");
	}
}
