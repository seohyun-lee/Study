package Generic;

import java.util.ArrayList;
import java.util.List;

public class Store<T> {
	private T something;

	//ArrayList<T> list = new ArrayList<T>();
	// List<T> list = new ArrayList<T>(); 가능한 코드
	
	public List<T> list = new ArrayList<T>();
	
	public T getSomething() {
		return something;
	}

	public void setSomething(T something) {
		this.something = something;
	}

}

class Store2<T>{
	private T something;
	public List<T> list = new ArrayList<T>();
	/*
	 * 이때 ArrayList<T> list = enw ArrayList<T>();와 돌링하다
	 */
	public T getSomething() {
		return something;
	}
	public void setSomething(T something) {
		this.something = something;
	}
	
	static <T> T f() {
		return null;
		
	}
	//여기서 <T>는 제너릭메서드의 지역변수라고 생각하자
	static <T extends Store2> void f2() {
		
	}
	
	public static void printAll(ArrayList<? extends Test> list1, ArrayList<? extends Test> list2) {
        // 로직
		//printAll이런경우 매개변수에 일일이 타입제한하는것이 필요했다...
	}
    
	public static <T extends Test> void printAll2(ArrayList<T> list1, ArrayList<T> list2) {
        // 로직
		//printAll2같은경우 제너릭 메소드를 사용해서 바꾼것. 둘이 같은 기능을 한다.
	}
	//<T extends Comparable<? super T>>
	//: 반드시 Comparable 인터페이스를 구현한 클래스 타입이어야 하고,
	// T와 타입이 같거나 조상클래스민 ?에 가능하다
}

class Box<T> {
    private T t;
    
    public T getT() {
        return t;
    }
    
    public <U> void setT(U t2) {
        this.t = (T) t2;
    }
}

class Util {
    
    public static<U, T> Box<T> boxing(U t) { //여기서 Box<T>가 리턴타입임!!! boxing이 메소드임.
        Box<T> box = new Box<T>();
        box.setT(t);
        return box;
    } 
 }

class Main2 {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.<String, Integer>boxing("aaa"); //method의 T를 지정
        //Util클래스에 static 메서드 호출했음
        //public static<T> Box<T> boxing(T t)라서 <Integer>씀
        
        Box<String> box2 = Util.boxing("암묵적호출");
    }
}