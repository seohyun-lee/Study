
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1; //자동적으로 정수인 1이 실수인 1.0으로 converting된다
		//데이터 타입 바꿔도 데이터 손실 없으므로
		double b2 = (double) 1; //casting으로 명시적으로 데이터타입 바꿔주는 방법
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(b2);
		System.out.println(a+"\n"+b+"\n"+b2+"\n");
		
		//int c = 1.1; //1.1을 정수형으로 바꾸면 데이터 손실이 일어나므로 error 발생
		double d = 1.1; //data type을 double로 바꾼다
		int e = (int) 1.1; //casting
		System.out.println(d+", "+e+"\n");
		
		//1 to string
		//String str1 = Integer.toString(i)
		String f = Integer.toString(1);
		System.out.println(1+10);
		System.out.println(f+10);
		//getclass() 메서드: 객체가 속하는 클래스를 확인할 수 있는 메서드
		System.out.println(f.getClass());
	}

}