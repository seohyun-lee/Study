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
					fout.write("\r\n", 0, 2); //한 줄을 띄기 위해
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
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
			System.out.println("파일 오픈 오류");
		} catch (IOException e) {
			System.out.println("입출력 오류");
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
			System.out.print("원하는 작업을 선택하세요 (0-종료/1-열기/2-저장/3-계좌업무): ");
			n = sc.nextInt();
			switch (n) {
				case 0:
					System.out.println("프로그램을 종료합니다.");
					break;
				case 1:
					System.out.print("파일 이름을 입력하세요: ");
					fname = sc.next();
					accounts  = new ArrayList<>();
					load(fname, accounts);
					break;
				case 2:
					if (accounts == null || accounts.size() == 0 ) {
						System.out.println("저장할 내용이 없습니다.");
						break;
					}
					System.out.print("새 파일 이름을 입력하세요: ");
					fname = sc.next();
					save(fname, accounts);
					System.out.println("잔고현황이 성공적으로 저장되었습니다.");
					break;
				case 3:
					if (fname == null || fname.length() == 0) {
						System.out.println("아직 파일을 선택하지 않았습니다.");
						break;
					}
					System.out.print("업데이트할 계좌번호를 입력하세요: ");
					int index = sc.nextInt() - 1;
					System.out.print("원하는 계좌 작업을 선택하세요 (1-입금/2-출금): ");
					int select = sc.nextInt();
					int money;
					if (select == 1) {
						System.out.print("입금액을 입력하세요: ");
						money = sc.nextInt();
						if (money < 0) {
							System.out.println("음수 금액을 입금할 수 없습니다.");
						} else {
							accounts.get(index).deposit(money);
							System.out.println("입금이 완료되었습니다.");
						}
					} else if (select == 2) {
						System.out.print("출금액을 입력하세요: ");
						money = sc.nextInt();
						if (money < 0) {
							System.out.println("음수 금액을 출금할 수 없습니다.");
						} else if (money > accounts.get(index).getBalance()) {
							System.out.println("계좌에 잔액이 부족해서 출금할 수 없습니다.");
						} else {
							accounts.get(index).withdraw(money);
							System.out.println("출금이 완료되었습니다.");
						}
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
			} //switch 끝나는 위치
			if (n == 0)
				break;
			if (accounts != null && accounts.size() != 0 && (n == 1 || n == 3)) {
				System.out.println("\n현재 잔고현황입니다.");
				System.out.println("계좌번호\t계좌주\t잔고");
				printAccounts(accounts);
			}
			System.out.println();
		}
		sc.close();
	}
	
}
