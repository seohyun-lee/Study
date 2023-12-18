package week10;

public class GenericMethodExample {

	public static <T> GStack<T> reverse(GStack<T> a) {
		GStack<T> s = new GStack<>();
		while(true) {
			T tmp = a.pop();
			if (tmp==null)
				break;
			else
				s.push(tmp);
		}
		return s;
	}
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		GStack<Double> gs = new GStack<>();
		for(int i=0; i<5; i++)
			gs.push(new Double(i)); //Double로 박싱하였음
		gs=reverse(gs);
		for(int i=0; i<5; i++)
			System.out.println(gs.pop());
	}

}
