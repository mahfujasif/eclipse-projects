package pk1;


class A{
	void m()
	{
		System.out.println("m");
	}
	@Deprecated
	void n()
	{
		System.out.println("n");
	}
}

public class TestAnnotation1{
	public static void main(String args[])
	{
		A ob = new A();
		ob.m();
		ob.n();
	}
}