package chap2_example;
import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = input.nextInt();
		if(score>=80) {
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		}
		input.close();
	}

}
