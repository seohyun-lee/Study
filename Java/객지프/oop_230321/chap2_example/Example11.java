package chap2_example;
import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("수를 입력하시오: ");
		int number = input.nextInt();
		
		if(number%3==0) {
			System.out.println("3의 배수입니다.");
		}
		else{
			System.out.println("3의 배수가 아닙니다.");
		}
		input.close();
	}

}
