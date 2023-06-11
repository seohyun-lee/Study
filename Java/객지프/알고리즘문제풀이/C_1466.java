
import java.util.Scanner;

public class C_1466 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt=n*m;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(cnt+" ");
				cnt-=n;
			}
			System.out.println();
			cnt=n*m-i-1;
		}
		sc.close();
	}

}
