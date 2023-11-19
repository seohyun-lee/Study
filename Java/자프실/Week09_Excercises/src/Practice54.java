import java.util.Scanner;

public class Practice54 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("������ �Է��ϼ���: ");
			String str = s.next();
			
			int num = Integer.parseInt(str);
			int[] array = new int[num];
			
			for (int i=0; i<array.length; i++) {
				array[i] = i *20;
			}
		} catch (NumberFormatException e) {
			System.out.println("���� ���� ����");
		} catch (NegativeArraySizeException e) {
			System.out.println("�迭 ũ�� ���� ����");
			return;
		} catch (Exception e) {
			System.out.println("����");
		} finally {
			System.out.println("�ݵ�� ó���� ��");
			s.close();
		}

		System.out.println("continue running");
	}

}
/*
��� ���:
//0 �̻��� int ���� ������ �Է��ϸ� ���:
�ݵ�� ó���� ��
continue running

//������ �Է��ϸ� ���:
�迭 ũ�� ���� ����
�ݵ�� ó���� ��

//���� ���� �Է��ϸ� ���:
���� ���� ����
�ݵ�� ó���� ��
continue running
*/