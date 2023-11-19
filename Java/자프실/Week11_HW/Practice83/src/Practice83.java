import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice83 {
	
	public static void save(String fname, ArrayList<BankAccount> list) {
		try {
			FileWriter fout = new FileWriter(fname);
			for (int i = 0; i < list.size(); i++) {
				fout.write((i+1) + "\t" + list.get(i));
				if (i != list.size())
					fout.write("\r\n", 0, 2); //�� ���� ��� ����
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}

	public static void load(String fname, ArrayList<BankAccount> list) {
		try {
			FileReader fin = new FileReader(fname);
			String owner = "";
			int balance = 0;
			int col = 1;
			int c;
			while ((c = fin.read()) != -1) {
				if (c == '\t') {
					col++;
				} else if (c == '\n') {
					if (owner != "") {
						list.add(new BankAccount(owner, balance));
					}
					owner = "";
					balance = 0;
					col = 1;
				} else {
					if (col == 2) {
						owner += (char)c;
					}
					else if (col == 3) {
						if (c >= '0' && c <= '9') {
							balance = balance * 10 + (c - '0');
						}
					}
				}
			}
			if (owner != "") {
				list.add(new BankAccount(owner, balance));
			}			
			fin.close();
		} catch (FileNotFoundException e) {
			System.out.println("���� ���� ����");
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}
	
	private static void printAccounts(ArrayList<BankAccount> list) {		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+"\t"+list.get(i));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<BankAccount> accounts = null;
		int n;
		String fname = "";
		while(true) {
			System.out.print("���ϴ� �۾��� �����ϼ��� (0-����/1-����/2-����/3-���¾���): ");
			n = sc.nextInt();
			switch (n) {
				case 0:
					System.out.println("���α׷��� �����մϴ�.");
					break;
				case 1:
					System.out.print("���� �̸��� �Է��ϼ���: ");
					fname = sc.next();
					accounts  = new ArrayList<>();
					load(fname, accounts);
					break;
				case 2:
					if (accounts == null || accounts.size() == 0 ) {
						System.out.println("������ ������ �����ϴ�.");
						break;
					}
					System.out.print("�� ���� �̸��� �Է��ϼ���: ");
					fname = sc.next();
					save(fname, accounts);
					System.out.println("�ܰ���Ȳ�� ���������� ����Ǿ����ϴ�.");
					break;
				case 3:
					if (fname == null || fname.length() == 0) {
						System.out.println("���� ������ �������� �ʾҽ��ϴ�.");
						break;
					}
					System.out.print("������Ʈ�� ���¹�ȣ�� �Է��ϼ���: ");
					int index = sc.nextInt() - 1;
					System.out.print("���ϴ� ���� �۾��� �����ϼ��� (1-�Ա�/2-���): ");
					int select = sc.nextInt();
					int money;
					if (select == 1) {
						System.out.print("�Աݾ��� �Է��ϼ���: ");
						money = sc.nextInt();
						if (money < 0) {
							System.out.println("���� �ݾ��� �Ա��� �� �����ϴ�.");
						} else {
							accounts.get(index).deposit(money);
							System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
						}
					} else if (select == 2) {
						System.out.print("��ݾ��� �Է��ϼ���: ");
						money = sc.nextInt();
						if (money < 0) {
							System.out.println("���� �ݾ��� ����� �� �����ϴ�.");
						} else if (money > accounts.get(index).getBalance()) {
							System.out.println("���¿� �ܾ��� �����ؼ� ����� �� �����ϴ�.");
						} else {
							accounts.get(index).withdraw(money);
							System.out.println("����� �Ϸ�Ǿ����ϴ�.");
						}
					} else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					}
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} //switch ������ ��ġ
			if (n == 0)
				break;
			if (accounts != null && accounts.size() != 0 && (n == 1 || n == 3)) {
				System.out.println("\n���� �ܰ���Ȳ�Դϴ�.");
				System.out.println("���¹�ȣ\t������\t�ܰ�");
				printAccounts(accounts);
			}
			System.out.println();
		}
		sc.close();
	}
	
}
