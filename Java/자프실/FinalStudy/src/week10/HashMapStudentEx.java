package week10;

import java.util.HashMap;
import java.util.Scanner;

class Student {
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id=id;
		this.tel=tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}	
}
public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("Ȳ����", new Student(1, "010-111-1111"));
		map.put("���繮", new Student(2, "010-222-2222"));
		map.put("�賲��", new Student(3, "010-333-3333"));
		Scanner sc = new Scanner(System.in);
		while(true) { //while(1)�� �ϸ� �� �ǰ� while(true)��� �ϱ�!!
			System.out.println("�˻��� �̸�? ");
			String name = sc.nextLine();
			if(name.equals("exit"))
				break;
			Student stu = map.get(name);
			if(stu==null)
				System.out.println("���� ����Դϴ�.");
			else 
				System.out.println("id: "+stu.getId()+", ��ȭ: "+stu.getTel());
		}
		sc.close();
	}

}
