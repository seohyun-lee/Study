package 실습9;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //제너릭임
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE"); //인덱스 1에 "APPLE"을 삽입 
		list.set(2, "GRAPE"); //인덱스 2에 "GRAPE"로 대체
		list.remove(0); //0번인덱스에 있던 MILK가 삭제됨
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("L");
		list.add(0, "apple");
		list.set(1,  "Grape");
		list.remove(0);
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE"); //인덱스 1에 "APPLE"을 삽입 
		list.set(2, "GRAPE"); //인덱스 2에 "GRAPE"로 대체
		list.remove(0);
		
		//list 주요 메서드: add, remove, set, get.
		//add는 더하고-index안쓸경우 맨끝에. remove는 그 index의 값을 삭제시킴. set(1, _)는 1번인덱스의 값을 바꾼다.
	/*
	 * 	for(int i=0;i<list.size();i++){
	 * 		System.out.println(list.get(i));
	 * 	}
	 * 	//주의할 점: String은 length()고, array는 length였는데, list는 size()다.
	 * */
	}

}
