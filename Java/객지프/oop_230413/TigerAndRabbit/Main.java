package TigerAndRabbit;
import java.util.Scanner;

class 동물 implements Movable{
	private String name;
	public 동물() {} //기본 생성자. 클래스 이름과 동일해야한다. 자료형은 없다.
	public 동물(String name) { //생성자를 오버로딩했다.
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
}

class 호랑이 extends 동물{
	public 호랑이() {} //기본 생성자. 클래스 이름과 동일해야한다. 자료형은 없다.
	public 호랑이 (String name) {
		this.setName(name);
	}
	
	public void move() {
		System.out.println(this.getName()+" : 숲속에서 어슬렁 어슬렁 움직입니다");
	}
}

class 토끼 extends 동물{  // 호랑이와 마찬가지
    //생성자를 완성하세요
    public 토끼(){}
    public 토끼(String name){
        super(name); //this.setName(name);  //super(name); 도 가능. 인자를 이용하여 슈퍼 클래스의 적당한 생성자 호출. 반드시 서브 클래스 생성자 코드의 제일 첫 라인에 와야 함
    }    
    
    public void move(){
        System.out.println(this.getName() +" : 숲속 여기저기를 폴짝폴짝 뛰어다니며 놉니다~");
    }
    
    //Movable [] 타입으로 refer하므로 호출 불가능
    /*public void jump() {
    	System.out.println(this.getName() +" : 이 토끼는 점프에 재능이 있군요!");
    }*/
}

public class Main {
	
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		//동물이 들어갈 공간을 배열로 만들고, Movable [] 타입으로 refer. 이렇게 되면 move()메소드만 실행가능.
		Movable [] animals = new 동물[10];
		
		//N마리의 호랑이와 M마리의 토끼의 이름을 입력받아 생성합니다.
		int N=input.nextInt();		
		String name=null;
		int i=0;
		for(i=0;i<N; i++){
			name=input.next();
			animals[i]=new 호랑이(name);			
		}
		int k=i;		
		int M=input.nextInt();		
		for(i=k;i<k+M; i++){
			name=input.next();
			animals[i]=new 토끼(name);
		}
		
		//animals[i]를 이용하여 호랑이와 토끼의 move()를 실행합니다.
		for(i=0;i<N+M; i++){
			 animals[i].move();
		}	
	}
}