package Generic;

import java.util.ArrayList;
import java.util.List;

public class Store<T> {
	private T something;

	//ArrayList<T> list = new ArrayList<T>();
	// List<T> list = new ArrayList<T>(); ������ �ڵ�
	
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
	 * �̶� ArrayList<T> list = enw ArrayList<T>();�� �����ϴ�
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
	//���⼭ <T>�� ���ʸ��޼����� ����������� ��������
	static <T extends Store2> void f2() {
		
	}
	
	public static void printAll(ArrayList<? extends Test> list1, ArrayList<? extends Test> list2) {
        // ����
		//printAll�̷���� �Ű������� ������ Ÿ�������ϴ°��� �ʿ��ߴ�...
	}
    
	public static <T extends Test> void printAll2(ArrayList<T> list1, ArrayList<T> list2) {
        // ����
		//printAll2������� ���ʸ� �޼ҵ带 ����ؼ� �ٲ۰�. ���� ���� ����� �Ѵ�.
	}
	//<T extends Comparable<? super T>>
	//: �ݵ�� Comparable �������̽��� ������ Ŭ���� Ÿ���̾�� �ϰ�,
	// T�� Ÿ���� ���ų� ����Ŭ������ ?�� �����ϴ�
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
    
    public static<U, T> Box<T> boxing(U t) { //���⼭ Box<T>�� ����Ÿ����!!! boxing�� �޼ҵ���.
        Box<T> box = new Box<T>();
        box.setT(t);
        return box;
    } 
 }

class Main2 {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.<String, Integer>boxing("aaa"); //method�� T�� ����
        //UtilŬ������ static �޼��� ȣ������
        //public static<T> Box<T> boxing(T t)�� <Integer>��
        
        Box<String> box2 = Util.boxing("�Ϲ���ȣ��");
    }
}