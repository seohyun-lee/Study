
public class Practice68 {

	public static void main(String[] args) {
		NumPair<Integer> i1 = new NumPair<>(10, 20);
		System.out.println("Integer ������ i1: "+i1.toString());
		System.out.println();
		System.out.println("������ ������ i1: "+i1.toString());
		NumPair<Integer> i2 = i1.flip();
		System.out.println("Flip ���� ��� ������ i2: "+i2.toString());
		System.out.println();
		System.out.println("i1�� ��հ� : "+i1.calcAverage());
		System.out.println("i2�� ��հ� : "+i2.calcAverage());
		System.out.println();
		NumPair<Double> d1 = new NumPair<>(1.25, 4.32);
		System.out.println("Double ������ d1: "+d1.toString());
		NumPair<Double> d2 = d1.flip();
		System.out.println("Flip ���� ��� ������ d2: "+d2.toString());
		System.out.println();
		System.out.println("d1�� ��հ� : "+d1.calcAverage());
		System.out.println("d2�� ��հ� : "+d2.calcAverage());

		//i1 = d1.flip()�� �õ��ϸ� ���� �߻�. ������?
		/* i1 = d1.flip()�� �õ��ϸ� ���� �߻�. ������?
		 * ������ Ÿ���� NumPair<Double>�� NumPair<Integer>�� ����ġ�ϱ� �����̴�.
		*/

		//String ������ s: (���, ��)
		//String ������ ��ü�� ������� �ϸ� ���� �߻�. ������?
		/* String ������ ��ü�� ������� �ϸ� ������ �߻��ϴ� ����:
		 * String�� Number Ŭ������ ���� Ŭ������ �ƴϴ�.
		 * NumPair<T extends Number> �̷��� extends Ű����� Ŭ������ ���Ѽ� ������ �־��� ������
		 * ���ʸ� Ÿ�� �Ű����� T�� Number �Ǵ� Number�� ���� Ŭ������ ���ȴ�.
		*/
	}

}