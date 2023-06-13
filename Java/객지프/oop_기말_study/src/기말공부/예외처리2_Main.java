package 기말공부;

import java.util.Scanner;

public class 예외처리2_Main {

	private static Scanner input = new Scanner(System.in);
	
	public static int readInt() {
		String number; //String으로 nextLine()으로 받으니 NumberFormatException을 신경써야한다.
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
