import java.util.Scanner;

public class Practice38 {

	public static void main(String[] args) {
		Person p1 = new Person("김상식", "서울");
		Person p2 = new Person("홍길동", "경북");
		Person p3 = new Person("성춘향", "전남");
		Scanner sc = new Scanner(System.in);
		
		System.out.print(p1.name+" 나이는? ");
		p1.age = sc.nextInt();
		System.out.print(p2.name+" 나이는? ");
		p2.age = sc.nextInt();
		System.out.print(p3.name+" 나이는? ");
		p3.age = sc.nextInt();
		System.out.println("\n객체별 정보입니다.");
		System.out.println(p1.name+" : "+p1.age+"세, "+p1.address);
		System.out.println(p2.name+" : "+p2.age+"세, "+p2.address);
		System.out.println(p3.name+" : "+p3.age+"세, "+p3.address);
		if (p1.age < p2.age) {
			if (p1.age > p3.age)
				System.out.println("\n나이가 중간인 사람은 "+p1.name+"입니다.");
			else if (p2.age < p3.age)
				System.out.println("\n나이가 중간인 사람은 "+p2.name+"입니다.");
			else
				System.out.println("\n나이가 중간인 사람은 "+p3.name+"입니다.");
		}
		else {
			if (p1.age < p3.age)
				System.out.println("\n나이가 중간인 사람은 "+p1.name+"입니다.");
			else if (p2.age > p3.age)
				System.out.println("\n나이가 중간인 사람은 "+p2.name+"입니다.");
			else
				System.out.println("\n나이가 중간인 사람은 "+p3.name+"입니다.");
		}
		sc.close();
	}

}
