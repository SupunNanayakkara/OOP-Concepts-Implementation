import java.util.Vector;

public class Dental
{
	private String title,address;
	private final Vector roomlist;
	
	public Dental(String t, String a, Vector r)
	{
		title = t;
		address = a;
		roomlist = r;
	}
	public void displayDentalDetails()
	{
		System.out.println("Title:"+title);
		System.out.println("Address:"+address);
		System.out.println("Room Details");
		int x=0;
		
		while(x<roomlist.size())
		{
			SurgeryRoom r = (SurgeryRoom)roomlist.elementAt(x);
			r.displaySurgeryRoomDetails();
			x++;
		}
	}
}