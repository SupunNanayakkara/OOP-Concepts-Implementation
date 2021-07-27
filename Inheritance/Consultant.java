public class Consultant extends Doctor
{
	private String PhD, university;
	
	public Consultant(String na, String add, String nic, String db, String cno, String pg, String uni)
	{
		System.out.println("Consultant");
		Register(na,add,nic,db,cno);
		PhD = pg;
		university = uni;
	}
	public void Display()
	{
		System.out.println("");
		System.out.println("Display Consulant");
		System.out.println("Name:"+getName());
		System.out.println("Address:"+getAddress());
		System.out.println("NIC:"+getNIC());
		System.out.println("Date of Birth:"+getDob());
		System.out.println("Tel No:"+getCno());
		System.out.println("Post Graduate Qualification:"+PhD);
		System.out.println("University:"+university);
	}
}