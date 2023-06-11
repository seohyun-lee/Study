package 장소;


import Main.*;

import java.util.Scanner;

import Animal.*;


public class 동물농장 extends Place implements Escapeable{
	private static 동물농장 instance = null;
	숲속 forest = 숲속.getInstance();
	동물원 zoo = 동물원.getInstance();
	주머니 pocket = 주머니.getInstance();
	
	private 동물농장() { 	//기본 10마리
		this.where = "동물농장";
		animals = new 동물[10];		
	}
	private 동물농장(int size) {
		this.where = "동물농장";
		animals = new 동물[size];
	}
	
	public static 동물농장 getInstance() {
		if(instance==null) instance = new 동물농장();
		return instance;
	}
	public static 동물농장 getInstance(int size) {	
		if(instance==null) instance = new 동물농장(size);	
		return instance;
	}
	
	public void show() {
		System.out.println("==========================================================================");
		System.out.print("## 동물농장에 있는 동물들 :");
		showAnimals(animals , numOfAnimals);
		
	}
	
	//동물원에서 사건발생!
	public void escape() {			    
		//Escapeable [] e = getAnimals();   //동물 [] 을 리턴					
		//탈출할 동물 고르기
		//int rand=(int)(Math.random()*100) % this.numOfAnimals;	
		//각 동물의 확률에 따라 탈출을 시도한다.
		//e[i]. 으로 접근하면 escape() 만 보인다!//e[rand].escape();		
		
		숲속 forest = 숲속.getInstance();
	    //랜덤하게 30% 확률로 탈출. 
		System.out.println("동물들은 기회만 있으면 탈출을 시도합니다!. 탈출확률은 30% 입니다.");    	
		//랜덤하게 처리하거나, 마리수를 정해놓거나~
		for(int i=0; i<numOfAnimals; i++) {
	    	int r=(int)(Math.random()*1000)%3;
	    	if(r == 1) {
	    		System.out.println(this.animals[i].이름 + "이 사냥꾼의 동물농장에서 탈출했습니다!!");
	    		forest.addAnimal(this.animals[i]);
	    		
	    		//removeAnimal
	    		this.animals[i]=this.animals[numOfAnimals-1];
	    		this.animals[numOfAnimals-1]=null;
	    		numOfAnimals--;
	    	} 
	    	else System.out.println(this.animals[i].이름 +"이 탈출에 실패했습니다.ㅜ ");
		}
	}
	public void farmMenu() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1.주머니의 동물을 농장에 맡기기  /  2.농장에 있는 동물 보기 ");
			System.out.println("3.농장에 있는 동물을 멀리 놓아주기  /  4.농장의 동물을 동물원에 맡기기  /  0.되돌아가기");
			System.out.println("-----------------------------------------------------------------------");

			int menu=sc.nextInt();
			동물 selected;
			
			if(menu==0) {
				System.out.println("프로그램 종료!");
				break;
			}
			switch (menu) {
				case 1:
					if(pocket.numOfAnimals==0) {
						System.out.println("맡길 동물이 없습니다.");
						break;
					}
					System.out.println("어떤 동물을 맡기시겠습니까? 맡길 동물이 몇 번째 순서인지 입력하세요");
					selected = pocket.select();
					if(selected==null) {
						System.out.println("잘못 입력하였습니다.");
					}
					else if(this.numOfAnimals<10) {
						pocket.removeAnimal(selected);
						System.out.println(selected.이름+"를 농장에 맡겼습니다.");
					}
					this.addAnimal(selected);
					break;
				case 2:
					this.show();
					break;
				case 3:
					if(this.numOfAnimals==0) {
						System.out.println("놓아줄 동물이 없습니다.");
						break;
					}
					System.out.println("어떤 동물을 놓아줄까요? 놓아줄 동물이 몇 번째 순서인지 입력하세요");
					selected = this.select();
					if(selected==null) {
						System.out.println("잘못 입력하였습니다.");
					}
					if(selected==null) {
						System.out.println("잘못 입력하였습니다.");
					}
					else if(forest.numOfAnimals<10) {
						this.removeAnimal(selected);
						System.out.println(selected.이름+"를 놓아주었습니다.");
					}
					break;
				case 4:
					if(this.numOfAnimals==0) {
						System.out.println("맡길 동물이 없습니다.");
						break;
					}
					System.out.println("어떤 동물을 맡기시겠습니까? 맡길 동물이 몇 번째 순서인지 입력하세요");
					selected = this.select();
					if(selected==null) {
						System.out.println("잘못 입력하였습니다.");
					}
					else if(zoo.numOfAnimals<4) {
						this.removeAnimal(selected);
						System.out.println(selected.이름+"를 동물원에 맡겼습니다.");
					}
					zoo.addAnimal(selected);
					break;
			}
		}
	}
}








