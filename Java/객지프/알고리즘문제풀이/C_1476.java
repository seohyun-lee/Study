
import java.util.Scanner;

public class C_1476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr= new int[n][m];
		int cnt=1;
		
		for(int i=0; i<n+m; i++) {			//n=3, m=4일 때 j+k==i인 경우 (row인 k가 안쪽 반복문인 것이 중요함)
			for(int j=0; j<m; j++) {		// 0 1 2 3
				for(int k=0; k<n; k++) {	// 1 2 3 4
					if(j+k==i) {			// 2 3 4 5
						arr[k][j]=cnt++;	//cnt=1, cnt++해서 숫자 넣는다
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
