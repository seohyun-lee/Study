package 장소;


import Main.*;
import Animal.*;

import java.util.Scanner;


public class 주머니 extends Place  {
	private static 주머니 instance = null;	
	
	private 주머니() { 	//기본6마리
		this.where = "주머니";
		animals = new 동물[6];		
	}
	
	public static 주머니 getInstance() {
		if(instance==null) instance = new 주머니();
		return instance;
	}
	
	public  void show() {
		System.out.println("==========================================================================");
		System.out.print("## 주머니에 있는 동물들 :");
		showAnimals(animals , numOfAnimals);
	}

}
