public class PolymorphismEx
{
	public static void main(String args[])
	{
		Consultant c1 = new Consultant("Dr.Perera","Kandy","7011353713V","11/05/1970","0774553451","PG Dip. in Implant Dentistry","Univeristy College London");
		Dentist d1 = new Dentist("Dr.Harshana","Kandy","9020113713V","20/03/1990","0714553451",5);
		Dentist d2 = new Dentist("Dr.Isuru","Gampola","9360213413V","19/05/1993","0754553451",3);
		
		c1.Display();
		d1.Display();
		d2.Display();
	}
}