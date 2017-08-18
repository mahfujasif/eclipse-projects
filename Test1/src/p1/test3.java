package p1;

interface like{
	public void mike();
}

public class test3 {
	public static void main(String args[])
	{
		like lk = new like(){
			public void mike(){
				System.out.println("spike");
			}
		};
		lk.mike();
	}
}
