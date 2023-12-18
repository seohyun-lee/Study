package week10;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는? ");
			String eng = sc.next();
			if(eng.equals("exit")) { //equals로 비교해야만 돼...
				System.out.println("종료합니다...");
				break;
			}
			String kor = dic.get(eng);
			if (kor == null)
				System.out.println("없는 단어입니다.");
			else
				System.out.println(eng+"의 뜻은 "+kor);
		}
		sc.close();

	}

}
