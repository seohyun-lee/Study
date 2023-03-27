
public class Car {

	private int 연료량;
	private int 주행거리;
	
	public void 움직이기() {
		int i;
		if(this.연료량 ==0) {
			System.out.println("연료량이 0입니다");
			return;
		}
		
		for(i=0;i<연료량;i++) {
			System.out.println("자동차가 달립니다");
			연료량--;
			주행거리++;
		}
	}
	public void 주유하기() {
		this.연료량 +=10;
		System.out.println("주유완료");
	}

}
