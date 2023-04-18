package prgrms;

import java.util.Scanner;

public class WarmingUp_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%7==0) {
			if(n>=1000&&n<2000) System.out.println("I Love It!"); //1000이상 2000미만의 7의배수
			else if (n<1000) System.out.println("I Like It!"); //1000미만의 7의배수
			else System.out.println("!"); //2000이상의 7의배수는 정해진 조건에 해당되지 않음
		}
		else System.out.println("!"); //정해진 조건에 해당되지 않는경우
		sc.close();
	}
}
