import java.util.Scanner;

public class Practice3 {

	static Scanner sc = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("====================================");
		System.out.println("1. ������� ������    2. ���� ���ø���Ʈ    0. ����");
		System.out.println("====================================");
		System.out.print("����: ");
	}
	
	public static void myGugudan() {
		System.out.print("��ܱ��� ����Ͽ� ����ұ��? ");
		int n = sc.nextInt();
		System.out.println("¦�� ���: 0, Ȧ�� ���: 1�� �Է��ϼ���");
		int checker=sc.nextInt();
		for (int i=1;i<=n;i++){
			for (int j=1;j<=9;j++){
				if((i*j)%2==checker)
					System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
	}
	public static void myWishList() {
		System.out.print("���� ������ ���� ������ �? ");
		int n = sc.nextInt();
		
		int price, money=0;
		for(int i=0; i<n; i++) {
			System.out.printf("(%d): ", i+1);
			sc.nextLine();
			System.out.print("    ����: ");
			price=sc.nextInt();
			money+=price;
		}
		System.out.printf("�ʿ��� �� �ݾ��� %d�� �Դϴ�.", money);
		sc.close();
	}
	
	public static void main(String[] args) {
		int menu;
		while(true) {
			showMenu();
			menu=sc.nextInt();
			if(menu==0) break;
			else if(menu==1) myGugudan();
			else if(menu==2) myWishList();
			else System.out.println("�߸��� �����Դϴ�.");
		}
	}

}
