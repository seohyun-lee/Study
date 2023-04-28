package midterm;
import java.util.Scanner;
//메인코드는 수정하지 않습니다. 
public class Battle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Player h;
		Player p;		
		int hp, power;
		//hp, power를 입력받아서 Hulk를 생성하고 h에 저장. 
		hp=input.nextInt();		
		power=input.nextInt();				
		h=new 헐크("초록괴물헐크",hp,power);
		
		//피카츄의 hp, power를 입력받아서 피카츄를 생성하고 p에 저장. 
		hp=input.nextInt();
		power=input.nextInt();
		p=new 피카츄("피카피카",hp,power);


		h.attack(p); //h가 p를 공격합니다.
		p.show();	//p의 상태를 봅니다.	
		p.attack(h); //p가 h를 공격합니다
		h.show(); 	//h의 상태를 봅니다.

	}
}
/////////////////////////////////////////////
//클래스와 인터페이스 관계에 따라 상속,구현관계를 작성합니다.
interface Attackable{
	public void attack(Player target); //메소드 선언!
}
//시작!
class Player implements Attackable {
	String name;
	int hp;
	int power;
	public Player(String name, int hp, int power){
		this.name=name;
		this.hp = hp;
		this.power = power;
	}
	
	public void show() {
		System.out.printf("%s의 hp(%d), power(%d)\n", this.name, this.hp, this.power);
	}
	public void attack(Player target){
      //공격동작을 완성하세요.
      target.hp-=this.power;
  }
}
class 헐크 extends Player {
	//헐크의 생성자를 구현하세요
  public 헐크(String name, int hp, int power){
      super(name, hp, power);
  }
  
  //헐크의 공격메소드를 구현하세요.
	public void attack(Player target) {
		던지기(target);
      target.hp-=this.power;
	} 
  
	public void 던지기(Player target){
		System.out.println(this.name+"가 " +target.name+"를 던집니다.");
	}
  
}

class 피카츄 extends Player {
  //피카츄의 생성자를 구현하세요
  public 피카츄(String name, int hp, int power){
      super(name, hp, power);
  }
  //피카츄의 공격메소드를 구현하세요.
  public void attack(Player target) {
		전기쏘기(target);
      target.hp-=this.power;
	}    
	public void 전기쏘기(Player target){
		System.out.println(this.name+"가 " +target.name+"에게 전기를 쏩니다.");
	}
}
