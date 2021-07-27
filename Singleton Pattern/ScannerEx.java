import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerEx
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sno,mk,country;
		float cost;
		System.out.print("Enter Device Serial No:");
		sno = br.readLine();
		System.out.print("Enter Make and Model:");
		mk = br.readLine();
		System.out.print("Country of Origin:");
		country = br.readLine();
		System.out.print("Enter Cost:Rs.");
		cost = Float.parseFloat(br.readLine());
		System.out.println("");
		Scanner s1 = Scanner.getScanner(sno,mk,country,cost);
		s1.showDetails();
		
		System.out.print("Enter Device Serial No:");
		sno = br.readLine();
		System.out.print("Enter Make and Model:");
		mk = br.readLine();
		System.out.print("Country of Origin:");
		country = br.readLine();
		System.out.print("Enter Cost:Rs.");
		cost = Float.parseFloat(br.readLine());
		Scanner s2 = Scanner.getScanner(sno,mk,country,cost);
	}
}