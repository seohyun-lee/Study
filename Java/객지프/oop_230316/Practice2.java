import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String name, univ, major, studentNum;
		int age;
		
		System.out.print("�̸�: ");
		name = input.nextLine();
		System.out.print("���б�: ");
		univ = input.nextLine();
		System.out.print("����: ");
		major = input.nextLine();
		
		System.out.print("�й�: ");
		studentNum = input.nextLine();
		System.out.print("����: ");
		age = input.nextInt();

		System.out.println("#############################");
		System.out.printf("    %s %s %s\n", univ, major, studentNum);
		System.out.printf("        %s (%d) \n", name, age);
		System.out.println("#############################");
		
		input.close();
		
	}

}
