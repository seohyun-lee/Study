
package week09;
/* //예제 3-14
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("a/b를 계산합니다.");
		System.out.print("a 입력: ");
		a = sc.nextInt();
		System.out.print("b 입력: ");
		b = sc.nextInt();
		System.out.println("a/b 계산 시 몫은 "+a/b+"이고 나머지는 "+a%b+"입니다.");
		sc.close();
	}

}*/

/* //예제 3-15
import java.util.Scanner;

public class DevideByZeroHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			try {
				System.out.println("a/b="+a/b); //ArithmeticException 예외 발생
				break; //정상적인 나누기 후 while문 벗어남
			}
			catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다!");
			}
		}
		sc.close();
		}
	}
}*/

/* //예제 3-16 범위를 벗어난 배열의 접근

public class ArrayException {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0]=0;
		try {
			for(int i=0; i<5; i++) {
				intArray[i+1]=i+1+intArray[i]; //여기서 i가 4일 때 예외 발생
				System.out.println("intArray["+i+"]="+intArray[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
}*/

/* //예제 3-17 입력오류시 발생하는 예외

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			System.out.println(i+">>");
			try {
				n = sc.nextInt(); //사용자가 문자를 입력하면 예외 발생
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next(); //입력 스트림에 있는 정수가 아닌 토큰 버리기
				i--; //i 감소시키기
				continue; //sum 더하지 않도록 넘기기
			}
			sum += n;
			// 또는, sum+=n을 try 안에 넣으면 continue를 쓸 필요가 없다
		}
		System.out.println("합은 "+sum);
		sc.close();
	}
}*/

/* //3-18 정수가 아닌 문자열을 정수로 변환할 때 예외 발생 (NumberFormatException)
import java.util.Scanner;
import java.util.InputMismatchException;

public class NumException {
	public static void main(String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		int i=0;
		try {
			for (i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				//3.141592를 정수로 변환할 때 NumberFormatException 발생
				System.out.println("숫자로 변환된 값은 "+j);
			}
		} catch (NumberFormatException e) {
			System.out.println(stringNumber[i]+"는 정수로 변환할 수 없습니다.");
		}
	}
}*/

/* //ExceptionHandling.java
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling {
	
	public static int quotient(int a, int b) throws ArithmeticException {
		//throws 얘를 쓰든 안쓰든 컴파일 에러 발생 x. Unchecked Error라서.
		//얘를 씀으로써 메소드가 던질 수 있는 예외를 명시한다. 메소드를 호출한 쪽에서 예외를 처리.
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			try {
				System.out.println("Enter a: ");
				int a = sc.nextInt();	//문자 입력시 InputMismatch
				System.out.println("Enter b: ");
				int b = sc.nextInt();	//마찬가지
				System.out.println("몫은: "+quotient(a, b)); //b=0일때 Arithmetic
				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (InputMismatchException e) {
				System.out.println("You must enter integers");
				sc.next(); //InputMismatchException의 경우엔 버퍼 비워주는걸 꼭 신경쓰자.
			}
		}
		sc.close();
	}
}*/

/*//PrintException1
public class PrintException1 {
	public static void main(String[] args) {
		try {
			int a = 100/0;
		} catch (ArithmeticException ex) {
			System.out.println(ex); //java.lang.ArithmeticException: / by zero
			System.out.println(ex.toString()); //java.lang.ArithmeticException: / by zero
			System.out.println(ex.getMessage()); // / by zero
			ex.printStackTrace();
			//java.lang.ArithmeticException: / by zero
			//		at week09.PracticeWeek09.main(PracticeWeek09.java:172)
			System.out.println(ex.getStackTrace()); //[Ljava.lang.StackTraceElement;@123a439b
		} finally {
			System.out.println("finally block");
		} System.out.println("End of main");
	}
}*/

/*//PrintException2 - ex.getMessage()
public class PrintException2 {
	public static void main(String[] args) {
		try {
			int a=100/0; //예외 발생
		}
		catch (ArithmeticException ex) {
			System.out.println(ex.getMessage()); //예외 잡아서 메소드 호출
			// / by zero
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("End of main");
	}
}*/

/* //PrintException3 - ex.printStackTrace()
public class PrintException3 {
	public static void main(String[] args) {
		f();
	}
	static void f() {
		g();
	}
	static void g() {
		h();
	}
	static void h() {
		try {
			int a = 100 / 0; //예외발생
		} catch (ArithmeticException ex) {
			ex.printStackTrace(); //출력함
		}
	}
}*/
/* 예외 발생 시 메소드 호출 스택의 상태: {main(), f(), g(), h()} <-각각이 stack frame
 * h에서 발생했으므로 h->g->f->main 순서대로 탈출
java.lang.ArithmeticException: / by zero
	at week09.PracticeWeek09.h(PracticeWeek09.java:201)
	at week09.PracticeWeek09.g(PracticeWeek09.java:197)
	at week09.PracticeWeek09.f(PracticeWeek09.java:194)
	at week09.PracticeWeek09.main(PracticeWeek09.java:191)
*/

/* //PrintException4 - ex.getStackTrace()
public class PrintException4 {
	public static void main(String[] args) {
		f();
	}
	static void f() {
		g();
	}
	static void g() {
		h();
	}
	static void h() {
		try {
			int a = 100 / 0; //예외발생
		} catch (ArithmeticException ex) {
			StackTraceElement[] arr;
			arr = ex.getStackTrace();
			for (StackTraceElement ele : arr) {
				System.out.printf("%s\t%s\t%s\t%d\n",
						ele.getClassName(),
						ele.getMethodName(),
						ele.getFileName(),
						ele.getLineNumber());
			}
		}
	}
}*/
/*
week09.PracticeWeek09	h	PracticeWeek09.java	223
week09.PracticeWeek09	g	PracticeWeek09.java	219
week09.PracticeWeek09	f	PracticeWeek09.java	216
week09.PracticeWeek09	main	PracticeWeek09.java	213
 */


/* //ThrowException1 - 에외 객체 생성
public class PracticeWeek09 {
	public static void main(String[] args) {
		f();
		System.out.println("This is main()");
	}
	static void f() {
		Exception ex = new Exception();
		ex.printStackTrace();
		ex=new Exception("test exception"); //메시지는 생성자의 인자
		ex.printStackTrace();
		ex=new ArithmeticException();
		ex.printStackTrace();
		ex=new ArithmeticException("+-* /");
		ex.printStackTrace();
	}
}*/

/*//ThrowException
public class ThrowException {
	public static void main(String[] args) {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Exception is caught.");
		}
		//f();만 적어두면, f가 Exception 예외를 던질 수 있다고 선언했는데 그에 대한 대응을 하지 않음.
		//try-catch로 묶어준 현재- Exception is caught.
		System.out.println("This is main().");
	}
	static void f() throws Exception {
		Exception ex = new Exception();
		throw ex; //throw로 던지면 이 위치에서 예외가 발생한다. catch하지 않았으므로 호출한 쪽으로 예외를 던진다.
		//그런데 Exception 클래스는 checked Exception임.
		//현재 메소드에 throws 선언을 추가하고, 호출한 쪽에는 try-catch 혹은 throws 하라고 함.
	}
}*/


/* //Rethrow
public class Rethrow {
	public static void main(String[] args) {
		try {
			f();
		} catch (Exception ex) {
			System.out.println("Exception from g() is caught in main()");
			ex.printStackTrace(); 
		}
		System.out.println("main.");
	}
	static void f() throws Exception {
		try {
			g();
		} catch (Exception ex) {
			System.out.println("Exception from g() is caught in f()"); //받음
			throw ex; //catch한 예외를 또다시 던짐 (새 예외 x!!)
		}
	}
	static void g() throws Exception { //g()에서 예외 객체를 던짐
		throw new Exception("Exception generated in g().");
	}
}*/


/* //StackUnwinding
public class PracticeWeek09 {
	public static void main(String[] args) {
		try {
			f();
		}
		catch (Exception ex) {
			Exception ex3 = new Exception();
			System.out.println("main(): ");
			ex3.printStackTrace(); //StackTrace 요소 출력: 스택의 main 출력
		}
	}
	static void f() throws Exception {
		try {
			g();
		}
		catch (Exception ex) {
			Exception ex2 = new Exception();
			System.out.println("f(): ");
			ex2.printStackTrace(); //StackTrace 요소 출력: 스택에 main(아래), f(위) <- f, main 순으로 출력
			throw ex2;
		}
		System.out.println("This is f()");
	}
	static void g() throws Exception {
		Exception ex = new Exception();
		System.out.println("g(): ");
		ex.printStackTrace(); //StackTrace 요소 출력: 스택에 main(아래), f, g(위) <- g, f, main 순으로 출력
		throw ex;
	}
}*/


/* //ChainedException
import java.io.IOException;
public class PracticeWeek09
{
	public static void main(String[] args)
	{
		try {
			f();
		} catch (Exception ex) {
			System.out.print("main(): ");
			ex.printStackTrace(); //f에서 발생한 예외, 근데 g에서 발생한 예외가 연결됨 
		}
	}
	static void f() throws Exception
	{
		try {
			g();
		}
		catch (IOException ex) {
			throw new Exception(ex); //IOException객체를 인자로 전달, 새 객체 Exception 생성
			//catch한 예외 객체를 새로운 예외 객체에 연결해 같이 던진다.
			//새로운 예외 객체를 받은 쪽은 이전 발생 예외 확인 가능.
			//예외 객체 연결을 위한 생성자: new Exception(객체), new Exception("메시지", 객체);
		}
	}
	static void g() throws IOException
	{
		throw new IOException();
	}
}*/
/*
main(): java.lang.Exception: java.io.IOException
	at week09.PracticeWeek09.f(PracticeWeek09.java:356)
	at week09.PracticeWeek09.main(PracticeWeek09.java:344)
Caused by: java.io.IOException
	at week09.PracticeWeek09.g(PracticeWeek09.java:361)
	at week09.PracticeWeek09.f(PracticeWeek09.java:353)
	... 1 more
*/
