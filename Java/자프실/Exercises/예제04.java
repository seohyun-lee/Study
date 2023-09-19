
//예제4: 조건 연산자 실습하기
public class 예제04 {

	public static void main(String[] args) {
		double a = 20 * 20 * 3.141592 * 2;
		double b = 30 * 30 * 3.141592;
		System.out.println("20cm 피자 2개의 면적=" + a);
		System.out.println("30cm 피자 면적=" + b);
		if (a < b)
			System.out.println("30cm 피자 한 개를 주문하세요.");
		else if (a == b)
			System.out.println("어느 피자를 사도 동일한 이득입니다.");
		else
			System.out.println("20cm 피자 두 개를 주문하세요.");
	}

}
