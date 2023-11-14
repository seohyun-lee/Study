
public class MyArrayAlg { //인터페이스 상속 가능
	
	static <T extends Comparable<T>> T getMax(T[] array){
		try {
			if (array == null)
	            throw new ImproperArraySizeException("잘못된 배열 크기입니다 : null\n");
			if (array.length == 0)
	            throw new ImproperArraySizeException("잘못된 배열 크기입니다 : 0\n");
		} catch (ImproperArraySizeException e) {
            return null;
        }
		T max = array[0];
		
		for(int i=0; i<array.length; i++) {
			if(array[i].compareTo(max) > 0)
				max = array[i];
		}
		return max;
	}
	
	static <T extends Comparable<T>> T getMin(T[] array){
		try {
			if (array == null)
	            throw new ImproperArraySizeException("잘못된 배열 크기입니다 : null\n");
			if (array.length == 0)
	            throw new ImproperArraySizeException("잘못된 배열 크기입니다 : 0\n");
		} catch (ImproperArraySizeException e) {
            return null;
        }
		T min = array[0];
		
		for(int i=0; i<array.length; i++) {
			if(array[i].compareTo(min) < 0)
				min = array[i];
		}
		return min;
	}
	
	static <T extends Comparable<T>> MyPair<T> getMinMax(T[] array){
		try {
			if (array == null)
	            throw new ImproperArraySizeException("잘못된 배열 크기입니다 : null\n");
			if (array.length == 0)
	            throw new ImproperArraySizeException("잘못된 배열 크기입니다 : 0\n");
		} catch (ImproperArraySizeException e) {
            return null;
        }
		T max = array[0];
		T min = array[0];
		
		for(int i=0; i<array.length; i++) {
			if(array[i].compareTo(max) > 0)
				max = array[i];
			if(array[i].compareTo(min) < 0)
				min = array[i];
		}
		return new MyPair<T>(max, min);
	}
}
