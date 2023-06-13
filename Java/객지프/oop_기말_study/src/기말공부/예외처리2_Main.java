package �⸻����;

import java.util.Scanner;

public class ����ó��2_Main {

	private static Scanner input = new Scanner(System.in);
	
	public static int readInt() {
		String number; //String���� nextLine()���� ������ NumberFormatException�� �Ű����Ѵ�.
		boolean correct = false;
		int value = 0;
		while(!correct) {
			try {
				System.out.println("input(integer): ");
				number = input.nextLine();
				value=Integer.parseInt(number);
				correct=true;
			} catch(NumberFormatException e) {
				System.out.println("Input error: re-enter");
			}
		}
		return value;
	}
	
	public static void main(String[] args) {
		int i = readInt();
		System.out.println(i);
	}
}
