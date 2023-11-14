import java.util.Scanner;

public class Practice74 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수형 RandomList를 생성합니다.");
		RandomList<Integer> randList = new RandomList<>();
		int n=0;
		do {
			System.out.print("원하는 기능을 선택하세요 (1-추가/2-출력/3-무작위/4-종료) : ");
			n = sc.nextInt();
			switch(n) {
				case 1:
					System.out.print("추가하고 싶은 원소의 개수를 입력하세요: ");
					int size = sc.nextInt();
					for(int i=0; i<size; i++) {
						System.out.print("["+i+"]번 원소 : ");
						randList.add(sc.nextInt());
					}
					break;
				case 2:
					randList.print();
					break;
				case 3:
					Integer element = randList.select();
					if(element != null)
						System.out.println("무작위 원소 출력 : "+element);
					break;
				default:
					System.out.println("프로그램을 종료합니다.");
			}
			System.out.println();
		} while (n != 4);
		sc.close();
	}
}
