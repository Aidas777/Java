import java.util.ArrayList;
import java.util.List;

public class Vykdymas {

	public static void main(String[] args) {
		List<Pirkejas> sarasas = new ArrayList<>(10); //cia 10 arraylisto masyvo dydis (kiek elementu)

//		List<Integer> i;
//		List<int> i;
		sarasas.add(new Pirkejas("Jonas", "Jonaitis", 500));
		sarasas.add(new Pirkejas("Petras", "Petraitis", 600));
		sarasas.add(new Pirkejas("Kazys", "Kazauskas", 800));
		
//		sarasas.get(2);
		
		int suma=0;
		Pirkejas maz=sarasas.get(0);
		for (int i =0; i<sarasas.size(); i++) {
			suma+=sarasas.get(i).getIsleista();
			
			if(maz.getIsleista()>sarasas.get(i).getIsleista()) {
				maz=sarasas.get(i);
			}
			
		}
		System.out.println(suma);
		System.out.println(maz);
		
		suma=0;
		for (Pirkejas p:sarasas) {
			suma+=p.getIsleista();
		}
		System.out.println(suma);
	}
	
//		public void remove(int i) {
//			Data<T> t=q;
//			
//			for(int j=0; ; j++) {
//			if (j==i-1) t.next=t.next.next;
//			System.out.print(t.getData() +" ");
//			t=t.next;
//			if (t==null) break;
//			}
//		}
}
