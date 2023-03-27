package chap2_example;
import java.util.Scanner;


public class Example05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int time, hour, min, sec;
		System.out.println("몇 초를 계산할까요? ");
		time = input.nextInt();
		hour = time/3600;		//(time/60)/60
		min = (time%3600)/60;	//(time/60)%60
		sec = time%60;
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.", time, hour, min, sec);
		input.close();
	}

}
