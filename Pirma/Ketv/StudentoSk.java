
public class StudentoSk {

	public static void main(String[] args) {

		int skaic = 100;
		int sk;
		int vnt = 0;
		int des = 0;
		int sis=0;
		int norm=0, apv=0, sisapv = 0;

		for (sk = 0; sk < skaic/10; sk++) {
			des = sk;

			for (vnt = 0; vnt < skaic/10; vnt++) {
//				System.out.println("des: " + des + " // Vnt: " + vnt);
				
//				int nr= Integer.parseInt(vnt+""+des);
				apv= vnt*10+des;
				norm = des*10+vnt;
				
				if (des*2 ==vnt ) {
					if (norm +36 == apv) {
						sis = norm;
						sisapv=apv;
//						break;
					}
				}			
			}

		}
		System.out.println("Normalus skaicius: " + sis + " , Apverstas: " + sisapv + " , Skirtumas: " + sisapv +"-"+sis +"=" + (sisapv-sis));
		System.out.println("Studentas sugalvojo si skaiciu: " + sis);
	}
}
