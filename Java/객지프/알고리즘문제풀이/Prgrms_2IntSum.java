
import java.util.Scanner;

public class Prgrms_2IntSum {
	
	public static long solution(int a, int b) {
        long answer = 0;
        int x = (a<b)? a:b;
        int y = (a<b)? b:a;
        for(int i = x; i <= y; i++){
            answer+=i;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println((long)solution(a,b));
		input.close();
	}

}
