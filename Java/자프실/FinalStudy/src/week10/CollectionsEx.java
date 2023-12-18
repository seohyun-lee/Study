package week10;
import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String e = it.next();
			String sep;
			if(it.hasNext())
				sep = "->";
			else
				sep = "\n";
			System.out.print(e+sep);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		myList.add("a");
		myList.add("b");
		myList.add("d");
		myList.add("f");
		myList.add(2, "c"); //2 인덱스에 삽입시 기존 요소들 뒤로 밀림
		myList.add(0, "e"); //0 인덱스에 삽입시 기존 요소들 뒤로 밀림
		printList(myList);
		Collections.shuffle(myList);
		printList(myList);
		Collections.sort(myList);
		printList(myList);
		int index = Collections.binarySearch(myList, "c") + 1;
		System.out.println("c는 "+index+"번째");
	}

}
