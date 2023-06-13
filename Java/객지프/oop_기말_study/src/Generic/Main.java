package Generic;

public class Main {
	public static void main(String[] args) {
		Store<String> t1 = new Store<String>();
		Store<Integer> t2 = new Store<Integer>();
		
		//t1.setSomething(1); ���� ����� �ڵ� , ������ �Է��߱� ����
		//t2.setSomething("aaaa"); ���� ����� �ڵ� , ���ڿ��� �Է��߱� ����
		
		System.out.println(t1.getSomething());
		System.out.println(t2.getSomething());
		
		t1.list.add("aaa");
		t1.list.add("bbb");
		t1.list.add("ccc"); //add, insert, clear, remove ���� ����� �� ����
		
		System.out.println(t1.list);
		
		for(int i=0; i<10; i++) {
			t2.list.add(i);
			System.out.println(t2.list);
		}
		
		f();
	}

	public static void f() {
		Store<String> a = new Store<String>();
		Store<String> b = new Store<String>();
		
		a.setSomething("aaaa");
		System.out.println(a.getSomething());
		//���ڿ��� ����
		a.list.add("aaaaa");
		a.list.add("bbbbb");
		a.list.add("cccc");
		a.list.add("dd");
		a.list.remove("cccc");
		System.out.println(a.list); //list �� ��µ�!!
		for(String data: a.list) {
			System.out.println(data); //����Ʈ �� �ϳ��� ������ ����
		}
	}
}
