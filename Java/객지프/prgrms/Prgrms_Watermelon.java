package chap4;
import java.util.Scanner;

public class Prgrms_Watermelon {
	
	public static String solution(int n) {
        String answer = "";
        for(int i=0; i<n; i++){
            if(i%2==0)
                answer+="수";
            else
                answer+="박";
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(solution(n));
	}

}
