package 기말공부;


public class GenericTest {

	public static void main(String[] args) {
        Box<Integer> box1 = Util.<String, Integer>boxing("aaa"); //method의 T를 지정
        //Util클래스에 static 메서드 호출했음
        //public static<T> Box<T> boxing(T t)라서 <Integer>씀
        
        Box<String> box2 = Util.boxing("암묵적호출");
        System.out.println(box1.getT());
        System.out.println(box2);
    }
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
    //테스트 용으로 매개변수 U로 해본것
    public static<U, T> Box<T> boxing(U t) { //여기서 Box<T>가 리턴타입임!!! boxing이 메소드임.
        Box<T> box = new Box<T>();
        box.setT(t);
        return box;
    } 
 }