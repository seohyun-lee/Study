import java.util.Scanner;

public class Practice46 {

	public static void main(String[] args) {
		Movie movie1 = new Movie();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ȭ������ �Է��ϼ���.");
		System.out.print("��ȭ������? ");
		movie1.setTitle(sc.nextLine());
		System.out.print("������? ");
		movie1.setScore(sc.nextInt());
		sc.nextLine();
		System.out.print("������? ");
		movie1.setDirector(sc.nextLine());
		System.out.print("���� �⵵��? ");
		movie1.setYear(sc.nextInt());
		System.out.println();
		System.out.println(movie1.toString());
	}

}
