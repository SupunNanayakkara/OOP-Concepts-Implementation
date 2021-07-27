public class AggregationEx
{
	public static void main(String arg[])
	{
		Dental d1 = new Dental("Family Dental Care","Kandy",4,1);
		SurgeryRoom r1 = new SurgeryRoom(1,"Used by Prof.Amarathunga");
		SurgeryRoom r2 = new SurgeryRoom(2,"Used by Dr.Isuru");
		
		d1.addRoom(r1);
		d1.addRoom(r2);
		d1.displayDentalDetails();
	}
}


