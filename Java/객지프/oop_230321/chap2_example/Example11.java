package chap2_example;
import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �Է��Ͻÿ�: ");
		int number = input.nextInt();
		
		if(number%3==0) {
			System.out.println("3�� ����Դϴ�.");
		}
		else{
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		input.close();
	}

}
