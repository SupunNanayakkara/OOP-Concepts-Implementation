public class CompositeDemo
{
	public static void main(String arg[])
	{
		BasicTreatment bt1 = new BasicTreatment("Antibiotics - cost 1000");
		BasicTreatment bt2 = new BasicTreatment("Tooth Extraction - cost 3000");
		BasicTreatment bt3 = new BasicTreatment("New Impant - cost 40000");
		ComplexTreatment ct1 = new ComplexTreatment("Tooth Implant Procedure");
		BasicTreatment bt4 = new BasicTreatment("Dental Filling - cost 2500");
		
		ct1.add(bt1);
		ct1.add(bt2);
		ct1.add(bt3);
		
		ct1.getDetails();
		bt4.getDetails();
	}
}