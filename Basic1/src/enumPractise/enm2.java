package enumPractise;


class e2{
	enum season{
		WINTER("winter"),SUMMER("summer"),SPRING("spring");
		private String sq;
		private season(String sq)
		{
			this.sq = sq;
		}
		
	}
	
	void p(String sd)
	{
		for(season s:season.values())
			//if(sd.equals(season.valueOf("SPRING")))
				System.out.println(s);
	}
	
}


public class enm2 {
	public static void main(String args[])
	{
		e2 ob = new e2();
		ob.p("spring");
	}
}
