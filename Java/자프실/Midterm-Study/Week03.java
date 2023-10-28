import java.util.ArrayList;

public class Week03 {

	public static void main(String[] args) {
		/*//for-each문
		int[] list = {1, 2, 3, 4, 5};
		
		for(int e : list) {
			System.out.println(e);
		}*/
		
		/*//래그드 배열
		int MAX_ROWS=10;
		int[][] ragged = new int[MAX_ROWS+1][];
		for(int r=0; r<=MAX_ROWS;r++) {
			ragged[r] = new int[r+1];
			ragged[r][r]=r;
		}
		for(int r=0; r<=MAX_ROWS;r++)
			System.out.println(ragged[r][r]);*/
		
		/*//래그드 배열
		int[][] ragged = new int[3][];
		ragged[0] = new int[1];
		ragged[1] = new int[2];
		ragged[2] = new int[3];
		
		for(int r=0; r<ragged.length; r++) {
			for(int c=0; c<ragged[r].length; c++) {
				ragged[r][c]=c;
				System.out.print(ragged[r][c]);
			}
			System.out.println();
		}*/
		
		/*//ArrayList
		ArrayList<String> list; //String은 ArrayList에 저장할 자료형. list는 참조변수
		list = new ArrayList<>(); //ArrayList 생성
		list.add("Apple");
		list.add("Grape");
		System.out.println(list); //출력: [Apple, Grape]*/
		
		
		/*//import java.util.ArrayList;
		ArrayList<String> list;
		list = new ArrayList<>();
		list.add("Sports");
		list.add("Music");
		list.add("Art");
		list.remove("Sports");
		System.out.println(list);*/
		
		/*//문자열
		String str1 = "Hello";
		System.out.println(str1);
		str1="Hi";
		System.out.println(str1);
		String str2 = new String("Hi");
		System.out.println(str2);
		str2="Hello";
		System.out.println(str2);*/
		
		/*//문자열->메모리 주소와 관련하여
		String s1 = "A";
		String s2 = "A";
		String s3 = new String("A");
		String s4 = new String("A");
		System.out.println(System.identityHashCode(s1)); //s1, s2의 주소값은 같다
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3)); //s3, s4는 다르다
		System.out.println(System.identityHashCode(s4));*/
		
		/*//문자열
		String s = " Java Programming ";
		System.out.println("s.length() : " + s.length());
		System.out.println("s.charAt(1) : " + s.charAt(1));
		System.out.println("s.substring(6) : " + s.substring(6));
		System.out.println("s.substring(5,13) : " + s.substring(5,13));
		System.out.println("s.indexOf('a') : " + s.indexOf("a"));
		System.out.println("s.toLowerCase() : " +	s.toLowerCase());
		System.out.println("s.toUpperCase() : " + s.toUpperCase());
		String s1="Ja";
		String s2="va";
		String s3=s1.concat(s2);
		String s4="  Java  ".trim();
		System.out.println(s3.equals(s4) + " " + s4.compareTo(s3));*/
		
		/*//문자열-연산
		String s1 = "Java"; String s2 = "Java"; String s3 = "java";
		System.out.print(s1 == s2); System.out.println(s1 != s2);
		System.out.print(s2 == s3); System.out.println(s2 != s3);
		String s4 = s2 + s3;
		System.out.println(s4); //Javajava*/
		
		/*//문자열 연산자, equals
		String s1 = new String("Java");
		String s2 = new String("Java"); 
		String s3 = s1;
		if(s1 == s2) System.out.println("s1==s2");
		else System.out.println("s1!=s2");
		if(s1 == s3) System.out.println("s1==s3");
		else System.out.println("s1!=s3");
		if(s1.equals(s2)) System.out.println("s1==s2");
		else System.out.println("s1!=s2");*/
		
	}

}
