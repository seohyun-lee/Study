import java.util.Scanner;

public class Practice38 {

	public static void main(String[] args) {
		Person p1 = new Person("����", "����");
		Person p2 = new Person("ȫ�浿", "���");
		Person p3 = new Person("������", "����");
		Scanner sc = new Scanner(System.in);
		
		System.out.print(p1.name+" ���̴�? ");
		p1.age = sc.nextInt();
		System.out.print(p2.name+" ���̴�? ");
		p2.age = sc.nextInt();
		System.out.print(p3.name+" ���̴�? ");
		p3.age = sc.nextInt();
		System.out.println("\n��ü�� �����Դϴ�.");
		System.out.println(p1.name+" : "+p1.age+"��, "+p1.address);
		System.out.println(p2.name+" : "+p2.age+"��, "+p2.address);
		System.out.println(p3.name+" : "+p3.age+"��, "+p3.address);
		if (p1.age < p2.age) {
			if (p1.age > p3.age)
				System.out.println("\n���̰� �߰��� ����� "+p1.name+"�Դϴ�.");
			else if (p2.age < p3.age)
				System.out.println("\n���̰� �߰��� ����� "+p2.name+"�Դϴ�.");
			else
				System.out.println("\n���̰� �߰��� ����� "+p3.name+"�Դϴ�.");
		}
		else {
			if (p1.age < p3.age)
				System.out.println("\n���̰� �߰��� ����� "+p1.name+"�Դϴ�.");
			else if (p2.age > p3.age)
				System.out.println("\n���̰� �߰��� ����� "+p2.name+"�Դϴ�.");
			else
				System.out.println("\n���̰� �߰��� ����� "+p3.name+"�Դϴ�.");
		}
		sc.close();
	}

}
