package Main;

public interface Workable {
	//재주를 부린 후  hp, power, money 중  무엇을 변경해볼까요?
	//재주부리기의 동작을 정의해보세요.  각 동물들에서 구현하는 것이 원칙이지만
	//공통적인 기능은 default 메소드로 추가해도 됩니다.

	public default void 재주부리기() {
		System.out.println("동물이 (기본적으로) 재주를 부립니다.");
	}
	public default void work() {
		System.out.println("동물이 (기본적으로) 일을 합니다.");
	}
}
