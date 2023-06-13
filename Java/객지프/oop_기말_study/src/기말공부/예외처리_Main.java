package 기말공부;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 예외처리_Main {

	private static Scanner input = new Scanner(System.in);
	
	public static int getInt(String msg) {
		int num = 0;
		while(true){
			try {
				System.out.println(msg);
				num=input.nextInt();
				//이 안에서 예외 발생시 자동으로 catch로 이동한다.
			} catch(InputMismatchException e) {
				System.out.println("정수 형식이 아닙니다");
				e.printStackTrace();
				input.nextLine(); //엔터 먹어가기
				continue; //break되지 않기 위해서 작성함
			}
			break;
		}
		return num;
	}
	
	public static void main1() {
		int num1= getInt("정수1입력"); //static method니까 생성자 만들필요없음
		int num2= getInt("정수2입력");
		System.out.println(num1+num2);
		
	}
	
	public static double getDouble(String msg) {
		double value;
		String num;
		while(true) {
			try {
				System.out.println(msg);
				num = input.nextLine();
				value=Double.parseDouble(num);
			} catch (NumberFormatException e) {
				System.out.println();
				continue;
			}
			break;
		}
		return value;
	}
	
	public static void main2() {
		double d1 = getDouble("실수1입력");
		double d2 = getDouble("실수2입력");
		System.out.println(d1+d2);
	}
	
	public static void main (String[] args) {
		main1();
		main2();
	}
}
