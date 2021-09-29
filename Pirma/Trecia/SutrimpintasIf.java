
public class SutrimpintasIf {

	public static void main(String[] args) {

		int lytis=1;
		
		String lytisS;
		
//		if(lytis==0) {
//			lytisS="Moteris";
//		} else {
//			lytisS="Vyras";
//		}
//		
//		TAS PATS YRA ZEMIAU:
		
		lytisS=(lytis==0)?"Moteris":"Vyras";
		
		System.out.println("Zmogaus lytis: " + lytisS);
		
//		if (lytis==0) {
//			System.out.println("Zmogaus lytis: moteris");
//		} else {
//			System.out.println("Zmogaus lytis: vyras");
//		}
		
		System.out.println("Zmogaus lytis: " +((lytis==0)?"Metoris":"Vyras"));
		
		int x=5;
		int z=5;
		int sk=(x==5)? (z>4)?1:2:3; //taip nerekomenduojama, nes persuetinga skaityti
		//geriau taip:
		if (x==5) {
			if (z>4) {
				sk=1;
			} else {
				sk=2;
			}
		} else {
			sk=3;
		}
			
	}

}
