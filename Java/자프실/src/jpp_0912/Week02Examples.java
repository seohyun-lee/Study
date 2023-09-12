package jpp_0912;

import java.util.Scanner;

//week02 37p: 증가 및 감소 연산자 사용 예시
public class Week02Examples {
	public void example05() {
		int x = 10;
		System.out.println(x++); //10출력, 11
		System.out.println(++x); //12
		System.out.println(x--); //12 출력, 11
		System.out.println(--x); //10
	}
	
	public void operator05() {
		int a = 10, b = 10, c = 10, d = 10;
		System.out.println("a++ => " + (a++));
		System.out.println("a => " + a);
		System.out.println("++b => " + (++b));
		System.out.println("c-- => " + (c--));
		System.out.println("--d => " + (--d));
	}
	
	public void example06() {
		int i = 100;
		long l = i;
		float f = l; System.out.println(i); System.out.println(l); System.out.println(f);
	}
	
	
	public void typeConversion1() {
		int x = 10;
		double y = 3.0;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
	}
	
	//캐스팅 형 변환 사용 예시
	public void example07() {
		double d = 3.14;
		long l = (long)d; int i = (int)l;
		System.out.println(d); System.out.println(l); System.out.println(i);
	}

	public void typeConversion2() {
		int x = 10;
		double y = 3.0;
		System.out.println(x / y);
		System.out.println(x / (int) y);
		System.out.println((int) (x / y));
	}
	
	public void example08() {
		Scanner input = new Scanner(System.in);
		System.out.println("당신의 이름을 입력하세요.");
		String name = input.nextLine();
		System.out.println("당신의 이름 : " + name);
		input.close();
	}
	
	public void input() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("정숫값 입력하기");
		int n = s1.nextInt();
		System.out.println("실숫값 입력하기");
		double db = s1.nextDouble();
		System.out.println("정숫값 : " + n);
		System.out.println("실숫값 : " + db);
		s1.close();
	}
}