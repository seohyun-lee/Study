package �⸻����;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ����ó��_Main {

	private static Scanner input = new Scanner(System.in);
	
	public static int getInt(String msg) {
		int num = 0;
		while(true){
			try {
				System.out.println(msg);
				num=input.nextInt();
				//�� �ȿ��� ���� �߻��� �ڵ����� catch�� �̵��Ѵ�.
			} catch(InputMismatchException e) {
				System.out.println("���� ������ �ƴմϴ�");
				e.printStackTrace();
				input.nextLine(); //���� �Ծ��
				continue; //break���� �ʱ� ���ؼ� �ۼ���
			}
			break;
		}
		return num;
	}
	
	public static void main1() {
		int num1= getInt("����1�Է�"); //static method�ϱ� ������ �����ʿ����
		int num2= getInt("����2�Է�");
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
		double d1 = getDouble("�Ǽ�1�Է�");
		double d2 = getDouble("�Ǽ�2�Է�");
		System.out.println(d1+d2);
	}
	
	public static void main (String[] args) {
		main1();
		main2();
	}
}
