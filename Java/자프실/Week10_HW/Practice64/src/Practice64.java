import java.util.Scanner;

public class Practice64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyBox<String> box1;
		MyBox<Integer> box2;
		MyBox<Integer> box3;
		
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		box1 = new MyBox<>(sc.nextLine());
		System.out.println("MyBox�� ����� ����: "+box1.get());
		
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		box1.set(sc.nextLine());
		System.out.println("MyBox�� ����� ����: "+box1.get());
		
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		box2 = new MyBox<>(sc.nextInt());
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		box3 = new MyBox<>(sc.nextInt());
		System.out.println(box2.get()+" + "+box3.get()+" = "+(int)(box2.get()+box3.get()));
		sc.close();
	}

}
