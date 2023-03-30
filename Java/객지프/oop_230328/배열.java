//호텔, 빌딩, 지뢰찾기
import java.util.Scanner;

public class 배열 {

	public static void 빌딩보이기 (int [][] ar) {
		for(int i=0; i<ar.length; i++) {
			System.out.printf("[%2d] : ", i+1);
			for(int k=0; k<ar[i].length; k++) {
				System.out.print("□ ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int [][] bld = new int [3][10]; //3랭 10열
		int [][] bld1 = new int [3][]; //3행 n열
		int [][] bld2; //n층 n열
		//1차원 배열은 int ar[] = new int [10];
		//int [][][]m = new int [10][5][3];
		//int [][][]m = new int [10][5][3].
		
		
		Scanner input = new Scanner(System.in);
		
		빌딩보이기(bld); // 3행 10열
		System.out.println("====================================");
		
		int size;
		for(int i=0; i<bld1.length; i++) {
			System.out.printf("[%2d] 층 방개수: ", i+1);
			size = input.nextInt();
			bld1[i] = new int[size];
		}
		빌딩보이기(bld1); //3행인데 열은 원하는대로 나옴
		System.out.println("====================================");
		
		System.out.print("원하는 층:");
		size = input.nextInt();
		bld2 = new int [size][];
		for(int i=0; i<bld2.length; i++) {
			System.out.printf("[%2d] 층 방개수: ", i+1);
			size = input.nextInt();
			bld2[i] = new int[size];
		}
		빌딩보이기(bld2); //3행인데 열은 원하는대로 나옴
		System.out.println("====================================");
		input.close();
		
	}

}
