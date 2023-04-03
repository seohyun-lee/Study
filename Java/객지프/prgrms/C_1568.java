package chap8;
import java.util.Scanner;

public class C_1568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int start = sc.nextInt();
		int end = sc.nextInt();
		int max=0;
		int index=0;
		for(int i=start-1;i<end;i++) {
			if(arr[i]>max) {
				max=arr[i];
				index=i;
			}
		}
		System.out.println(index+1);
		sc.close();
	}

}
