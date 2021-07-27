public class Dentist
{
	private String name,address,contactno;
	private Role doctorrole;
	public Dentist(String na, String ad, String con)
	{
		name = na;
		address = ad;
		contactno = con;
	}
	
	//create the delegate
	public void setRole(Role r)
	{
		doctorrole = r;
	}
	public void getDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Tel No:"+contactno);
		doctorrole.getDetails(); //DELEGATION
	}
}