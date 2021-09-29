import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Vykdymas {

	public static void main(String[] args) {
		List<Pirkejas> sarasas=new ArrayList<>();
		sarasas.add(new Pirkejas("Jonas", "Jonaitis", 500));
		sarasas.add(new Pirkejas("Petras", "Petraitis", 600));
		sarasas.add(new Pirkejas("Kazys", "Kazlauskas", 400));
		
		
		int suma=0;
		Pirkejas maz=sarasas.get(0);
		for (int i=0; i<sarasas.size(); i++) {
			suma+=sarasas.get(i).getIsleista();
			if (maz.getIsleista()>sarasas.get(i).getIsleista()) {
				maz=sarasas.get(i);
			}
		}
		System.out.println(suma);
		System.out.println(maz);
		
		
		suma=0;
		maz=sarasas.get(0);
		for (Pirkejas p:sarasas) {
			suma+=p.getIsleista();
			if (maz.getIsleista()>p.getIsleista()) {
				maz=p;
			}
		}
		System.out.println(suma / sarasas.size());
		System.out.println(maz);
		

	}
	
	

		

}
