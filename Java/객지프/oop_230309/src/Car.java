
public class Car {

	private int ���ᷮ;
	private int ����Ÿ�;
	
	public void �����̱�() {
		int i;
		if(this.���ᷮ ==0) {
			System.out.println("���ᷮ�� 0�Դϴ�");
			return;
		}
		
		for(i=0;i<���ᷮ;i++) {
			System.out.println("�ڵ����� �޸��ϴ�");
			���ᷮ--;
			����Ÿ�++;
		}
	}
	public void �����ϱ�() {
		this.���ᷮ +=10;
		System.out.println("�����Ϸ�");
	}

}
