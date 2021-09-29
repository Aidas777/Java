
public class Vykdymas {

	public static void main(String[] args) {
		Duomenys<Integer> gyventojai = new Duomenys<>();
		gyventojai.setData(5, 1);

		

		
		Duomenys<Double> temperaturos=new Duomenys<>();
		temperaturos.setData(25.5, 1);

		
		Duomenys<String> vardai=new Duomenys<>();
		vardai.setData("Jonas", 0);
		
		System.out.println(gyventojai);
		System.out.println(temperaturos);
		System.out.println(vardai);

	}

}
