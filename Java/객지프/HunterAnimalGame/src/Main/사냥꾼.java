package Main;
import Animal.강아지;
import Animal.독수리;
import Animal.동물;
import Animal.뱀;
import Animal.상어;
import Animal.고래;
import 장소.*;

public class 사냥꾼 {
	//동물[] 동물농장;
	동물농장 farm = 동물농장.getInstance();
	숲속 forest = 숲속.getInstance();
	동물원 zoo = 동물원.getInstance();
	주머니 pocket = 주머니.getInstance();

	public int money=100; //기본 100만원
	public 사냥꾼() {
		System.out.println("########################################################");
		System.out.println(" 두둥 ! 숲속에 사냥꾼이 나타났습니다! 사냥을 시작합니다.");
		System.out.println("########################################################");
	} 
	
    public 사냥꾼(int size){
    	this();
    	동물농장 farm = 동물농장.getInstance(size);
    }
    
    public void showInfo() {
    	System.out.println("------------------------------------------------");
    	System.out.println("사냥꾼의 동물농장 크기 : " + farm.getSize());
    	System.out.println("사냥꾼의 money: " + this.money +"만원");    	
    	System.out.println("동물농장에 있는 동물 수: " + farm.numOfAnimals);
    	System.out.println("------------------------------------------------");
    }
 
	public void show() {
		System.out.println("==========================================================================");
		System.out.print("##  사냥꾼의 주머니 : ");	
		pocket.showAnimals();
	}
	
    public boolean 사냥하기(동물 ani){    	
    	System.out.println("무조건 성공! 뭐든지 잡고 본다! " + ani.이름);    	
    	return true;
    }
 
    public boolean 사냥하기(강아지 dog){
    	boolean signal = doRandom(dog);
    	return signal;
    }
   
    public boolean 사냥하기(뱀 snake){    	
    	boolean signal = doRandom(snake);
    	return signal;  
    }
    
    public boolean 사냥하기(독수리 bird){    	
    	boolean signal = doRandom(bird);
    	return signal;  
    }
    
    public boolean 사냥하기(상어 shark){
    	System.out.println("상어는 사냥할 수 없어요!");
    	return false;  
    }
    
    public boolean 사냥하기(고래 whale){
    	System.out.println("고래는 사냥할 수 없어요!");
    	return false;  
    }
    
    //동물들의 사냥확률에 따라 사냥성공여부 결과 리턴
    public boolean doRandom(동물 animal) {
    	int r=(int)(Math.random()*1000)%100;
    	if( r < animal.get사냥확률()) {
    		System.out.println(animal.이름 + " 사냥 성공!");
    		return true;
    	}
    	else System.out.println(animal.이름 + " 사냥 실패!");    	
    	return false;
    }
    
    //장소별로 오버로딩 가능
    public void 사냥하기() {
    	if (forest.numOfAnimals < 1) {
			System.out.println("사냥할 동물이 없어요.");
			forest.show();
			return;
		}
    	else {
			System.out.println("사냥 시작!");
    	}
    	
		forest.show();
    	//1. 동물배열중에서 랜덤하게 아무거나 고르기 : getAnimal()
    	동물 ani = forest.getAnimal();
    	boolean sig=false;    
    
    	//2. 동물에 따라 사냥확률 계산하기
    	if (ani instanceof 강아지) sig=사냥하기((강아지)ani);
    	else if (ani instanceof 뱀) sig=사냥하기((뱀)ani);
    	else if (ani instanceof 독수리) sig=사냥하기((독수리)ani);
    	else if (ani instanceof 상어) sig=사냥하기((상어)ani);
    	else sig = 사냥하기(ani);  // 동물을 인자로 받는 사냥하기가 호출됨.

    	//3. 숲에서 removeAnimal(), 주머니에 addAnimal() 
    	if(sig==true) {
    		if(pocket.numOfAnimals==6) {
    			System.out.println("주머니가 가득 찼습니다! 놓아줄 동물의 번호를 입력하세요.");
    			System.out.println(pocket.select().이름+"를 놓아주었다. 바이바이!");
    			pocket.removeAnimal(pocket.select());
        		pocket.addAnimal(ani);
    		}
    		else {
    			System.out.println("주머니에 "+ani.이름+"를 넣었다!");
    			pocket.addAnimal(ani);
    		}
    		this.show();
    		forest.removeAnimal(ani);
    	}    
    }
  
}
