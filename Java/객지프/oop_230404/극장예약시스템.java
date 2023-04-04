
import java.util.Scanner;

public class 극장예약시스템 {
	
	static Scanner input =new Scanner(System.in);
	int [][] Seat; 
	
	
	public void 예약하기(int [][] ar) {	
		//주의할 것: 배열의 인덱스는 0부터, 좌석의 인덱스는 0부터 시작 -> 1로

		int row=0, col=0;
		while(true) {
			
			System.out.print("예약할 행 : "); 
			row = input.nextInt();
			
			if ( row < 0 || row > ar.length-1) continue;
			
			System.out.print("예약할 열 : "); 
			col = input.nextInt();
			
			if(col < 0 || col > ar[row].length-1) continue;
			
			
			if(ar[row][col] ==1 ) {
				System.out.println("이미 예약된 좌석입니다.");
				continue;
			}
			else break;
			
		}
		
		ar[row][col]=1;	
		
	}
	
	public void 취소하기(int [][] ar) {
		
		int row=0, col=0;
		while(true) {
			
			System.out.print("취소할 행 : "); 
			row = input.nextInt();
			
			if ( row < 0 || row > ar.length-1) continue;
			
			System.out.print("취소할 열 : "); 
			col = input.nextInt();
			
			if(col < 0 || col > ar[row].length-1) continue;
			
			
			if(ar[row][col] ==0 ) {
				System.out.println("예약된 좌석이 아닙니다.");
				continue;
			}
			else break;
			
		}
		
		ar[row][col]=0;	
		
		
	}
	
	public void 좌석보이기(int [][] ar) {
		
		for(int i=0; i<ar.length; i++) {
			
			for(int j=0; j<ar[i].length; j++) {
				if(ar[i][j]==1) System.out.print("■ ");
				else System.out.print("□ ");
			}
			System.out.println();
		}
		
	}
	public  int [][] 좌석만들기_square() {
		
		int [][] ar = null;
		System.out.println("좌석을 만듭니다.");
		System.out.print("행 크기 : "); 
		int row = input.nextInt();
		System.out.print("열 크기 : "); 
		int col = input.nextInt();
		
		ar = new int[row][col];	
		
		return ar;	

	}

	public  int [][] 좌석만들기_ragid() {

		int [][] ar = null;
		System.out.println("좌석을 만듭니다.");
		System.out.print("행 크기 : "); 
		int row = input.nextInt();
		
		ar = new int[row][];
		
		System.out.println(ar.length);
		for(int i=0; i<row; i++) {
			System.out.printf("%d행의 열 크기 : ", i); 
			int col = input.nextInt();		
			ar[i] = new int[col];
		}		
		return ar;
	}
	
	public  int [][] 좌석폭파하기(int [][] ar) {
		
		if(ar == null) {
			System.out.println("좌석이 생성되지 않았습니다.");
			return ar;
		}
		
		input.nextLine(); //엔터먹어가기, 테스트하다보니 이전에 남은 엔터가 있어서 건너띄는 현상 발생.
		
		System.out.print("기존에 만들어진 좌석이 있습니다. 정말 지우겠습니까?(y/n) : ");
		String ans=input.nextLine();
		System.out.println("ans :" + ans);  //입력한 값 확인해보기
		if(ans.equalsIgnoreCase("Y")) {
			System.out.println(ans);
			System.out.println("좌석을 폭파합니다..........빠직! ");
			return null;
		}
		else return ar;
	}
	
	public   void 메뉴보이기() {
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("1.예약하기  2.취소하기   3.좌석보이기  4.좌석만들기(반듯한 사각형) 5.좌석만들기(삐뚤빼뚤 사각형) 6.좌석폭파시키기  0.그만하기");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.print("menu : ");
	}
	
	public  int 메뉴입력받기() {
		
		int menu;
		메뉴보이기();
		menu = input.nextInt();
		
		return menu;		
		
	}
	
	public  void Welcome() {
		
		System.out.println("=======================================================================");
		System.out.println("                          Welcome to Ewha Movie!!                      ");
		System.out.println("=======================================================================");
		
	}

}