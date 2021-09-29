
public class StudentoSkNotWork {

	public static void main(String[] args) {

		int sk, des = 0, vnt =0, sitas=0;
		for (sk=0; sk<100;sk++) {
			
//VIENTATAI
			if (sk !=vnt) {
				vnt = sk % 10;
			}
			
//DESIMTYS
			if (sk !=des*10) {
				des = sk /10;
			}
			System.out.println("Desinmtys: " +des + " /// Vienetai: " + vnt + " /// mistika: " +(vnt*10 + des));
		
		if ((vnt*10 + des) == sk+36) {
			sitas = sk;
		}
			
		}

		
		System.out.println("Studentas sugalvojos skaiciu: " + sitas);
	}

}
