
import java.util.Scanner;

public class Prgrms_NoSameNumber {
    public static int[] solution(int []arr) {
        int[] answer = {};
        int[] arr2 = new int[arr.length];
        arr2[0]+=arr[0];
        int index=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr2[index]){
                index++;
                arr2[index]+=arr[i];
            }
        }
        
        answer = new int[index+1];
        for(int i=0; i<=index; i++){
            answer[i] = arr2[i];
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] arr = new int[s.length()];
		int index=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<58) {
				arr[index]=s.charAt(i)-48;
				index++;
			}
		}
		
		int[] arr2 = new int[index];
		for(int i=0; i<index; i++) {
			arr2[i]=arr[i];
		}
		
		int[] answer;
		answer = solution(arr2);
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]);
			if(i!=answer.length-1) System.out.print(", ");
		}
	}

}
