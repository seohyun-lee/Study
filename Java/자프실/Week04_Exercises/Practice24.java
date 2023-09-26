
public class Practice24 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i += 3) {
			System.out.print(i + "\t");
			if ((i + 2) % 5 == 0)
				System.out.println();
		}
		System.out.println("\n"); //줄바꿈 2개 출력
		int j = 1;
		while(j <= 100) {
			System.out.print(j + "\t");
			if ((j + 2) % 5 == 0)
				System.out.println();
			j += 3;
		}
	}

}
