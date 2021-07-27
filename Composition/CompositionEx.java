import java.util.Vector;

public class CompositionEx
{
	public static void main(String arg[])
	{
		SurgeryRoom sgr1 = new SurgeryRoom(1,"Used by Prof.Amarathunga");
		SurgeryRoom sgr2 = new SurgeryRoom(2,"Used by Dr.Fonseka");
		SurgeryRoom sgr3 = new SurgeryRoom(3,"Used by Dr.Isuru");
		ScanRoom scr = new ScanRoom(1,"Used by Dr.Perera");		
		
		Vector roomlist = new Vector();
		
		roomlist.addElement(sgr1);
		roomlist.addElement(sgr2);
		roomlist.addElement(sgr3);
		roomlist.addElement(scr);
		
		Dental d1 = new Dental("Family Dental Care","Piachaud Gardens Kandy",roomlist);
		d1.displayDentalDetails();
	}
}


