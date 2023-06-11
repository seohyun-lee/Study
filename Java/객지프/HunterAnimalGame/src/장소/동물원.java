package 장소;


import Main.*;
import Animal.*;


public class 동물원 extends Place implements Workable, Escapeable{
	private static 동물원 instance = null;	
	
	private 동물원() { 	//기본 4마리
		this.where = "동물원";
		animals = new 동물[4];		
	}
	
	public static 동물원 getInstance() {
		if(instance==null) instance = new 동물원();
		return instance;
	}
	
	public  void show() {
		System.out.println("==========================================================================");
		System.out.print("## 동물원에 있는 동물들 :");
		showAnimals(animals , numOfAnimals);
	}
	
	//동물원 동물들의 재주부리기는 각 동물클래스에서 적절히 구현하세요
	public void work() {
		System.out.println("동물들이 동물원에서 일을 합니다.");
		System.out.println("재주를 부려서 돈을 많이 벌면 사냥꾼도 좋아할 거예요.");		
		Workable [] w = getAnimals();  // Workable 한 기능으로 접근하도록 설정
	
		for(int i=0; i<numOfAnimals; i++) {			
			w[i].재주부리기();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//일하다가 탈출
			int rand=(int)(Math.random()*100) % 100;
			if(rand<10) {
				escape();
			}
		}
			
	}
	
	//동물원에서 사건발생!
	public void escape() {			
    
		Escapeable [] e = getAnimals();   //동물 [] 을 리턴					
		//탈출할 동물 고르기
		int rand= (int)(Math.random()*100) % this.numOfAnimals;
		
		//각 동물의 확률에 따라 탈출을 시도한다.
		//e[i]. 으로 접근하면 escape() 만 보인다!
		e[rand].escape();
	}
	
}








