public class ScanRoom
{
	private int roomno;
	private String description;
	
	public ScanRoom(int rn, String des)
	{
		roomno = rn;
		description = des;
	}
	public void displayScanRoomDetails()
	{
		System.out.println("Room No:"+roomno);
		System.out.println("Description:"+description);
	}
}