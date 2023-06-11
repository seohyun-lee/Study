
import java.util.Scanner;

class Solution{
	public static int[] solution(long n) {
		String s = Long.toString(n); //Long 클래스의 toString()메소드로 n을 String으로 s에 넣는다.
		//toString()은 대상 값이 null이면 NPE를 발생시킨다.
		//String s = String.valueOf(n);와 비교하기 - valueOf()는 파라미터가 null이면 문자열 "null"을 만들어서 반환한다.
		String[] arr = s.split(""); //split()메소드. s를 글자단위로 쪼개어 배열에 넣을 수 있음.
		int[] answer = new int[s.length()]; //answer배열을 s의 길이만큼의 크기로 생성한다.
		for(int i=0; i<s.length(); i++) {  //i를 s.length()번 반복
			answer[i]=Integer.valueOf(arr[s.length()-i-1]); //Integer클래스의 valueOf()메소드를 사용해 정수값으로 넣기
		}
		return answer;
	}
}

public class Prgrms_NaturalNumberReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int[] answer = Solution.solution(n);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]);
		}
	}

}
