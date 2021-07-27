public class Scanner
{
	private String SerialNo,make,origin;
	private float cost;
	private static int count=0;
	
	private Scanner(String sno, String mk, String country, float cs)
	{
		SerialNo = sno;
		make = mk;
		origin = country;
		cost = cs;
		System.out.println("Scanner Created");
	}
	public void showDetails()
	{
		System.out.println("Serial No:"+SerialNo);
		System.out.println("Make:"+make);
		System.out.println("Country of Origin:"+origin);
		System.out.println("Cost:Rs."+cost);
		System.out.println("");
	}
	public static Scanner getScanner(String sno, String mk, String country, float cs)
	{
		if(count==1)
		{
			System.out.println("Scanner already Created");
			return null;
		}
		else
		{
			Scanner s1 = new Scanner(sno,mk,country,cs);
			count++;
			return s1;
		}
	}
}