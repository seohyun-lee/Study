package �⸻����;


public class GenericTest {

	public static void main(String[] args) {
        Box<Integer> box1 = Util.<String, Integer>boxing("aaa"); //method�� T�� ����
        //UtilŬ������ static �޼��� ȣ������
        //public static<T> Box<T> boxing(T t)�� <Integer>��
        
        Box<String> box2 = Util.boxing("�Ϲ���ȣ��");
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
    //�׽�Ʈ ������ �Ű����� U�� �غ���
    public static<U, T> Box<T> boxing(U t) { //���⼭ Box<T>�� ����Ÿ����!!! boxing�� �޼ҵ���.
        Box<T> box = new Box<T>();
        box.setT(t);
        return box;
    } 
 }