import java.util.Scanner;

public class Practice36 {

	public static void main(String[] args) {
		Movie movie1 = new Movie();
		Movie movie2 = new Movie();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ȭ������ �Է��ϼ���.");
		System.out.print("��ȭ������? ");
		movie1.title = sc.nextLine();
		System.out.print("������? ");
		movie1.score = sc.nextInt(); 
		sc.nextLine();
		System.out.print("������? ");
		movie1.director = sc.nextLine();
		System.out.print("���� �⵵��? ");
		movie1.year = sc.nextInt();
		sc.nextLine();
		System.out.println("\n��ȭ������ �Է��ϼ���.");
		System.out.print("��ȭ������? ");
		movie2.title = sc.nextLine();
		System.out.print("������? ");
		movie2.score = sc.nextInt();
		sc.nextLine();
		System.out.print("������? ");
		movie2.director = sc.nextLine();
		System.out.print("���� �⵵��? ");
		movie2.year = sc.nextInt();
		sc.nextLine();

		System.out.println();
		System.out.println("�Է��� ��ȭ�� �����Դϴ�.");
		System.out.println("����: "+movie1.title);
		System.out.println("����: "+movie1.score);
		System.out.println("����: "+movie1.director);
		System.out.println("�����⵵: "+movie1.year+"\n");
		System.out.println("�Է��� ��ȭ�� �����Դϴ�.");
		System.out.println("����: "+movie2.title);
		System.out.println("����: "+movie2.score);
		System.out.println("����: "+movie2.director);
		System.out.println("�����⵵: "+movie2.year+"\n");
		
		if (movie1.score > movie2.score)
			System.out.println("��ȭ "+movie1.title+"�� ��ȭ "+movie2.title+"���� ������ �� �����ϴ�.");
		else if (movie1.score < movie2.score)
			System.out.println("��ȭ "+movie1.title+"�� ��ȭ "+movie2.title+"���� ������ �� �����ϴ�.");
		else
			System.out.println("��ȭ "+movie1.title+"�� ��ȭ "+movie2.title+"�� ������ �����ϴ�.");
		if (movie1.year > movie2.year)
			System.out.println("��ȭ "+movie1.title+"�� ��ȭ "+movie2.title+"���� ���� �����Ǿ����ϴ�.");
		else if (movie1.year < movie2.year)
			System.out.println("��ȭ "+movie1.title+"�� ��ȭ "+movie2.title+"���� ���߿� �����Ǿ����ϴ�.");
		else
			System.out.println("��ȭ "+movie1.title+"�� ��ȭ "+movie2.title+"�� ���� �⵵�� �����Ǿ����ϴ�.");
		sc.close();
	}

}
