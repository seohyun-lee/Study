package 실습9;

public class Main {
	public static void main(String [] args) {
		MyStore<String>[] store1 = new MyStore[10];
		MyStore<Integer>[] store2 = new MyStore[10];
		
		store1[0] = new MyStore();
		store1[0].set("hihi");
		System.out.println(store1[0].get());
		// store1[0].set(123); 에러 발생 
		
		store2[0] = new MyStore();
		store2[0].set(123);
		System.out.println(store2[0].get());
		// store2[0].set("hihi);에러 발생 
		
	}
	/*
	 * MyStore<String>[] store1 = new MyStore[10];
	 * MyStore<Integer>[] store2 = new MyStore[10];
	 * store1[0] = new MyStore();
	 * store1[0].set("hihi");
	 * store1[0].set(123)하면 에러가 발생한다.
	 * System.out.println(store1[0].get());
	 * 
	 * store2[0]=new MyStore();
	 * store2[0].set(123);
	 * SYstem.out.println(store2[0].get());
	 * System.out.println(store2[0].get()); 출력할땐 store2[0].get()쓰기
	 * store2[0].set("jiji")하면 에러가 발생한다.
	 */
}
