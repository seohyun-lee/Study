
public class MyArray {
	static <T> T pick(T[] array, int index)	{
		if (index < 0 || index >= array.length) {
			System.out.print("�ε����� ������ ������ϴ� >> ");
			return null;
		}
		return array[index];
	}

	static <T> T pickNew(T[] array, int index) {
		try {
			if (index < 0 || index >= array.length) {
				throw new WrongArrayIndexException("�ε����� ������ ������ϴ� >> ");
			}
			return array[index];
		} catch (WrongArrayIndexException e) { //����� ���� ����
			return null;
		}
	}

	static <T> void displayArray(T[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
	}
	
	static <T> void swap(T[] array, int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
