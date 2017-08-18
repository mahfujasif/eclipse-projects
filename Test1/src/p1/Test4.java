package p1;


@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}

class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}

public class Test4 {
	public static void main(String args[])
	{
		Something something = new Something();
		Converter<String, String> converter = something::startsWith;
		String converted = converter.convert("Java");
		System.out.println(converted);    // "J"
	}
}
