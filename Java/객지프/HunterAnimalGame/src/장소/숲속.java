package 장소;


import Animal.강아지;
import Animal.독수리;
import Animal.동물;
import Animal.뱀;
import Animal.상어;
import Main.Playable;

public class 숲속 extends Place implements Playable  {
	private static 숲속 instance = null;	
	
	private 숲속() { 	//기본 10마리		
		this.where = "숲속";
		animals = new 동물[10];
	}	
	
	public static 숲속 getInstance() {
		
		if(instance==null) instance = new 숲속();
		return instance;
	}	

	
	public void show() {
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.print("##  숲 속에 있는 동물들 :");
		
		showAnimals(animals, numOfAnimals);
	}	
	
	public  void 놀기() {
		System.out.println("동물들이 숲 속에서 자유롭게 뛰어놉니다.");
		Playable [] p = getAnimals();  //Playable로 접근하도록 설정
		
		for(int i=0; i< numOfAnimals; i++) {
			System.out.printf("[%2d] :",i);
			p[i].놀기();	   //p[i].로 접근하면 놀기() 만 보인다.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
}
