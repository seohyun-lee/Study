import java.util.Scanner;

public class Main {

	public static void setArray(int[][] ar) {
		for(int i=0; i<ar.length; i++) {
			for(int k=0; k<ar[i].length; k++) {
				ar[i][k] = i*10 + (k+1);
			}
		}
	}
	public static void showArray(int[][] ar) {
		for(int i=0; i<ar.length; i++) {
			for(int k=0; k<ar[i].length; k++) { //직각삼각형 출력
				System.out.printf("%3d ", ar[i][k]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int [][] ar1 = new int[10][10]; //동적할당이라 많이넣을수있음
		int [][] ar2 = new int[5][]; //5행 n열
		int [][] ar3 = null;
		Scanner sc = new Scanner(System.in);
		
		setArray(ar1);
		showArray(ar1);
		
		for(int i=0; i<ar2.length; i++) {
			ar2[i] = new int[i+1];
		}
		setArray(ar2);
		showArray(ar2);
		
		System.out.println("만들고 싶은 행 크기? : ");
		int 행 = sc.nextInt();
		
		ar3 =new int[행][];
		for(int i=0; i<행; i++) {
			System.out.printf("%2d층에 만들고 싶은 방 개수? : ", i);
			int room = sc.nextInt();
			ar3[i] = new int[room];
		}

		setArray(ar3);
		showArray(ar3);
		
	}

}
