public class Doctor
{
	private String name,address,contactno,dob,NIC;
	
	public Doctor()
	{
		System.out.print("Doctor Registration - ");
	}
	public void TreatPatient()
	{
		System.out.println(name+" Assign to Treat Patient");
	}
	public void Register(String na, String add, String nic, String db, String cno)
	{
		name = na;
		address = add;
		NIC = nic;
		dob = db;
		contactno = cno;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getNIC()
	{
		return NIC;
	}
	public String getDob()
	{
		return dob;
	}
	public String getCno()
	{
		return contactno;
	}
	public void Display()
	{
		System.out.println("");
		System.out.println("Display Doctor");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("NIC:"+NIC);
		System.out.println("Date of Birth:"+dob);
		System.out.println("Tel No:"+contactno);
	}
}