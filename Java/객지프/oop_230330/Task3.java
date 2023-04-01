import java.util.Scanner;
import java.util.Random;

public class Task3 {

	public static void showMenu() {
		System.out.println("=====================================================================================");
		System.out.println("1. 10개 숫자 생성, 2. N개 숫자 생성, 3. 오름차순 정렬, 4. 내림차순 정렬, 5. 평균 구하기, 6. 정렬 보이기, 0.종료");
		System.out.println("=====================================================================================");
		System.out.print("번호 선택: ");
	}
	
	public static int[] makeArray(int size){
		int ar[] = new int[size];
		System.out.println(size+"의 크기로 배열을 생성합니다.");
		for(int i=0; i<ar.length; i++) {
			ar[i]=0;
		}
		return ar; 
	}
	
	public static void setRandom(int[] ar) { 
		Random rand = new Random(); 
		System.out.println("랜덤한 수를 채웁니다.");
		for(int i=0; i<ar.length; i++) {
			ar[i]=rand.nextInt(101);
		}
	}
	
	public static void showArray(int[] ar) { //배열 정보 받아오기
		System.out.println("정렬을 출력합니다.");
		for(int i=0; i<ar.length; i++) { //배열 하나씩 출력
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
		System.out.println("평균을 계산합니다.");
		double average=0;
		for(int i=0; i<ar.length; i++) {
			average+=ar[i];
		}
		average/=ar.length;
		System.out.println("평균: " + average);
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
				System.out.print("생성할 1차배열의 크기: ");
				size = sc.nextInt();
				ar=makeArray(size);
				setRandom(ar);
				showArray(ar);
			}
			else if(menu==3) {
				System.out.println("오름차순으로 배열을 정렬합니다.");
				bubbleSort(ar, 1);
				showArray(ar);
			}
			else if(menu==4) { 
				System.out.println("내림차순으로 배열을 정렬합니다.");
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
				System.out.println("그런 코드는 없습니다.");
			}
		}
		sc.close();
	}

}
