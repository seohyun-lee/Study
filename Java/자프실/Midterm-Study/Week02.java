import java.util.Scanner;

public class Week02 {

	public static void main(String[] args) {
		/*//week02 예제들
		final double PI = 3.14;
		System.out.println("반지름 3인 원의 넓이는: " + 3*3*PI);
		
		int a = 10; short s = 2; byte b = 6; long l = 12345678999999L; //정수를 적으면 int형이라 int범위 넘는 수는 L 붙이기 필수
		System.out.println(a + " " + s + " " + b + " " + l);
		
		float f = 65.20f; double d= 8.765; //실수를 적으면 double형임. float는 뒤에 f붙여야함
		System.out.println("float: " + f + "  double: " + d);
		
		char v1='A'; char v2='B';
		System.out.println(v1+v2); 	//아스키코드로 연산
		System.out.println(v1+a);	//아스키코드로 연산
		System.out.println(v1+""+v2);
		System.out.println(123+123+123+"123");
		System.out.println("123"+123+123+123);
		
		String str = "Java";
		System.out.println(str+"Program");
		
		boolean bt = true;
		boolean bf = false;
		System.out.println(bt|bf);
		System.out.println(bt&bf);*/
		
		
		/*//증감 연산자
		int x=10;		
		System.out.println(x++ + ++x); // 10 + 12
		System.out.println(x++ + " " + x--); // 12 13
		System.out.println(x++ + " " + x + " "+ ++x + " "); //12 13 14
		System.out.println(x-- + " " + --x + --x); //14 1211
		System.out.println(x++ + " " + ++x + " " + x-- + " " + --x); //11 13 13 11
		
		int a=10;
		System.out.println("a++=>" + a++); //10 (->11)
		System.out.println("a=>" + a); //11
		System.out.println("++a=>" + ++a); //12
		System.out.println("a--=>" + a--); //12 (->11)
		System.out.println("--a=>" + --a); //10
		*/
		
		/*//자동형변환
		int i=100; long l=i; float f=l;
		System.out.println(i+" "+l+" "+f); //100 100 100.0
		i=10;
		f=3.0f; //소수 형태로 쓰면 double로 인식.. 또는 (float) 3.0;라고 하기
		System.out.println(i+f+" "+(i-f)+" "+i*f+" "+i/f);
		System.out.println(i-f+" "); //오류 안남
		//주의: 출력 시 문자열 뒤에 숫자를 연산하면- 즉 " "+i+f로 쓰면
		//i, f가 문자열로 인식되어 그냥 이어붙여진다.. (i+f)로 해야됨.*/
		
		/*//캐스팅 형변환
		double d=3.14;
		long l=(long)d;
		int i=(int)l;
		System.out.println(d+" "+l+" "+i); //3.14 3 3
		int x=10; double y=3.0;
		System.out.println(x/y + " " +x/(int)y + " " +(int)(x/y)); //3.3333333333333335 3 3
		*/
		
		/*//Scanner 클래스 사용하기
		Scanner input = new Scanner(System.in);
		System.out.print("당신의 이름은: ");
		System.out.println("사용자: " + input.nextLine()); //String 변수를 만들지 않아보았다
		System.out.println("실수값 입력하기: ");
		double d=input.nextDouble();
		System.out.println("실수값: " + d);
		System.out.println("정수 캐스팅: " + (int)d);*/
		
		/*//조건문
		if(10>15) System.out.println("10>15");
		else System.out.println("10<15");
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if(age >= 18) System.out.println("당신의 나이는 18세 이상입니다. 투표권을 가집니다.");
		else System.out.println("당신은 투표할 자격이 되지 않습니다.");
		
		System.out.print("짝홀 판별기: ");
		int n=s.nextInt();
		if(n%2==0) System.out.println("짝수");
		else System.out.println("홀수");*/
		
		/*//점수 따라 학점 부여
		Scanner s = new Scanner(System.in);
		int grade=s.nextInt();
		if (grade >= 90) System.out.println("A");
		else if (grade>=80) System.out.println("B");
		else if (grade>=70) System.out.println("C");
		else if (grade>=60) System.out.println("D");
		else System.out.println("F");*/
		
		/*
		Scanner s = new Scanner(System.in);
		int grade=s.nextInt();
		switch(grade/10) {
			case 10, 9:
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
		}*/
		
		/*
		int sum=0;
		for(int i=1;i<=5;i++) {
			sum+=i;
		}
		System.out.println(sum);*/
		
		/*
		Scanner s= new Scanner(System.in);
		int num=1;
		while(num>0) {
			num=s.nextInt();
			System.out.println(num);
			//0 이하 수 출력 후 종료
		}*/
		
		/*
		Scanner s=new Scanner(System.in);
		int x = s.nextInt();
		int sum=0;
		do {
			sum+=x;
			x--;
		}while(x>=10);
		System.out.println("합계: "+sum);*/
		
		/*//구구단
		for(int i=2; i<=4; i++) {
			System.out.println("구구단 "+i+"단");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}*/
		
		//역삼각형 별 찍기
		int len=5; //len이 높이 임
		for(int i=0; i<len; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*(len-i)-1; j++) { //최대 가로 별 개수가 2*len-1이다. 각 줄에 2씩 감소. 그러므로 j<2(len-i)-1
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
