package wrapper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = 10; //클래스로 생성된 객체변수 (힙에 잡힌 것을 가르키는 객체변수)
		int ii = 10; //둘이 다르다. 
		
		String s = "123";
		//valueOf()와 parseInt()모두 숫자만 있는 문자열을 숫자로 바꿀수있다
		System.out.println(Integer.valueOf(s));
		System.out.println(Integer.parseInt(s));
		
		System.out.println(i.toBinaryString(i));
		System.out.println(Integer.toBinaryString(ii));
		System.out.println(Integer.toBinaryString(11));
		System.out.println(i.getClass().getSimpleName());
		
		
	}
	
	/*public void f() {
		Integer i =10; //클래스로 생성된 객체변수. 힙에 잡힌 것을 가리킨다.
		int i2 = 10; //i와 둘이 다르다
		System.out.println(i.toBinaryString(i));
		System.out.println(Integer.toBinaryString(i2));
		System.out.println(i.getClass().getSimpleName());
	}*/

}
