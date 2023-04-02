package chap2_example;
import java.util.Scanner;

public class Example13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score, year;
		System.out.print("점수를 입력하세요: ");
		score=input.nextInt();
		System.out.print("학년을 입력하세요: ");
		year=input.nextInt();
		
		if(year==4) {
			if(score>=70) System.out.println("합격");
			else System.out.println("불합격");
		}
		else {
			if(score>=60) System.out.println("합격");
			else System.out.println("불합격");
		}
		input.close();
		/*
		 * if(score>=60){
		 * 	    if(year!=4) System.out.println("합격");
		 *      else if(score>=70) System.out.println("합격");
		 *      else System.out.println("불합격");
		 * }
		 * else {
		 *      System.out.println("불합격");
		 * } 
		 */
	}
}
