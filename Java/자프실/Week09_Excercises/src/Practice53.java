
public class Practice53 {

	public static void main(String[] args) {
		try {
			int n = Integer.parseInt("abc");
			System.out.println("try: " + n);
		} catch (NumberFormatException e) {
			System.out.println("���� ���� ����");
		} finally {
			System.out.println("finally");
		}
		System.out.println("continue running");
	}
	
}
/*��� ���:
���� ���� ����
finally
continue running
*/