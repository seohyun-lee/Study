
public class MyArray {
	static <T> T pick(T[] array, int index)	{
		if (index < 0 || index >= array.length) {
			System.out.print("인덱스가 범위를 벗어났습니다 >> ");
			return null;
		}
		return array[index];
	}

	static <T> T pickNew(T[] array, int index) {
		try {
			if (index < 0 || index >= array.length) {
				throw new WrongArrayIndexException("인덱스가 범위를 벗어났습니다 >> ");
			}
			return array[index];
		} catch (WrongArrayIndexException e) { //사용자 정의 예외
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
