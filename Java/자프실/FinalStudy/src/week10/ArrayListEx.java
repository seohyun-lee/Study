package week10;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	static void test() {
		ArrayList<String> a = new ArrayList<String>();
		a.add("H");	a.add("I");	a.add("GH");
		System.out.println(a+" Size: "+a.size());
		a.add(2, " ");
		System.out.println(a+" Size: "+a.size()); //a.toString() 자동 호출
		a.set(2, "G");	a.set(3, "H");
		System.out.println(a);
		String str = a.get(1);
		System.out.println(str);
		a.remove(2);
		System.out.println(a);
		a.clear();
		System.out.println(a);		
	}
	
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요>> ");
			String s = sc.next();
			a.add(s);
		}
		int longestIndex=0;
		for(int i=0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.print(name+" ");
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex=i;
		}
		System.out.println("\n가장 긴 이름은: "+a.get(longestIndex));
		sc.close();
	}
}
