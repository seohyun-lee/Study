package chap2_example;
import java.util.Scanner;

public class Example15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int price=0;
		System.out.println("� Ŀ�Ǹ� �ֹ��Ͻðھ��?");
		String coffee = input.nextLine();
		switch(coffee) {
			case "����������":
			case "īǪġ��":
			case "ī���":
				price=3500;
				break;
			case "�Ƹ޸�ī��":
				price=2000;
				break;
			default:
				System.out.println("�޴��� �����ϴ�!");
		}
		if(price!=0) System.out.println(coffee+"�� "+price+"�� �Դϴ�.");
		input.close();
	}

}
