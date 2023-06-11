package Main;

public interface Escapeable {
	public default void escape() {
		System.out.println("어머나 동물이 탈출을 합니다..");
	}
	
}
