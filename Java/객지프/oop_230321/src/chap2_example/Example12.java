package chap2_example;
import java.util.Scanner;

public class Example12{
	public static void main(String[] args) {
		char grade, sig=' ';
		Scanner input = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 (0~100)");
		int score = input.nextInt();
		if(score>=90) grade='A';
		
		else if (score>=80) grade='B';
		else if (score>=70) grade='C';
		else if (score>=60) grade='D';
		else grade = 'F';
		
		if (score==100) sig='+';
		else if(score>=60&&score%10>=5) sig='+';
		else if(score>=60) sig='-';
		
		System.out.println("학점은 "+grade+sig+"입니다.");
		input.close();
	}
}
