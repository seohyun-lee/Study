package wrapper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = 10; //Ŭ������ ������ ��ü���� (���� ���� ���� ����Ű�� ��ü����)
		int ii = 10; //���� �ٸ���. 
		
		String s = "123";
		//valueOf()�� parseInt()��� ���ڸ� �ִ� ���ڿ��� ���ڷ� �ٲܼ��ִ�
		System.out.println(Integer.valueOf(s));
		System.out.println(Integer.parseInt(s));
		
		System.out.println(i.toBinaryString(i));
		System.out.println(Integer.toBinaryString(ii));
		System.out.println(Integer.toBinaryString(11));
		System.out.println(i.getClass().getSimpleName());
		
		
	}
	
	/*public void f() {
		Integer i =10; //Ŭ������ ������ ��ü����. ���� ���� ���� ����Ų��.
		int i2 = 10; //i�� ���� �ٸ���
		System.out.println(i.toBinaryString(i));
		System.out.println(Integer.toBinaryString(i2));
		System.out.println(i.getClass().getSimpleName());
	}*/

}
