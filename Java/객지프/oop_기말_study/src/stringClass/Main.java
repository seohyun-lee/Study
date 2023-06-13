package stringClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String java = "Java";
		String cpp = "C++";
		
		int res = java.compareTo(cpp); //res=7. j가 c보다 7만큼 뒤에있음. 음수, 0, 양수로 조건문 범위결정할 것.
		System.out.println(res);
		if(res==0) System.out.println("The same");
		else if(res<0) System.out.println(java +"<"+cpp);
		else System.out.println(java +">"+cpp);
	}
	
	/*public void f() {
		String java = "Java";
		String cpp = "C++";
		
		int res = java.compareTo(cpp); //res는1
		System.out.println(res);
		if(res==0) System.out.println("The same");
		else if (res < 0) System.out.println(java+"<"+cpp);
		else System.out.println(java+">"+cpp);
	}*/

}
