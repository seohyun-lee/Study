
import java.util.Arrays;
//Arrays 클래스와 Arrays.sort() 메서드, Arrays.copyOfRange() 메서드를 새로 알게 되었다

//Arrays.sort() : toIndex 이전의 index까지 정렬한다
/* public static void sort(int[] a, int fromIndex, int toIndex) */
//Arrays.copyOfRange(원본 배열, 시작, 끝/*포함X*/); 위의 경우와 같이 끝은 포함되지X 

public class Prgrms_KthNum {
	
	public static int[] solution(int[] array, int[][] commands) {
	    int[] answer = new int[commands.length];
	    for(int i=0; i<commands.length; i++) {
	    	int[] tempArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
	    	Arrays.sort(tempArray);
	    	answer[i] = tempArray[commands[i][2]-1];
	    }
	    return answer;
	    
	   //copyOfRange() 사용하지 않는 코드
	   /*
	   for(int i=0; i<commands.length; i++){
	        
	    	int[] tempArray = new int[commands[i][1]-commands[i][0]+1];
	        for(int j=0; j<commands[i][1]-commands[i][0]+1; j++) {
	        	tempArray[j]=array[commands[i][0]-1+j];
	        }
	    	Arrays.sort(tempArray);
	        answer[i]=tempArray[commands[i][2]-1];
	    }
	    return answer;
	    */
	}
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = solution(array, commands);
		for(int i=0; i<commands.length; i++){
			System.out.println(answer[i]);
		}
	}

}
