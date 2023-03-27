import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String name, univ, major, studentNum;
		int age;
		
		System.out.print("이름: ");
		name = input.nextLine();
		System.out.print("대학교: ");
		univ = input.nextLine();
		System.out.print("전공: ");
		major = input.nextLine();
		
		System.out.print("학번: ");
		studentNum = input.nextLine();
		System.out.print("나이: ");
		age = input.nextInt();

		System.out.println("#############################");
		System.out.printf("    %s %s %s\n", univ, major, studentNum);
		System.out.printf("        %s (%d) \n", name, age);
		System.out.println("#############################");
		
		input.close();
		
	}

}
