package �ǽ�9;

public class Main {
	public static void main(String [] args) {
		MyStore<String>[] store1 = new MyStore[10];
		MyStore<Integer>[] store2 = new MyStore[10];
		
		store1[0] = new MyStore();
		store1[0].set("hihi");
		System.out.println(store1[0].get());
		// store1[0].set(123); ���� �߻� 
		
		store2[0] = new MyStore();
		store2[0].set(123);
		System.out.println(store2[0].get());
		// store2[0].set("hihi);���� �߻� 
		
	}
	/*
	 * MyStore<String>[] store1 = new MyStore[10];
	 * MyStore<Integer>[] store2 = new MyStore[10];
	 * store1[0] = new MyStore();
	 * store1[0].set("hihi");
	 * store1[0].set(123)�ϸ� ������ �߻��Ѵ�.
	 * System.out.println(store1[0].get());
	 * 
	 * store2[0]=new MyStore();
	 * store2[0].set(123);
	 * SYstem.out.println(store2[0].get());
	 * System.out.println(store2[0].get()); ����Ҷ� store2[0].get()����
	 * store2[0].set("jiji")�ϸ� ������ �߻��Ѵ�.
	 */
}
