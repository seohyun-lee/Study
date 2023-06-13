import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//절대경로
		//File file1 = new File("C:\\Users\\SAMSUNG\\Documents\\oop_temp\\in.txt");
		//File file2 = new File("C:\\Users\\SAMSUNG\\Documents\\oop_temp\\out.txt");
		
		//상대경로
		File file1 = new File(".\\src\\text\\input.txt");
		File file2 = new File(".\\src\\text\\output.txt");
		
		Scanner input = null;
		PrintWriter output = null;
		
		try {
			input = new Scanner(file1); //읽을 파일 연결
			output = new PrintWriter(file2); //쓸 파일 연결
			
			output.println("======Start=======");
			while(input.hasNext()) {
				String s = input.nextLine();
				System.out.println(s);
				output.println(s);
			}
			output.println("======End======");
			output.flush();
		
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없거나 못 읽는 상황입니다.");
			e.printStackTrace();
			
		} catch (Exception e) {
			System.out.println("기타 예외가 발생하였습니다.");
			e.printStackTrace();
			
		} finally {
			input.close();
			output.close();
		}
		System.out.println("파일 출력을 완료하였습니다.");
	
	}

}
