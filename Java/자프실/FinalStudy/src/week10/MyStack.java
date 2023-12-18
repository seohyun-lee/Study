package week10;

class GStack<T> {
	int tos;
	Object[] stck;
	public GStack() {
		tos = 0;
		stck = new Object[10];
	}
	public void push(T item) {
		if (tos == 10) return;
		stck[tos] = item;
		tos++;
	}
	@SuppressWarnings("unchecked")
	public T peek() {
		if (tos == 0) return null;
		return (T)stck[tos - 1]; //stck은 Object 타입이므로 꼭 캐스팅 해야함ㄴ
	}
	@SuppressWarnings("unchecked")
	public T pop() {
		if (tos == 0) return null;
		tos--;
		return (T)stck[tos];
	}
}
public class MyStack {

	public static void main(String[] args) {
		GStack<String> s = new GStack<>();
		s.push("Seoul");
		s.push("Suwon");
		s.push("Busan");
		for(int n=0; n<3; n++) {
			System.out.println("peek: "+s.peek());
			System.out.println("pop: "+s.pop());
		}

	}

}
