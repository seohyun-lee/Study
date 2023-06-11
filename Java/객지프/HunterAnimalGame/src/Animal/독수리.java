package Animal;
public class 독수리 extends 동물 {

    public 독수리(){
    	this.이름="독수리";
    	this.서식지="숲속";
    	this.set사냥확률(30);  //독수리 사냥확률을 30%
    	this.set나이(60);
    	this.hp=80;
    	this.power=60;
    	System.out.println("숲속에 독수리를 한마리 생성합니다.");
    }

    public 독수리(String name){    	
    	//공통적인 처리부분은 기본생성자에서 처리하고 호출해서 사용하자.
    	this();
    	this.이름= name;
    }
    
    public 독수리(String name, int 사냥확률){
    	//변수에 직접 대입하는 방식도 가능하고, 아래처럼 호출하는 것도 가능
    	this(name);
    	this.set사냥확률(사냥확률);
    }
    public void 움직이기(){
    	System.out.println("독수리가 훨훨 날아가요~");
    }

    public void 놀기(){
    	System.out.println("여기저리 날아다니면서 놀고 싶은 독수리가 오늘은 바빠서 놀 시간이 없음 수리수리~");
    }
    
  //동물원에서
    public void 재주부리기(){
    	System.out.println("서커스는 힘들어!!");
    	this.power+=20;
    } 

}
