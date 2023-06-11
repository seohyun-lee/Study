package Animal;
import Main.*;
import 장소.동물원;

public abstract class 동물 implements Playable, Moveable, Workable, Escapeable {
    public String 이름;
    public String 서식지;
    private int 나이;
    private int 사냥확률;
    
    public int hp;
    public int power;
    private int money;

    public 동물(){}

    public 동물(String 이름){
    	
    	this.이름=이름;
    	System.out.println(this.이름 +"을 가진 동물을 한마리 생성합니다.");
    }

    public int get나이(){
        return this.나이;
    }

    public void set나이(int 나이){
    	this.나이 = 나이;
    }   

    public int get사냥확률(){
        return this.사냥확률;
    }

    public void set사냥확률(int 사냥확률){
    	this.사냥확률 = 사냥확률;
    }   
    
    
    public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public abstract void 놀기();

    public void 먹기(){
    	System.out.println("동물들이 산에서 영양분을 섭취해요.");
    }

    public void 자기(){
    	System.out.println("동물들이 산에서 모두 코 자요");
    }

    public void 움직이기(){
    }
    
    public void escape(){
    	System.out.println(this.이름+"가 동물원을 탈출했어요!");
    }
}
