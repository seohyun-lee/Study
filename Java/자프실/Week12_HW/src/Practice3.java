import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice3 {
	
	public static void main(String[] args) {
		try {
			FileReader fin = new FileReader("c:\\windows\\system.ini");
			int c;
			while ((c = fin.read()) != -1) {
				if (c >= 'a' && c <= 'z')
					c -= 32;
				System.out.print((char)c);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일오픈 오류");
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
