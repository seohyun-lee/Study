import java.util.Scanner;

public class Practice70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수형 RandomList를 생성합니다.");
		RandomList<Integer> rl1 = new RandomList<>();
		int size;
		System.out.print("리스트의 크기를 입력하세요: ");
		size = sc.nextInt();
		for(int i=0; i<size; i++) {
			System.out.print("추가하고 싶은 정수를 입력하세요: ");
			rl1.add(sc.nextInt());
		}
		System.out.println();
		System.out.println("리스트의 내용을 출력합니다.");
		rl1.print();
		System.out.println("무작위 원소 출력 : "+rl1.select());
		System.out.println();
		
		RandomList<String> rl2 = new RandomList<>();
		System.out.println("문자열 RandomList를 생성합니다.");
		System.out.print("리스트의 크기를 입력하세요: ");
		size = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<size; i++) {
			System.out.print("추가하고 싶은 문자열을 입력하세요: ");
			rl2.add(sc.nextLine());
		}
		System.out.println();
		System.out.println("리스트의 내용을 출력합니다.");
		rl2.print();
		System.out.println("무작위 원소 출력 : "+rl2.select());
		sc.close();
	}

}
