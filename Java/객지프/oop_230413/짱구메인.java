package test1;

public class 짱구메인 {

	public static void main(String[] args) {
		할머니 a = new 할머니();
		엄마 b = new 엄마();
		짱구 c = new 짱구();
		할머니 d = new 짱구();
		
		System.out.println("할머니, 엄마, 짱구가 요리를 해요.");
		a.요리하기();
		b.요리하기();
		c.요리하기();

		System.out.println("\n짱구가 엄마처럼, 할머니처럼 요리해요.");
		c.엄마처럼요리하기();
		c.할머니처럼요리하기();
		
		System.out.println("\n짱구가 엄마께 요리를 부탁드려요.");
		c.요리하기(b);

		System.out.println("\n짱구가 할머니께 요리를 부탁드려요.");
		c.요리하기(a);
		
		System.out.println("\n짱구는 할머니로부터 요리하는 법을 처음 배웠어요.");
		d.요리하기();//관점을 좁게

	}

}
