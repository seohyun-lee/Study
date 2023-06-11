package Animal;
public class 고래 extends 동물 {

	public 고래() {
		this.이름 = "고래고래";
    	this.서식지="바다";
		this.set사냥확률(0);
    	this.set나이(90);
    	this.hp=100;
    	this.power=90;
    	System.out.println("바다에 고래를 한마리 생성합니다.");
	}

	public 고래(String name) {
		// 공통적인 처리부분은 기본생성자에서 처리하고 호출해서 사용하자.
		this();
		this.이름 = name;
	}

    public void 물뿜기(){
    	System.out.println("유후~");
    }

    public void 움직이기(){
    	System.out.println("고래가 멋지게 헤엄쳐요~");
    }

    public void 놀기(){
    	System.out.println("내 위에 올라탈래? 고래고래~");
    	물뿜기();
    }
}
