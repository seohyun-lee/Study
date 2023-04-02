import java.util.Scanner;
import java.util.Random;

public class 정렬하기 {
	
	public static void showMenu() {
		System.out.println("=======================================================================");
		System.out.println("1. 1차배열만들기, 2. 랜덤한 수로 세팅하기, 3. 정렬하기, 4. 보이기, 5.평균 구하기, 0.종료하기");
		System.out.println("=======================================================================");
		System.out.println("menu: ");
	}
	
	public static int[] makeArray(int size){ //int[] 자료형으로 메소드 만들기
		int ar[] = new int[size]; //배열 생성
		System.out.println("배열을 생성합니다.");
		for(int i=0; i<ar.length; i++) { //배열 값들 0으로 초기화
			ar[i]=0;
		}
		return ar; //배열 리턴
	}
	
	public static void setRandom(int[] ar) { //int[] 자료형으로 메소드 만들고, 앞에서 0초기화로 만들어놓았던 배열 받아오기
		Random r = new Random(); //이번에 새로나온거
		System.out.println("랜덤한 수를 채웁니다.");
		for(int i=0; i<ar.length; i++) {
			ar[i]=r.nextInt(ar.length);
			
//			ar[i]=r.nextInt()%101; //이거는 pdf에 있는거 복붙함. 인자 안 넣으면 음수부터 나옴.
//			if(ar[i] < 0) { //랜덤 돌렸는데 음수인경우 -1 곱해줌
//				ar[i]*=-1; 
//			}		
//			ar[i]=r.nextInt(100); //0~99의 수가 나옴
		}
	}
	
	public static void showArray(int[] ar) { //배열 정보 받아오기
		System.out.println("정렬을 출력합니다.");
		for(int i=0; i<ar.length; i++) { //배열 하나씩 출력
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	
	public static void getAverage(int[] ar) {
		System.out.println("평균을 계산합니다.");
		int average=0;
		for(int i=0; i<ar.length; i++) {
			average+=ar[i];
		}
		System.out.println("평균: " + average);
	}
	
	public static void bubbleSort(int[] ar) {
		System.out.println("배열을 정렬합니다.");
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
				System.out.print("생성할 1차배열의 크기: ");
				size = sc.nextInt();
				ar=makeArray(size);
				showArray(ar); //자바는 모든게 포인터 내장. 다 레퍼런스. 전달하는 것만으로 원본접근.
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
				System.out.println("그런 코드는 없습니다.");
			}
		}
		sc.close();
	}
}
