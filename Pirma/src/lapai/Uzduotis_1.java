package lapai;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JFrame;



public class Uzduotis_1 {

	public static void main(String[] args) {
		System.out.flush();
		
		int ilgis, plotis;
		String kainaStr;
		
		Scanner ivedimas = new Scanner(System.in);
		System.out.print("Įveskite kambario ilgį (m, sveikas sk.): ");
		ilgis=ivedimas.nextInt();
		ivedimas.nextLine();
		
		System.out.print("Įveskite kambario plotį (m, sveikas sk.): ");
		plotis=ivedimas.nextInt();
		
		System.out.print("Įveskite vieno kv.metro plytelių kainą (eur): ");
//		KADANGI KAINA VEDANT SU . ARBA SU , ATSIRANDA KLAIDA, KAINA PRISKYRIAU STRINGUI IR IS JO
//		KONVERTAVAU I DOUBLE (tuomet nebera skirtumo kaip vedame)
		kainaStr=ivedimas.next();
		kainaStr = kainaStr.replace(",",".");
		double kaina = Double.parseDouble(kainaStr);
		
		int plotasS = ilgis * plotis;
		double basekaina = (double) plotasS*kaina*1.05;
		
//		JFrame frame = new JFrame();
//		frame.setVisible(true);
//		JOptionPane.showMessageDialog(frame, "kas cia " +basekaina);

		System.out.print("Kambario (potas:" + plotasS + "'m2') plyteliu kaina su 5% atsarga: "+ String.format("%.2f", basekaina) + " eur.");
		
		ivedimas.close();
		

	}


}
