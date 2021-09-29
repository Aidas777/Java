import java.util.Scanner;

//import sun.security.util.Length;


public class TxTilgis {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Ivesk teksta: ");
		
		String txt = in.next();
//		String txtStr= String.valueOf(txt);
		
		int lienas = txt.length();
		String txtL= txt.substring(0,1);
		String txtR= txt.substring(lienas-1);

		System.out.println("pirmoji raide: " +txtL + " // paskune raide: " + txtR +" , o texto ilgis:" + lienas);
		
		in.close();
		
	}

}
