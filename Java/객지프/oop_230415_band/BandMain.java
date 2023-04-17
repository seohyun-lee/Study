
public class BandMain {

	public static void main(String[] args) {
		Vocal Kim = new Vocal();
		Guitar Han = new Guitar();
		Guitar Lee = new Guitar();
		Bass Lim = new Bass();
		Drum Bae = new Drum();
		Keyboard Yeon = new Keyboard();
		
		Han.톤맞추기("crunch");
		Lee.톤맞추기("clean");
		
		System.out.println("밴드 공연을 시작합니다!!");
		System.out.println("=====================");

		Bae.공연하기();
		Lim.공연하기();
		Yeon.공연하기();
		Han.공연하기();
		Lee.공연하기();
		Kim.공연하기();
		Kim.노래부르기();
		System.out.println();

		Lim.그루브타기();
		Lee.속주하기();
		Kim.고음지르기();
		Han.기타솔로하기();
		Bae.스틱돌리기();
		Lim.슬랩하기();
		Kim.뛰어다니기();
		Yeon.글리산도하기();
		Bae.스틱던지기();
		
	}

}
