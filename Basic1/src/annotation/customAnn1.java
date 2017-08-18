package annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface mann{
	int v();
	String s1();
}


class c{
	@mann(v=10,s1="kjl")
	public void m1()
	{
		System.out.println("annnn");
	}
	@mann(v=11,s1 = "")
	public void m2()
	{
		System.out.println("annnn");
	}
}



public class customAnn1 {
	public static void main(String args[]) throws Exception
	{
		c ob = new c();
		Method m = ob.getClass().getMethod("m1");
		mann myAnn = m.getAnnotation(mann.class);
		System.out.println(myAnn.v()+" "+myAnn.s1());
		ob.m1();
	}
}
