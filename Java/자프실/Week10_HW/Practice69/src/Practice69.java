
public class Practice69 {

	public static void main(String[] args) {
		Integer[] iArray = {30, 20, 10, 40};
		Double[] dArray = {3.14, 2.35, 1.23, 1.85};
		String[] sArray = {"apple", "banana", "orange"};
		System.out.println("Integer[] iArray = {30, 20, 10, 40};");
		System.out.println("Double[] dArray = {3.14, 2.35, 1.23, 1.85};");
		System.out.println("String[] sArray = {\"apple\", \"banana\", \"orange\"};");
		System.out.println();
		System.out.println("������ �迭���� ���� ū �� : "+MyArrayAlg.getMax(iArray));
		System.out.println("������ �迭���� ���� ���� �� : "+MyArrayAlg.getMin(iArray));
		System.out.println("������ �迭���� �� �� : "+MyArrayAlg.getMinMax(iArray));
		System.out.println();
		System.out.println("�Ǽ��� �迭���� ���� ū �� : "+MyArrayAlg.getMax(dArray));
		System.out.println("�Ǽ��� �迭���� ���� ���� �� : "+MyArrayAlg.getMin(dArray));
		System.out.println("�Ǽ��� �迭���� �� �� : "+MyArrayAlg.getMinMax(dArray));
		System.out.println();
		System.out.println("���ڿ� �迭���� ���� ū �� : "+MyArrayAlg.getMax(sArray));	//���ڿ� �迭���� ���� ū �� : orange
		System.out.println("���ڿ� �迭���� ���� ���� �� : "+MyArrayAlg.getMin(sArray));	//���ڿ� �迭���� ���� ���� �� : apple
		System.out.println("���ڿ� �迭���� �� �� : "+MyArrayAlg.getMinMax(sArray));	//���ڿ� �迭���� �� �� : (orange, apple).
		//����: �� �ܾ ù ���ں��� ���ĺ��� �ƽ�Ű�ڵ� ���ڰ��� ��. �� ���������� ��
		System.out.println();
		System.out.println("MyArrayAlg.<Integer>getMax(new Integer[0]);");
		MyArrayAlg.<Integer>getMax(new Integer[0]);
		System.out.println("MyArrayAlg.<Integer>getMax(null);");
		MyArrayAlg.<Integer>getMax(null);
		System.out.println("MyArrayAlg.<Double>getMin(new Double[0]);");
		MyArrayAlg.<Double>getMin(new Double[0]);
		System.out.println("MyArrayAlg.<String>getMinMax(new String[0]);");
		MyArrayAlg.<String>getMinMax(new String[0]);
	}

}
