import java.util.Scanner;

public class Practice04 {
	
	public static void setArray(int[][] ar) {
		for(int i = 0; i<ar.length; i++) {
			for(int j = 0; j<ar[i].length; j++) {
				ar[i][j] = (i+1)*100+(j+1);
			}
		}
	}
	
	public static void showArray(int[][] ar) {
		for(int i=ar.length-1; i>=0; i--) {
			for(int j = 0; j<ar[i].length; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] ar1 = new int[3][10];
		int[][] ar2 = new int[4][];
		int[][] ar3 = null;
		
		setArray(ar1);
		showArray(ar1);

		for(int i=0; i<ar2.length; i++) {
			ar2[i] = new int[i+1];
		}
		setArray(ar2);
		showArray(ar2);

		System.out.println("만들고 싶은 행 크기? : ");
		int row = sc.nextInt();
		ar3 = new int[row][];
		for(int i=0; i<row; i++) {
			System.out.printf("%2d층에 만들고 싶은 방 개수? : ", i+1);
			int room = sc.nextInt();
			ar3[i] = new int[room];
		}
		setArray(ar3);
		showArray(ar3);

	}

}
