
package week09;
/* //���� 3-14
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("a/b�� ����մϴ�.");
		System.out.print("a �Է�: ");
		a = sc.nextInt();
		System.out.print("b �Է�: ");
		b = sc.nextInt();
		System.out.println("a/b ��� �� ���� "+a/b+"�̰� �������� "+a%b+"�Դϴ�.");
		sc.close();
	}

}*/

/* //���� 3-15
import java.util.Scanner;

public class DevideByZeroHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			try {
				System.out.println("a/b="+a/b); //ArithmeticException ���� �߻�
				break; //�������� ������ �� while�� ���
			}
			catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�!");
			}
		}
		sc.close();
		}
	}
}*/

/* //���� 3-16 ������ ��� �迭�� ����

public class ArrayException {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0]=0;
		try {
			for(int i=0; i<5; i++) {
				intArray[i+1]=i+1+intArray[i]; //���⼭ i�� 4�� �� ���� �߻�
				System.out.println("intArray["+i+"]="+intArray[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� ������ ������ϴ�.");
		}
	}
}*/

/* //���� 3-17 �Է¿����� �߻��ϴ� ����

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3�� �Է�");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			System.out.println(i+">>");
			try {
				n = sc.nextInt(); //����ڰ� ���ڸ� �Է��ϸ� ���� �߻�
			} catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				sc.next(); //�Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū ������
				i--; //i ���ҽ�Ű��
				continue; //sum ������ �ʵ��� �ѱ��
			}
			sum += n;
			// �Ǵ�, sum+=n�� try �ȿ� ������ continue�� �� �ʿ䰡 ����
		}
		System.out.println("���� "+sum);
		sc.close();
	}
}*/

/* //3-18 ������ �ƴ� ���ڿ��� ������ ��ȯ�� �� ���� �߻� (NumberFormatException)
import java.util.Scanner;
import java.util.InputMismatchException;

public class NumException {
	public static void main(String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		int i=0;
		try {
			for (i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				//3.141592�� ������ ��ȯ�� �� NumberFormatException �߻�
				System.out.println("���ڷ� ��ȯ�� ���� "+j);
			}
		} catch (NumberFormatException e) {
			System.out.println(stringNumber[i]+"�� ������ ��ȯ�� �� �����ϴ�.");
		}
	}
}*/

/* //ExceptionHandling.java
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling {
	
	public static int quotient(int a, int b) throws ArithmeticException {
		//throws �긦 ���� �Ⱦ��� ������ ���� �߻� x. Unchecked Error��.
		//�긦 �����ν� �޼ҵ尡 ���� �� �ִ� ���ܸ� ����Ѵ�. �޼ҵ带 ȣ���� �ʿ��� ���ܸ� ó��.
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			try {
				System.out.println("Enter a: ");
				int a = sc.nextInt();	//���� �Է½� InputMismatch
				System.out.println("Enter b: ");
				int b = sc.nextInt();	//��������
				System.out.println("����: "+quotient(a, b)); //b=0�϶� Arithmetic
				break;
			} catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
			} catch (InputMismatchException e) {
				System.out.println("You must enter integers");
				sc.next(); //InputMismatchException�� ��쿣 ���� ����ִ°� �� �Ű澲��.
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
			int a=100/0; //���� �߻�
		}
		catch (ArithmeticException ex) {
			System.out.println(ex.getMessage()); //���� ��Ƽ� �޼ҵ� ȣ��
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
			int a = 100 / 0; //���ܹ߻�
		} catch (ArithmeticException ex) {
			ex.printStackTrace(); //�����
		}
	}
}*/
/* ���� �߻� �� �޼ҵ� ȣ�� ������ ����: {main(), f(), g(), h()} <-������ stack frame
 * h���� �߻������Ƿ� h->g->f->main ������� Ż��
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
			int a = 100 / 0; //���ܹ߻�
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


/* //ThrowException1 - ���� ��ü ����
public class PracticeWeek09 {
	public static void main(String[] args) {
		f();
		System.out.println("This is main()");
	}
	static void f() {
		Exception ex = new Exception();
		ex.printStackTrace();
		ex=new Exception("test exception"); //�޽����� �������� ����
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
		//f();�� ����θ�, f�� Exception ���ܸ� ���� �� �ִٰ� �����ߴµ� �׿� ���� ������ ���� ����.
		//try-catch�� ������ ����- Exception is caught.
		System.out.println("This is main().");
	}
	static void f() throws Exception {
		Exception ex = new Exception();
		throw ex; //throw�� ������ �� ��ġ���� ���ܰ� �߻��Ѵ�. catch���� �ʾ����Ƿ� ȣ���� ������ ���ܸ� ������.
		//�׷��� Exception Ŭ������ checked Exception��.
		//���� �޼ҵ忡 throws ������ �߰��ϰ�, ȣ���� �ʿ��� try-catch Ȥ�� throws �϶�� ��.
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
			System.out.println("Exception from g() is caught in f()"); //����
			throw ex; //catch�� ���ܸ� �Ǵٽ� ���� (�� ���� x!!)
		}
	}
	static void g() throws Exception { //g()���� ���� ��ü�� ����
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
			ex3.printStackTrace(); //StackTrace ��� ���: ������ main ���
		}
	}
	static void f() throws Exception {
		try {
			g();
		}
		catch (Exception ex) {
			Exception ex2 = new Exception();
			System.out.println("f(): ");
			ex2.printStackTrace(); //StackTrace ��� ���: ���ÿ� main(�Ʒ�), f(��) <- f, main ������ ���
			throw ex2;
		}
		System.out.println("This is f()");
	}
	static void g() throws Exception {
		Exception ex = new Exception();
		System.out.println("g(): ");
		ex.printStackTrace(); //StackTrace ��� ���: ���ÿ� main(�Ʒ�), f, g(��) <- g, f, main ������ ���
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
			ex.printStackTrace(); //f���� �߻��� ����, �ٵ� g���� �߻��� ���ܰ� ����� 
		}
	}
	static void f() throws Exception
	{
		try {
			g();
		}
		catch (IOException ex) {
			throw new Exception(ex); //IOException��ü�� ���ڷ� ����, �� ��ü Exception ����
			//catch�� ���� ��ü�� ���ο� ���� ��ü�� ������ ���� ������.
			//���ο� ���� ��ü�� ���� ���� ���� �߻� ���� Ȯ�� ����.
			//���� ��ü ������ ���� ������: new Exception(��ü), new Exception("�޽���", ��ü);
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
