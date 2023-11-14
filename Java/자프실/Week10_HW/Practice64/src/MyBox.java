
public class MyBox<E> {

	private E e;
	
	public MyBox (E e) {
		this.e = e;
	}
	void set(E e) {
		this.e = e;
	}
	E get() {
		return e;
	}

}
