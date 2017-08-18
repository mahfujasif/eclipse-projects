package p1;

class c1{
	void m1()
	{
		System.out.println("abc");
	}
	void m2()
	{
		System.out.println("abcd");
	}
}


class c2 extends c1{
	@Override
	void m1()
	{
		System.out.println("abc");
	}
	@Override
	void m2()
	{
		System.out.println("abcd");
	}
	
	boolean m3(){
		boolean m3=false;
		return m3;
	}
}

public class Test1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("123");
		c2 obj = new c2();
		obj.m1();

	}

}
