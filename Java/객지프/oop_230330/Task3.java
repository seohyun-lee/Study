import java.util.Scanner;
import java.util.Random;

public class Task3 {

	public static void showMenu() {
		System.out.println("=====================================================================================");
		System.out.println("1. 10�� ���� ����, 2. N�� ���� ����, 3. �������� ����, 4. �������� ����, 5. ��� ���ϱ�, 6. ���� ���̱�, 0.����");
		System.out.println("=====================================================================================");
		System.out.print("��ȣ ����: ");
	}
	
	public static int[] makeArray(int size){
		int ar[] = new int[size];
		System.out.println(size+"�� ũ��� �迭�� �����մϴ�.");
		for(int i=0; i<ar.length; i++) {
			ar[i]=0;
		}
		return ar; 
	}
	
	public static void setRandom(int[] ar) { 
		Random rand = new Random(); 
		System.out.println("������ ���� ä��ϴ�.");
		for(int i=0; i<ar.length; i++) {
			ar[i]=rand.nextInt(101);
		}
	}
	
	public static void showArray(int[] ar) { //�迭 ���� �޾ƿ���
		System.out.println("������ ����մϴ�.");
		for(int i=0; i<ar.length; i++) { //�迭 �ϳ��� ���
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	
	public static void bubbleSort(int[] ar, int checker) {
		int temp;
		for(int scan=0; scan<ar.length; scan++) {
			for(int i=0; i<ar.length-1; i++) {
				if(checker*ar[i]>ar[i+1]*checker) {
					temp = ar[i];
					ar[i]= ar[i+1];
					ar[i+1]=temp;
				}
			}
		}
	}	
	
	public static void getAverage(int[] ar) {
		System.out.println("����� ����մϴ�.");
		double average=0;
		for(int i=0; i<ar.length; i++) {
			average+=ar[i];
		}
		average/=ar.length;
		System.out.println("���: " + average);
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
			else if(menu==1) {
				ar=makeArray(10);
				setRandom(ar);
				showArray(ar);
			}
			else if(menu==2) { 
				System.out.print("������ 1���迭�� ũ��: ");
				size = sc.nextInt();
				ar=makeArray(size);
				setRandom(ar);
				showArray(ar);
			}
			else if(menu==3) {
				System.out.println("������������ �迭�� �����մϴ�.");
				bubbleSort(ar, 1);
				showArray(ar);
			}
			else if(menu==4) { 
				System.out.println("������������ �迭�� �����մϴ�.");
				bubbleSort(ar, -1);
				showArray(ar);
			}
			else if (menu==5) {
				getAverage(ar);
			}
			else if (menu==6) {
				showArray(ar);
			}
			else {
				System.out.println("�׷� �ڵ�� �����ϴ�.");
			}
		}
		sc.close();
	}

}
