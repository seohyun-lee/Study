package prgrms;

import java.util.Scanner;

public class WarmingUp_2 {
	
	public static void show_grade (int score) { //매개변수 넣어야 함
		String grade;
		if(score >=90) grade="A";
		else if(score>=80) grade="B";
		else if(score>=70) grade="C";
		else if(score>=60) grade="D";
		else grade="F";
		if(score>=60) {
			if(score%10>=5||score==100) grade+="+"; //100인 경우 꼭 놓치지 말기
			else grade+="-";
		}
		System.out.println(grade);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		show_grade(score);

	}

}
