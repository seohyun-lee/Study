import java.util.Scanner;

public class Practice46 {

	public static void main(String[] args) {
		Movie movie1 = new Movie();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영화정보를 입력하세요.");
		System.out.print("영화제목은? ");
		movie1.setTitle(sc.nextLine());
		System.out.print("평점은? ");
		movie1.setScore(sc.nextInt());
		sc.nextLine();
		System.out.print("감독은? ");
		movie1.setDirector(sc.nextLine());
		System.out.print("개봉 년도는? ");
		movie1.setYear(sc.nextInt());
		System.out.println();
		System.out.println(movie1.toString());
	}

}
