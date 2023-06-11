// [기초-함수작성] 함수로 negative/zero/positive 출력하기

import java.util.Scanner;

public class C_1541 {

	public static void f(int n) {
		if(n>0)
			System.out.println("positive");
		else if(n==0)
			System.out.println("zero");
		else
			System.out.println("negative");		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		f(n);
	}

}
