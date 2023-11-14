import java.util.Scanner;

public class Practice74 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ RandomList�� �����մϴ�.");
		RandomList<Integer> randList = new RandomList<>();
		int n=0;
		do {
			System.out.print("���ϴ� ����� �����ϼ��� (1-�߰�/2-���/3-������/4-����) : ");
			n = sc.nextInt();
			switch(n) {
				case 1:
					System.out.print("�߰��ϰ� ���� ������ ������ �Է��ϼ���: ");
					int size = sc.nextInt();
					for(int i=0; i<size; i++) {
						System.out.print("["+i+"]�� ���� : ");
						randList.add(sc.nextInt());
					}
					break;
				case 2:
					randList.print();
					break;
				case 3:
					Integer element = randList.select();
					if(element != null)
						System.out.println("������ ���� ��� : "+element);
					break;
				default:
					System.out.println("���α׷��� �����մϴ�.");
			}
			System.out.println();
		} while (n != 4);
		sc.close();
	}
}
