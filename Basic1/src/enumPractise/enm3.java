package enumPractise;


enum days{saturday, sunday, monday, tuesday};

public class enm3 {
	public static void main(String args[])
	{
		days dd = days.monday;
		
		switch(dd) {
		case sunday:
			System.out.println(days.sunday);
			break;
		case monday:
			System.out.println(days.monday);
			break;
		case saturday:
			System.out.println(days.saturday);
		}
	}
}
