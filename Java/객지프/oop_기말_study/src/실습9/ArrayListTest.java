package �ǽ�9;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //���ʸ���
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE"); //�ε��� 1�� "APPLE"�� ���� 
		list.set(2, "GRAPE"); //�ε��� 2�� "GRAPE"�� ��ü
		list.remove(0); //0���ε����� �ִ� MILK�� ������
		
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
		list.add(1, "APPLE"); //�ε��� 1�� "APPLE"�� ���� 
		list.set(2, "GRAPE"); //�ε��� 2�� "GRAPE"�� ��ü
		list.remove(0);
		
		//list �ֿ� �޼���: add, remove, set, get.
		//add�� ���ϰ�-index�Ⱦ���� �ǳ���. remove�� �� index�� ���� ������Ŵ. set(1, _)�� 1���ε����� ���� �ٲ۴�.
	/*
	 * 	for(int i=0;i<list.size();i++){
	 * 		System.out.println(list.get(i));
	 * 	}
	 * 	//������ ��: String�� length()��, array�� length���µ�, list�� size()��.
	 * */
	}

}
