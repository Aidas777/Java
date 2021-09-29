package sav3_5;

public class Daryk {

	public static void main(String[] args) {
		int diena = 6;
		int dienu = 0;
		switch (diena) {
		  case 1:
		    dienu += 1;
		  case 2:
		    dienu += 2;
		  case 3:
		    dienu += 3;
		  case 4:
		    dienu += 4;
		  case 5:
		    dienu += 5;
		  case 6:
		    dienu += 6;
		  case 7:
		    dienu += 7;
		}
		System.out.print(dienu);
	}

}
