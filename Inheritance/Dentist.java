public class Dentist extends Doctor
{
	private int experience;
	
	public Dentist(String na, String add, String nic, String db, String cno, int ex)
	{
		System.out.println("Dentist");
		Register(na,add,nic,db,cno);
		experience = ex;
	}
	public void OperateScanner()
	{
		System.out.println(getName()+" Assign to Operate Scanner");
	}
	public void Display()
	{
		System.out.println("");
		System.out.println("Dentist Display");
		System.out.println("Name:"+getName());
		System.out.println("Address:"+getAddress());
		System.out.println("NIC:"+getNIC());
		System.out.println("Date of Birth:"+getDob());
		System.out.println("Tel No:"+getCno());
		System.out.println("Years of Experience:"+experience);
	}
}