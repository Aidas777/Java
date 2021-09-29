import java.io.*;
import java.util.Scanner;

public class SkaitIsFailo2 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(new File("Duom.txt"));
		
		int sk;
		while (in.hasNextInt()) {
			sk=in.nextInt();
			System.out.print(sk+", ");
		}

		in.close();
	}

}
