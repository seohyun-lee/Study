package Animal;
public class 뱀 extends 동물 {

    public 뱀(){
    	this.이름="슈슈뱀";
    	this.서식지="숲속";
    	this.set사냥확률(20);  //뱀 사냥확률을 20%
    	this.set나이(40);
    	this.hp=50;
    	this.power=40;
    	System.out.println("숲속에 뱀을 한마리 생성합니다.");
    }

    public 뱀(String name){    	
    	//공통적인 처리부분은 기본생성자에서 처리하고 호출해서 사용하자.
    	this();
    	this.이름= name;
    }
    
    public 뱀(String name, int 사냥확률){
    	//변수에 직접 대입하는 방식도 가능하고, 아래처럼 호출하는 것도 가능
    	this(name);
    	this.set사냥확률(사냥확률);
    }
    public void 움직이기(){
    	System.out.println("뱀이 기어가요~");
    }

    public void 똬리틀기(){
    	System.out.println("꽈리꽈리 꽈리를 틀어보자 슈슈~");
    }

    public void 놀기(){
    	System.out.println("슈슈 ~ 슈슈~");
    	똬리틀기();
    }
    
    public void 재주부리기(){
    	System.out.println("캬악~~ 장난이야, 안잡아먹어~");
    	this.power+=5;
    } 
}
