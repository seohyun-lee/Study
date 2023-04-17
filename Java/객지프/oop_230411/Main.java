interface I학생{
	//기능만 명시합니다. method prototyping 메소드 프로토타이핑
	public void 공부하기();
//	public void 과제하기();
//	public void 예습하기();
//	public void 복습하기();
	public default void 휴식하기() {
		System.out.println("게암도 하고 유튜브도 보고 불닭볶음면을 먹으면서 놀아요!!");
		//명시 뿐 아니라 구현까지 하는 경우
	}
}
public class Main implements I학생 {

	public static void main(String[] args) {
		Main t = new Main();
		t.휴식하기(); //문법 오류
	}

}
