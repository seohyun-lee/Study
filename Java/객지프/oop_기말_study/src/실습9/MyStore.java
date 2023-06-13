package ½Ç½À9;

public class MyStore<T> {
	private T data;

	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return this.data;
	}

}

class Store<T>{
	private T data;
	public void set(T data) {
		this.data= data;
	}
	public T get() {
		return this.data;
	}
}