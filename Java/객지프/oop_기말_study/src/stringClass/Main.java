package stringClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String java = "Java";
		String cpp = "C++";
		
		int res = java.compareTo(cpp); //res=7. j�� c���� 7��ŭ �ڿ�����. ����, 0, ����� ���ǹ� ���������� ��.
		System.out.println(res);
		if(res==0) System.out.println("The same");
		else if(res<0) System.out.println(java +"<"+cpp);
		else System.out.println(java +">"+cpp);
	}
	
	/*public void f() {
		String java = "Java";
		String cpp = "C++";
		
		int res = java.compareTo(cpp); //res��1
		System.out.println(res);
		if(res==0) System.out.println("The same");
		else if (res < 0) System.out.println(java+"<"+cpp);
		else System.out.println(java+">"+cpp);
	}*/

}
