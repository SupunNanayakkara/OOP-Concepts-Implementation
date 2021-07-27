public class SurgeryRoom
{
	private int roomno;
	private String description;
	
	public SurgeryRoom(int rn, String des)
	{
		roomno = rn;
		description = des;
	}
	public void displaySurgeryRoomDetails()
	{
		System.out.println("Room No:"+roomno);
		System.out.println("Description:"+description);
	}
}