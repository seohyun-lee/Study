package chap2_example;
import java.util.Scanner;


public class Example05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int time, hour, min, sec;
		System.out.println("�� �ʸ� ����ұ��? ");
		time = input.nextInt();
		hour = time/3600;		//(time/60)/60
		min = (time%3600)/60;	//(time/60)%60
		sec = time%60;
		System.out.printf("%d�ʴ� %d�ð� %d�� %d���Դϴ�.", time, hour, min, sec);
		input.close();
	}

}
