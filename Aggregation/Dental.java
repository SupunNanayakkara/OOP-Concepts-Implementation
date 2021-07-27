import java.util.Vector;

public class Dental
{
	private String title,address;
	private int scnrooms,sgrrooms;
	private Vector roomlist;
	
	public Dental(String t, String a, int c1, int c2)
	{
		title = t;
		address = a;
		sgrrooms = c1;
		scnrooms = c2;
		roomlist = new Vector();
	}
	public void addRoom(SurgeryRoom r)//object passing or message passing
	{
		roomlist.addElement(r);
	}
	public void displayDentalDetails()
	{
		System.out.println("Title:"+title);
		System.out.println("Address:"+address);
		System.out.println("No of Surgery Rooms:"+sgrrooms);
		System.out.println("No of Scan Rooms:"+scnrooms);
		System.out.println("Room Details");
		int x=0;
		
		while(x<roomlist.size())
		{
			SurgeryRoom r = (SurgeryRoom)roomlist.elementAt(x);
			r.displayRoomDetails();
			x++;
		}
	}
}