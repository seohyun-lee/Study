import java.util.Scanner;

public class Practice43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date birthday = new Date();
		Date adultday = new Date();
		System.out.print("태어난 년도를 입력하세요: ");
		birthday.setYear(sc.nextInt());
		System.out.print("태어난 월을 입력하세요: ");
		birthday.setMonth(sc.nextInt());
		System.out.print("태어난 날짜를 입력하세요: ");
		birthday.setDay(sc.nextInt());
		System.out.println();
		adultday.setYear(birthday.getYear() + 20);
		adultday.setMonth(birthday.getMonth());
		adultday.setDay(birthday.getDay());

		System.out.println("당신의 생일은 "+birthday.toString()+"입니다.");
		System.out.println("당신의 성년일은 "+adultday.toString()+"입니다.");
		System.out.println("당신의 생일은 "+birthday.toString()+"입니다.");
		sc.close();
	}

}
