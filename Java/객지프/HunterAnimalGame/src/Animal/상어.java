package Animal;
public class 상어 extends 동물 {

	public 상어() {
		this.이름 = "샤크";
    	this.서식지="바다";
		this.set사냥확률(0);
    	this.set나이(70);
    	this.hp=60;
    	this.power=70;
    	System.out.println("바다에 상어를 한마리 생성합니다.");
	}

	public 상어(String name) {
		// 공통적인 처리부분은 기본생성자에서 처리하고 호출해서 사용하자.
		this();
		this.이름 = name;
	}

    public void 헤엄치기(){
    	System.out.println("따단~ 따단~");
    }

    public void 움직이기(){
    	System.out.println("상어가 어슬렁 어슬렁 헤엄쳐요~");
    }

    public void 놀기(){
    	System.out.println("물고기가 맛있어 보이네~ 흐흐");
    	헤엄치기();
    }
}
