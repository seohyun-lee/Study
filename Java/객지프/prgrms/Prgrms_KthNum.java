package chap5;

import java.util.Arrays;

public class Prgrms_KthNum {
	//Arrays.sort() 함수 사용하기 --> toIndex 이전의 index까지 정렬한다
	/* public static void sort(int[] a, int fromIndex, int toIndex)*/

	public static int[] solution(int[] array, int[][] commands) {
	    int[] answer = new int[commands.length];
	    int[] tempArray;
	    for(int i=0; i<commands.length; i++) {
	    	tempArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
	    	Arrays.sort(tempArray);
	    	answer[i] = tempArray[commands[i][2]-1];
	    }
	    return answer;
	    
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
