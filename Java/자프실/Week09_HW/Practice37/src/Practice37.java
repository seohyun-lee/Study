
public class Practice37 {

	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2 = new Plane(1030615, "���� 737", 75);
		Plane p3 = new Plane(2464737, "���� 747", 150);
		
		System.out.println("����Ʈ ������� �����Դϴ�.");
		System.out.println("�ĺ���ȣ: "+p1.id+"��");
		System.out.println("��: "+p1.model);
		System.out.println("�°� ��: "+p1.capacity+"��");
		
		System.out.println("������ ������� �����Դϴ�.");
		System.out.println("�ĺ���ȣ: "+p2.id+"��");
		System.out.println("��: "+p2.model);
		System.out.println("�°� ��: "+p2.capacity+"��");
		
		System.out.println("������ ������� �����Դϴ�.");
		System.out.println("�ĺ���ȣ: "+p3.id+"��");
		System.out.println("��: "+p3.model);
		System.out.println("�°� ��: "+p3.capacity+"��");
	}

}
