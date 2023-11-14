
public class Practice68 {

	public static void main(String[] args) {
		NumPair<Integer> i1 = new NumPair<>(10, 20);
		System.out.println("Integer 순서쌍 i1: "+i1.toString());
		System.out.println();
		System.out.println("기존의 순서쌍 i1: "+i1.toString());
		NumPair<Integer> i2 = i1.flip();
		System.out.println("Flip 실행 결과 순서쌍 i2: "+i2.toString());
		System.out.println();
		System.out.println("i1의 평균값 : "+i1.calcAverage());
		System.out.println("i2의 평균값 : "+i2.calcAverage());
		System.out.println();
		NumPair<Double> d1 = new NumPair<>(1.25, 4.32);
		System.out.println("Double 순서쌍 d1: "+d1.toString());
		NumPair<Double> d2 = d1.flip();
		System.out.println("Flip 실행 결과 순서쌍 d2: "+d2.toString());
		System.out.println();
		System.out.println("d1의 평균값 : "+d1.calcAverage());
		System.out.println("d2의 평균값 : "+d2.calcAverage());

		//i1 = d1.flip()을 시도하면 오류 발생. 이유는?
		/* i1 = d1.flip()을 시도하면 오류 발생. 이유는?
		 * 데이터 타입이 NumPair<Double>와 NumPair<Integer>로 불일치하기 때문이다.
		*/

		//String 순서쌍 s: (사과, 배)
		//String 순서쌍 객체를 만들려고 하면 오류 발생. 이유는?
		/* String 순서쌍 객체를 만들려고 하면 오류가 발생하는 이유:
		 * String은 Number 클래스의 하위 클래스가 아니다.
		 * NumPair<T extends Number> 이렇게 extends 키워드로 클래스에 상한선 제약을 주었기 때문에
		 * 제너릭 타입 매개변수 T는 Number 또는 Number의 하위 클래스만 허용된다.
		*/
	}

}