package chap2_example;
import java.util.Scanner;

public class Example13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score, year;
		System.out.print("������ �Է��ϼ���: ");
		score=input.nextInt();
		System.out.print("�г��� �Է��ϼ���: ");
		year=input.nextInt();
		
		if(year==4) {
			if(score>=70) System.out.println("�հ�");
			else System.out.println("���հ�");
		}
		else {
			if(score>=60) System.out.println("�հ�");
			else System.out.println("���հ�");
		}
		input.close();
		/*
		 * if(score>=60){
		 * 	    if(year!=4) System.out.println("�հ�");
		 *      else if(score>=70) System.out.println("�հ�");
		 *      else System.out.println("���հ�");
		 * }
		 * else {
		 *      System.out.println("���հ�");
		 * } 
		 */
	}
}
