package Generic;

public class Main {
	public static void main(String[] args) {
		Store<String> t1 = new Store<String>();
		Store<Integer> t2 = new Store<Integer>();
		
		//t1.setSomething(1); 오류 생기는 코드 , 정수를 입력했기 때문
		//t2.setSomething("aaaa"); 오류 생기는 코드 , 문자열을 입력했기 때문
		
		System.out.println(t1.getSomething());
		System.out.println(t2.getSomething());
		
		t1.list.add("aaa");
		t1.list.add("bbb");
		t1.list.add("ccc"); //add, insert, clear, remove 등을 사용할 수 있음
		
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
		//문자열만 가능
		a.list.add("aaaaa");
		a.list.add("bbbbb");
		a.list.add("cccc");
		a.list.add("dd");
		a.list.remove("cccc");
		System.out.println(a.list); //list 다 출력됨!!
		for(String data: a.list) {
			System.out.println(data); //리스트 값 하나씩 꺼내서 보기
		}
	}
}
