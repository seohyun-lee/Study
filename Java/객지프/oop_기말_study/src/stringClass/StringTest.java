package stringClass;

import java.util.Random;

public class StringTest {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a +"�� ���̴�"+ a.length());
		System.out.println(a.contains("#"));
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("C#", "Java");
		System.out.println(a);
		
		String [] s = a.split(",");
		for(int i=0; i<s.length; i++) {
			System.out.println("�и��� ���ڿ�" + i + ":" + s[i]);
		}
		
		a = a.substring(5); 
		System.out.println(a);
		
		char c = a.charAt(2); //�ε��� 2������ char�� �����Ѵ�
		System.out.println(c);
		
		
		//Math.random();
		//Random r = new Random();
		
		String d = new String("hihih");
		String e = new String(" j j j ");
		System.out.println(d.length());
		System.out.println(d.contains("hi"));//�� �ȿ� ���ڿ��̴�
		
		d=d.concat("i");
		System.out.println(d);
		
		e = e.trim();
		System.out.println(e);
		
		e=e.replace("j", d);
		System.out.println(e);
		String[] str = d.split("i");
		for(int i=0; i<str.length;i++) { //str�� �迭�Դϴ�!!!!!!!!!!!!!! str.length
			System.out.println("�и��� ���ڿ�"+i+": "+str[i]);
		}
		
		e=e.substring(1); //index 1�����ؼ��� substring�� ��µ�
		System.out.println(e);
		int f = e.charAt(0);
		System.out.println((char)f+" "+f); //i 105�� ��µ�
		System.out.println(f+f); //210
		System.out.println(f+f+""); //210
		char g = e.charAt(0);
		System.out.println(g); //i�� ��µ�
		System.out.println(g+g); //�ƽ�Ű�ڵ尪�� �������� ������ ��µ�
		System.out.println(g+""+g); //i i�� ��µ�
	}
	

}
