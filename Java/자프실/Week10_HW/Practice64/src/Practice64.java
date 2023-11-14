import java.util.Scanner;

public class Practice64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyBox<String> box1;
		MyBox<Integer> box2;
		MyBox<Integer> box3;
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		box1 = new MyBox<>(sc.nextLine());
		System.out.println("MyBox에 저장된 내용: "+box1.get());
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		box1.set(sc.nextLine());
		System.out.println("MyBox에 저장된 내용: "+box1.get());
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		box2 = new MyBox<>(sc.nextInt());
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		box3 = new MyBox<>(sc.nextInt());
		System.out.println(box2.get()+" + "+box3.get()+" = "+(int)(box2.get()+box3.get()));
		sc.close();
	}

}
