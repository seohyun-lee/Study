package week10;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("ã�� ���� �ܾ��? ");
			String eng = sc.next();
			if(eng.equals("exit")) { //equals�� ���ؾ߸� ��...
				System.out.println("�����մϴ�...");
				break;
			}
			String kor = dic.get(eng);
			if (kor == null)
				System.out.println("���� �ܾ��Դϴ�.");
			else
				System.out.println(eng+"�� ���� "+kor);
		}
		sc.close();

	}

}
