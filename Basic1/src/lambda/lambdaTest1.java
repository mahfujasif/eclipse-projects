package lambda;

interface ifc{
	public void mtd();
}


public class lambdaTest1 {
	public static void main(String args[])
	{
		ifc ob = ()->{
			int i=11;
			i++;
			System.out.println(i);
		};
		ob.mtd();
	}
}
