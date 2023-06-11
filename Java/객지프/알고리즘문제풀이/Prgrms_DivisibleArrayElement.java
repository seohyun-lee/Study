import java.util.Arrays;
import java.util.Scanner;

class DAESolution {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer;
        int cnt=0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                cnt++;
            }
        }
        if(cnt==0){
            answer=new int[] {-1}; //배열 변수를 이미 선언했을 때는 이 형태로 써야함 int[]<-여기 배열크기 숫자 넣지않음 주의
            return answer;
        }
        
        answer = new int[cnt];
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answer[index]+=arr[i];
                index++;
            }
        }
        return answer;
    }
}

public class Prgrms_DivisibleArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] strarr = s.split(", ");
		int[] intarr=new int[strarr.length];
		for(int i=0; i<strarr.length; i++) {
			intarr[i] = Integer.parseInt(strarr[i]);
		}
		int d = sc.nextInt();
		int[] answer = DAESolution.solution(intarr, d);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]);
			if(i!=answer.length-1) {
				System.out.print(", ");
			}
		}
	}

}
