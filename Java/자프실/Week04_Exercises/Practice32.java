import java.util.Random;

public class Practice32 {

	public static void displayArray(int[] iArray) {
		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + "\t");
			if ((i + 1) % 10 == 0)
				System.out.println();
		}
		System.out.println();
	}
	
	public static int findMax(int[] iArray) {
		int max = iArray[0];
		for (int i = 1; i < iArray.length; i++) {
			if (iArray[i] > max)
				max = iArray[i];
		}
		return max;
	}
	
	public static int[] getData(int num) {
		int[] rslt = new int[num];
		Random r = new Random();
		for (int i = 0; i < num; i++) {
			rslt[i] = r.nextInt(100); //0~99
		}
		return rslt;
	}
	
	public static void main(String[] args) {
		int[] data = getData(20);
		displayArray(data);
		System.out.println("가장 큰 수는 " + findMax(data) + "입니다.");
	}

}
