package TigerAndRabbit;

public interface Movable {
	//public default void move() {}; //Main에서 Movable로 참조된 객체가 move()를 호출하므로 메소드 정의 또는 구현이 되어야 한다.
	public void move();
}
