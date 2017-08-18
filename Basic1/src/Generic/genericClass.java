package Generic;

class generic<T>{
	private T t;
	public void add(T t)
	{
		this.t = t;
	}
	public T get()
	{
		return t;
	}
}


public class genericClass{
	public static void main(String args[])
	{
		generic<Integer> go = new generic();
		generic<Character> gc = new generic();
		go.add(11);
		gc.add('M');
		System.out.println(go.get());
		System.out.println(gc.get());
	}
}