package stringClass;

import java.util.Random;

public class StringTest {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");
		
		System.out.println(a +"의 길이는"+ a.length());
		System.out.println(a.contains("#"));
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("C#", "Java");
		System.out.println(a);
		
		String [] s = a.split(",");
		for(int i=0; i<s.length; i++) {
			System.out.println("분리된 문자열" + i + ":" + s[i]);
		}
		
		a = a.substring(5); 
		System.out.println(a);
		
		char c = a.charAt(2); //인덱스 2에서의 char를 리턴한다
		System.out.println(c);
		
		
		//Math.random();
		//Random r = new Random();
		
		String d = new String("hihih");
		String e = new String(" j j j ");
		System.out.println(d.length());
		System.out.println(d.contains("hi"));//이 안에 문자열이다
		
		d=d.concat("i");
		System.out.println(d);
		
		e = e.trim();
		System.out.println(e);
		
		e=e.replace("j", d);
		System.out.println(e);
		String[] str = d.split("i");
		for(int i=0; i<str.length;i++) { //str가 배열입니다!!!!!!!!!!!!!! str.length
			System.out.println("분리된 문자열"+i+": "+str[i]);
		}
		
		e=e.substring(1); //index 1부터해서의 substring이 출력되
		System.out.println(e);
		int f = e.charAt(0);
		System.out.println((char)f+" "+f); //i 105가 출력됨
		System.out.println(f+f); //210
		System.out.println(f+f+""); //210
		char g = e.charAt(0);
		System.out.println(g); //i가 출력됨
		System.out.println(g+g); //아스키코드값이 더해져서 정수로 출력됨
		System.out.println(g+""+g); //i i가 출력됨
	}
	

}
