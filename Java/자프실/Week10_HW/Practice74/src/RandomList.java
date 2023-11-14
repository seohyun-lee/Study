import java.util.ArrayList;
import java.util.Collections;

public class RandomList<T> {
	ArrayList<T> list = new ArrayList<>();
	
	public RandomList() {}
	
	public void add(T item) {
		list.add(item);
	}
	
	public void print() {
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
	}
	
	private ArrayList<T> copyArray() {
		ArrayList<T> copiedList = new ArrayList<>();
		copiedList.addAll(list);
		return copiedList;
	}
	
	public T select() {
		ArrayList<T> tempList = copyArray();
		T selected = null;
		try {
			if (tempList == null || tempList.size() == 0)
	            throw new ImproperArraySizeException("입력된 원소가 없는 상태입니다.");
		} catch (ImproperArraySizeException e) {
            return null;
        }
		Collections.shuffle(tempList);
		for (T e : tempList) {
			selected = e;
			break;
	    }
		return selected;
	}
}
