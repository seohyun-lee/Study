//ȣ��, ����, ����ã��
import java.util.Scanner;

public class �迭 {

	public static void �������̱� (int [][] ar) {
		for(int i=0; i<ar.length; i++) {
			System.out.printf("[%2d] : ", i+1);
			for(int k=0; k<ar[i].length; k++) {
				System.out.print("�� ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int [][] bld = new int [3][10]; //3�� 10��
		int [][] bld1 = new int [3][]; //3�� n��
		int [][] bld2; //n�� n��
		//1���� �迭�� int ar[] = new int [10];
		//int [][][]m = new int [10][5][3];
		//int [][][]m = new int [10][5][3].
		
		
		Scanner input = new Scanner(System.in);
		
		�������̱�(bld); // 3�� 10��
		System.out.println("====================================");
		
		int size;
		for(int i=0; i<bld1.length; i++) {
			System.out.printf("[%2d] �� �氳��: ", i+1);
			size = input.nextInt();
			bld1[i] = new int[size];
		}
		�������̱�(bld1); //3���ε� ���� ���ϴ´�� ����
		System.out.println("====================================");
		
		System.out.print("���ϴ� ��:");
		size = input.nextInt();
		bld2 = new int [size][];
		for(int i=0; i<bld2.length; i++) {
			System.out.printf("[%2d] �� �氳��: ", i+1);
			size = input.nextInt();
			bld2[i] = new int[size];
		}
		�������̱�(bld2); //3���ε� ���� ���ϴ´�� ����
		System.out.println("====================================");
		input.close();
		
	}

}
