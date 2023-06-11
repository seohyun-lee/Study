package Main;
import java.util.Scanner;

import Animal.강아지;
import Animal.독수리;
import Animal.동물;
import Animal.뱀;
import Animal.상어;
import Animal.고래;
import 장소.동물농장;
import 장소.동물원;
import 장소.숲속;
import 장소.바다;
import 장소.주머니;


public class Main {

	public static void menu보기() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("숲속에 동물생성:  1.강아지      2.뱀                3.독수리");
		System.out.println("바다에 동물생성:  4.상어      5.고래   ");
		System.out.println("   이동하기  : 11.숲속가기  12.바다가기 13.동물농장가기  14.동물원가기 ");
		System.out.println("   상태 보기  : 21.숲속보기  22.바다보기 23.동물농장보기   24.동물원보기  25.주머니보기  0.종료");
		System.out.println("-----------------------------------------------------------------------");
	}
 

    public static void main (String[] args) throws InterruptedException{

    	Scanner input = new Scanner(System.in);
    	숲속 forest = 숲속.getInstance();
    	바다 sea = 바다.getInstance();
    	동물원 zoo = 동물원.getInstance();
    	동물농장 farm = 동물농장.getInstance();
    	주머니 pocket = 주머니.getInstance();
		int menu=0 ; 
		
		//사냥꾼 생성
		사냥꾼 hunter  = new 사냥꾼();
		자동차 car 	= new 자동차();
		
		hunter.showInfo();

		//강아지 한마리 생성  후 사냥!
		강아지 d = new 강아지("흰둥이");
		boolean sig=hunter.사냥하기(d);
		
		//사냥을 성공했다면, 주머니에 넣기
		if (sig==true) pocket.addAnimal(d);
		hunter.show();
		//////////////////////////////////////////////////////

		//메뉴로 동작시키기
		System.out.println("------------------------"
				+ "------------------------------");
		System.out.println("메뉴로 동작시키기");
		int i=0;
		while(true) {
			menu보기();
			
			System.out.print("menu: ");
			menu= input.nextInt();
			if(menu==0) {
				System.out.println("프로그램 종료!");
				break;
			}			
			switch (menu) {
				case 1:
					forest.addAnimal(new 강아지("댕댕이" + (i++)));
					break;
				case 2:
					forest.addAnimal(new 뱀("슈슈뱀" + (i++)));
					break;
				case 3:
					forest.addAnimal(new 독수리("수리수리" + (i++)));
					break;
				case 4:
					sea.addAnimal(new 상어("샤크" + (i++)));
					break;				
				case 5:
					sea.addAnimal(new 고래("고래고래" + (i++)));
					break;
				/////////////////////////////////////////
				case 11: //숲속에서-사냥하기()
					car.움직이기();
					System.out.println("사냥하러 가는중...");
					Thread.sleep(1000);
					hunter.사냥하기();
					break;
				case 12: //바다가기
					car.움직이기();
					System.out.println("바다로 이동중...");
					Thread.sleep(1000);
		    		System.out.println("사냥꾼은 잠수병이라 바다에서는 사냥할 수 없어요~");
		    		sea.show();
					break;
				case 13: //동물농장가기
					car.움직이기();
					System.out.println("동물농장으로 이동중...");
					Thread.sleep(1000);
					farm.farmMenu();
					break;
				case 14: //동물원가기
					car.움직이기();
					System.out.println("동물원으로 이동중...");
					Thread.sleep(1000);
					zoo.work();
					break;
					/////////////////////////////////////////
				case 21: //숲속활동보기- 놀기()
					forest.놀기();
					break;
				case 22: //바다활동보기- 놀기()
					sea.놀기();
					break;
				case 23: //동물농장활동보기 - 탈출시도!
					farm.escape();
					break;
				case 24: //동물원 활동보기 - 일하기();	
					zoo.work();
					break;
				case 25: //주머니 동물 확인하기
					pocket.show();
					break;
				default:
					System.out.println("그런 메뉴는 없습니다.");
					break;	
				}				
		}        
    }

}
