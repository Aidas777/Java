
public class Pasirinkimas {

	public static void main(String[] args) {

		int i = 9;
		
//		String s="5";
//		switch (s) {
//			case "5":
//				System.out.println("Textas");
//				
//		}
		
		
	

		switch (i) {
		case 1:
			System.out.println("Pirmadienis");
			break;
		case 2:
			System.out.println("Antrad");
			break;
		case 3:
			System.out.println("Trec");
			break;
		case 4:
			System.out.println("Ketv");
			break;
		case 5:
			System.out.println("Penkt");
			break;
		case 6: //VYKDO TOLIAU ... CASE 7 IR TT
		case 7:
			System.out.println("Svaitgalis");
			break;
		default:
			System.out.println("tokios sav.dienos nera");
			break; //ant paskutinio galim deti, galim nedeti break
		}
		
		//DAR GALIM SU TOKIU NUTRAUKTI PROGRAMA
//		System.exit(0);
	}

}
