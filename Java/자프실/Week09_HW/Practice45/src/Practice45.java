import java.util.Scanner;

public class Practice45 {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("사각형의 가로 : ");
		rectangle.setWidth(sc.nextInt());
		System.out.print("사각형의 세로 : ");
		rectangle.setHeight(sc.nextInt());
		System.out.println("사각형의 가로는 "+rectangle.getWidth()+"이고, 세로는 "+rectangle.getHeight()+"입니다.");
		System.out.println("사각형의 넓이는 "+rectangle.area()+"이고, 둘레는 "+rectangle.perimeter()+"입니다.");
		sc.close();
	}

}
