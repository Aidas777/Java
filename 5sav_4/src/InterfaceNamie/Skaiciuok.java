package InterfaceNamie;

public class Skaiciuok implements MokInterface {

	@Override
	public int SkaiciuokPaz(int pazimys) {
		int rezultatas = pazimys *2;
		return rezultatas;
	}

}
