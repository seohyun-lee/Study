
public class NumPair<T extends Number> {
	private T first;
	private T second;
	
	public NumPair(T first, T second) {
		this.setFirst(first);
		this.setSecond(second);
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}
	
	public String toString() {
		return "(" + getFirst() + ", " + getSecond() + ")";
	}
	
	public NumPair<T> flip() {
		return new NumPair<T>(getSecond(), getFirst());
	}
	
	public double calcAverage() {
		return (getFirst().doubleValue() + getSecond().doubleValue())/2;
	}
}
