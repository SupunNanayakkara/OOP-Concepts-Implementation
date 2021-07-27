public class BasicTreatment extends Treatment
{
	private String description;
	
	public BasicTreatment(String s)
	{
		description = s;
	}
	public void getDetails()
	{
		System.out.println("*BASIC TREATMENT*");
		System.out.println(description);
		System.out.println("*END BASIC TREATMENT*\n");
	}
}