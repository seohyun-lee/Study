///1564 : [기초-함수작성] 함수로 최대공약수 리턴하기

import java.util.Scanner;

public class C_1564 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		//Euclidean Algorithm
		while(a > 0 && b > 0) {
			if(b > a) {
				int temp=a;
				a = b;
				b = temp;
			}
			a %= b;
		}
		System.out.println(b);
	}
}
