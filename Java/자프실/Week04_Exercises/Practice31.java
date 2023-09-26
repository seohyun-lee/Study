
public class Practice31 {

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
	
	public static void main(String[] args) {
		int[] randNumArr = new int[20];
		for (int i = 0; i < 20; i++) {
			randNumArr[i] = (int)(Math.random() * 100); //0~99
		}
		displayArray(randNumArr);
		System.out.println("가장 큰 수는 " + findMax(randNumArr) + "입니다.");
	}

}
