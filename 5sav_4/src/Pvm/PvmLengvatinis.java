package Pvm;

public class PvmLengvatinis implements PvmInterface {

	@Override
	public int gaukpvm(int tipas) {
		if (tipas==1) return 5;
		return 21;
	}

}
