import java.util.Vector;

public class ComplexTreatment extends Treatment
{
	private Vector vec;
	private  String complexdescription;
	
	public ComplexTreatment(String cd)
	{
		vec = new Vector();
		complexdescription = cd;
	}
	public void add(Treatment t)
	{
		vec.addElement(t);
	}
	public void getDetails()
	{
		int x = 0;
		System.out.println("***COMPLEX TREATMENT***");
		System.out.println("-----------------------");
		System.out.println(complexdescription+"\n");
		while(x<vec.size())
		{
			Treatment t = (Treatment)vec.elementAt(x);
			t.getDetails();//show basic treatment
			x++;
		}
		System.out.println("***END COMPLEX TREATMENT***\n");
	}
}