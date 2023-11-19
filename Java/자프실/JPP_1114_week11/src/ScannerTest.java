import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		int n;
		try {
			Scanner input = new Scanner(new File("numbers.txt"));
			while (input.hasNext()) {
				n = input.nextInt();
				System.out.println(n);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("cannot open");
			System.exit(1);
		}
	}

}
