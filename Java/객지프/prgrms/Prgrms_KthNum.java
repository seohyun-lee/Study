package chap5;

import java.util.Arrays;
//Arrays Ŭ������ Arrays.sort() �޼���, Arrays.copyOfRange() �޼��带 ���� �˰� �Ǿ���

//Arrays.sort() : toIndex ������ index���� �����Ѵ�
/* public static void sort(int[] a, int fromIndex, int toIndex) */
//Arrays.copyOfRange(���� �迭, ����, ��/*����X*/); ���� ���� ���� ���� ���Ե���X 

public class Prgrms_KthNum {
	
	public static int[] solution(int[] array, int[][] commands) {
	    int[] answer = new int[commands.length];
	    for(int i=0; i<commands.length; i++) {
	    	int[] tempArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
	    	Arrays.sort(tempArray);
	    	answer[i] = tempArray[commands[i][2]-1];
	    }
	    return answer;
	    
	   //��Ŭ�������� ���� �۵������� ���α׷��ӽ������� ��Ÿ�ӿ��� �� �ڵ�
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
