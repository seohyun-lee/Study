import java.util.ArrayList;

public class RandomList<T> {
	ArrayList<T> list = new ArrayList<>();
	
	public RandomList() {}
	
	public void add(T item) {
		list.add(item);
	}
	
	public T select() {
		int i = (int)(Math.random()*list.size());
		return list.get(i);
	}
	
	public void print() {
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
	}
}
