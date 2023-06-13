

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class FileAndException {
	
	public static void main(String[] args) {
		File file1 = new File("./src/File/input.txt");
		File file2 = new File("./src/File/out.txt");
		ArrayList<Integer> list = new ArrayList();
		//List list = new ArrayList();라면 List, ArrayList 둘다 임포트해야함...
		//Scanner와 PrintWriter의 변수 선언은 try문 밖에서 한다. 한번만 해도 되구
		Scanner input=null;
		PrintWriter output=null;
		
		try {
			input = new Scanner(file1);
			output = new PrintWriter(file2);
			
			while(input.hasNext()) { //.hasNextLine아니고요 .hasNext입니다!!!!!!!!!!!
				String s = input.nextLine();
				int n = Integer.parseInt(s);
				list.add(n);
				output.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없거나 못 읽는 상황입니다.");
			e.printStackTrace();
			
		} catch (NumberFormatException e) {
			System.out.println("정수형이 아닙니다.");
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
