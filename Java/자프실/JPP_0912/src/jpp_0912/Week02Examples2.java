package jpp_0912;

import java.util.Scanner;

public class Week02Examples2 {
	
	//if문
	public void example01() {
		int num = 10;
		
		if (num > 15) {
			System.out.println("숫자가 15보다 큽니다.");
		}
		System.out.println("이 문장은 if문 외부에 있습니다.");
	}
	
	//(예제 4-1) 투표가 가능한 나이 판별하기
	public void if01() {
		System.out.println("당신의 나이를 입력하세요.");
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if (age >= 18) {
			System.out.println("당신의 나이는 18세 이상입니다.");
			System.out.println("당신은 투표할 자격이 있습니다.");
		}
		System.out.println("이 문장은 if문 외부에 있습니다.");
		s.close();
	}
	
	//if-else문
	public void example02() {
		int num = 120;

		if ( num < 50) {
			System.out.println("숫자가 50보다 작습니다.");
		}
		else {
			System.out.println("숫자가 50보다 큽니다.");
		}
	}
	
	//(예쩨 4-2) 짝수, 홀수 판별하기
	public void if02() {
		System.out.println("숫자를 입력하세요.");		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();		
		if (num % 2 == 0) {
			System.out.println(num + "은 짝수입니다.");
		}
		else {
			System.out.println(num + "은 홀수입니다.");
		}
		System.out.println("이 문장은 if문 외부에 있습니다.");
		s.close();
	}
	
	//else if문 사용하는 조건문
	public void example03() {
		int num = 20;

		if (num == 10) {
			System.out.println("숫자가 10입니다.");
		}
		else if (num == 15) {  System.out.println("숫자가 15입니다.");
		}
		else if (num == 20) {
			System.out.println("숫자가 20입니다.");
		}
		else {
			System.out.println("숫자가 존재하지 않습니다.");
		}
	}
	//(예제 4-3) 점수에 따라 학점 부여하기
	public void if03() {
		System.out.println("점수를 입력하세요.");

		Scanner s = new Scanner(System.in);
		int grade = s.nextInt();

		if (grade >= 90) {
			System.out.println("A 학점");
		}
		else if (grade >= 80) {
			System.out.println("B 학점");
		}
		else if (grade >= 70) {
			System.out.println("C 학점");
		}
		else if (grade >= 60) {
			System.out.println("D 학점");
		}
		else {
			System.out.println("F 학점");
		}
		s.close();
	}

	//중첩 if~else문 사용 예시
	public void example04() {
		int num = 70;
		if (num < 100) {
			System.out.println("숫자가 100보다 작습니다.");
		}
		if (num > 50) {
			System.out.println("숫자가 50보다 큽니다.");
		}
	}
	
	//(예제 4-4) 첫 번째로 입력된 값이 최댓값인지 판별하기
	public void if04() {
		System.out.println("3개의 숫자를 입력하세요.");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt(); 
		int z = s.nextInt();
		if (x > y) {
			if (x > z) {
				System.out.println(x +"는 가장 큰 정수입니다.");
			}
			else {
				System.out.println(x +"는 가장 큰 정수가 아닙니다.");
			}
		}
		else {
			System.out.println(x +"는 가장 큰 정수가 아닙니다.");
		}
		s.close();
	}
	
	//switch문 사용 예시
	public void example06() {
		char grade = 'B';
		switch (grade) {
			case 'A':
				System.out.println("매우 우수");
				break;
			case 'B':
				System.out.println("우수");
				break;
			case 'C':
				System.out.println("좋음");
				break;
			case 'D':
				System.out.println("좀 더 열심히");
				break;
			case 'F':
				System.out.println("미흡");
				break;
			default:
				System.out.println("잘못된 등급");
		}
	}
	
	//(예제 4-5) switch문을 활용하여 점수에 따라 학점 부여하기
	public void switch01() {
		System.out.println("점수를 입력하세요.");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		switch (num / 10) {
			case 10 :
			case 9 :
				System.out.println("A 학점");
				break;
			case 8:
				System.out.println("B 학점");
				break;
			case 7:
				System.out.println("C 학점");
				break;
			case 6:
				System.out.println("D 학점");
				break;
			default:
				System.out.println("F 학점");
				break;
		}
		s.close();
	}

	//for문 사용 예시
	public void example07() {
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}
	
	//(예제 4-6)입력받은 5개 숫자합 구하기
	public void loop01() {
		int sum = 0;
		System.out.println("5개의 숫자를 입력하세요.");
		for (int n = 1; n <= 5; n++) {
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			sum += num;	// sum = sum + num과 같은 코드
			s.close();
		}
		System.out.println("합계 : " + sum);
	}
	
	//while문 사용 예시
	public void example08() {
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
	}

	//(예제 4-7) 짝수와 홀수 판별 지속 여부 확인하기
	public void loop02() {
		Scanner s = new Scanner(System.in);
		int choice = 1;
		while (choice == 1) {
			int a;
			System.out.println("숫자를 입력하세요.");
			a = s.nextInt();
			
			if (a % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0을 입력하세요.");
			choice = s.nextInt();
		}
		System.out.println("모든 숫자를 확인했습니다.");
		s.close();
	}
	
	//do-while문
	public void example09() {
		int i = 1;
		do {
			System.out.println("Hello World");  i++;
		} while ( i < 6 );
	}
	
	//(예제 4-8) 10보다 큰 수부터 10까지의 합 구하기
	public void loop03() {
		Scanner s = new Scanner(System.in);
		System.out.println("10보다 큰 숫자를 입력하세요.");
		int x = s.nextInt();
		int sum = 0;
		do {
			sum += x;
			x--;
		} while (x >= 10);
		System.out.println("합계 : " + sum);
		s.close();
	}
	
	//중첩 반목문
	public void example10() {
		for (int i = 2; i <= 4; i++) {
			System.out.println("구구단 " + i +" 단");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}
	
	//실습 - 중첩 반목문 코드 변형해 구구단을 옆으로 찍어보자
	public static void ninenine() {
		for (int j = 0; j <= 10; j++) {
			for (int i = 2; i <= 4; i++) {
				if (j == 0)
					System.out.print("구구단 " + i +" 단\t");
				else
					System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.print("\n");
		}
	}
	
	//실습 - (예제 4-9) 별표로 역삼각형 만들기 변형해 마름모 출력
	public static void loop04() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("길이 : ");
		int len = s.nextInt();
		//추가한 조건식 (아래의 조건문 괄호 안 내용만 변경함)
		for (int i = len - 1; i > 0; i--) { //i가 0일 때 최대 길이 출력했었으니 제외해야 함
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2*len)-1-(i*2); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2*len)-1-(i*2); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		s.close();
	}
	
	/*public static void main(String[] args) {
		//ninenine();
		loop04();
	}*/
	
	//6. 사용자 정의 메서드 생성
	
	//반환 유형이 있는 메서드 | 입력=매개변수, 출력=반환유형
	
	//입력X 출력O 메서드
	public static String example02_print() {
		return "Hi";
	}
	
	//입력O 출력O 메서드 
	public static int example03_add(int x, int y) {
		return x + y;
	}


	//(예제 5-2) 매개변수가 없고 반환값이 있는 메서드 선언
	public static int method03_div( ) {
		int a = 10, b = 5;
		int result = a / b;
		return result;
	}
	
	//입력X 출력X 메서드
	public static void example04_print() {
		System.out.println("Hi! Java");
	}
	
	//입력O 출력X 메서드
	public static void example05_add(int x, int y) {
		System.out.println(x +"(와)과 "+ y +"의 합은 "+ (x + y) +"입니다.");
	}

	//메소드 오버로딩. 매개변수의 자료형이나 개수가 다름. 반드시 매개변수가 달라야 오버로딩임.
	//
}

//메서드 오버로딩 예시
class Example06 {
	public static void calculate(int x, int y) {
		System.out.println(x * y);
	}
	public static void calculate(int x) {
		System.out.println(x * x);
	}
	public static void calculate(int x, double y) {
		System.out.println(x * y);
	}
	public static void calculate(double x) {
		System.out.println(x * x);
	}
	public static void main(String[] args) {
		calculate(2, 3);
		calculate(2, 3.14);
		calculate(2);
		calculate(2.5);
	}
}
