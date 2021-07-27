public class DelegationEx
{
	public static void main(String args[])
	{
		Dentist d1 = new Dentist("Dr.Isuru","Peradeniya","0714553451");
		TreatingRole r1 = new TreatingRole();
		d1.setRole(r1);
		d1.getDetails();
		ScannerRole r2 = new ScannerRole();
		d1.setRole(r2);
		d1.getDetails();
	}
}