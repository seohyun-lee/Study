import java.util.Scanner;
import java.util.Random;

public class �����ϱ� {
	
	public static void showMenu() {
		System.out.println("=======================================================================");
		System.out.println("1. 1���迭�����, 2. ������ ���� �����ϱ�, 3. �����ϱ�, 4. ���̱�, 5.��� ���ϱ�, 0.�����ϱ�");
		System.out.println("=======================================================================");
		System.out.println("menu: ");
	}
	
	public static int[] makeArray(int size){ //int[] �ڷ������� �޼ҵ� �����
		int ar[] = new int[size]; //�迭 ����
		System.out.println("�迭�� �����մϴ�.");
		for(int i=0; i<ar.length; i++) { //�迭 ���� 0���� �ʱ�ȭ
			ar[i]=0;
		}
		return ar; //�迭 ����
	}
	
	public static void setRandom(int[] ar) { //int[] �ڷ������� �޼ҵ� �����, �տ��� 0�ʱ�ȭ�� �������Ҵ� �迭 �޾ƿ���
		Random r = new Random(); //�̹��� ���γ��°�
		System.out.println("������ ���� ä��ϴ�.");
		for(int i=0; i<ar.length; i++) {
			ar[i]=r.nextInt(ar.length);
			
//			ar[i]=r.nextInt()%101; //�̰Ŵ� pdf�� �ִ°� ������. ���� �� ������ �������� ����.
//			if(ar[i] < 0) { //���� ���ȴµ� �����ΰ�� -1 ������
//				ar[i]*=-1; 
//			}		
//			ar[i]=r.nextInt(100); //0~99�� ���� ����
		}
	}
	
	public static void showArray(int[] ar) { //�迭 ���� �޾ƿ���
		System.out.println("������ ����մϴ�.");
		for(int i=0; i<ar.length; i++) { //�迭 �ϳ��� ���
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	
	public static void getAverage(int[] ar) {
		System.out.println("����� ����մϴ�.");
		int average=0;
		for(int i=0; i<ar.length; i++) {
			average+=ar[i];
		}
		System.out.println("���: " + average);
	}
	
	public static void bubbleSort(int[] ar) {
		System.out.println("�迭�� �����մϴ�.");
		int temp;
		for(int scan=0; scan<ar.length; scan++) {
			for(int i=0; i<ar.length-1; i++) {
				if(ar[i]>ar[i+1]) {
					temp = ar[i];
					ar[i]= ar[i+1];
					ar[i+1]=temp;
				}
			}
		}
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar=null;
		int menu;
		
		while(true) {
			showMenu();
			menu = sc.nextInt();
			int size;
			
			if(menu==0) break;
			switch(menu) {
			case 1:
				System.out.print("������ 1���迭�� ũ��: ");
				size = sc.nextInt();
				ar=makeArray(size);
				showArray(ar); //�ڹٴ� ���� ������ ����. �� ���۷���. �����ϴ� �͸����� ��������.
				break;
			case 2: 
				setRandom(ar);
				showArray(ar);
				break;
			case 3: 
				bubbleSort(ar);
				showArray(ar);
				break;
			case 4: 
				showArray(ar);
				break;
			case 5: 
				getAverage(ar);
				break;
			default:
				System.out.println("�׷� �ڵ�� �����ϴ�.");
			}
		}
	}
}
