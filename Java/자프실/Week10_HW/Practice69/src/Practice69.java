
public class Practice69 {

	public static void main(String[] args) {
		Integer[] iArray = {30, 20, 10, 40};
		Double[] dArray = {3.14, 2.35, 1.23, 1.85};
		String[] sArray = {"apple", "banana", "orange"};
		System.out.println("Integer[] iArray = {30, 20, 10, 40};");
		System.out.println("Double[] dArray = {3.14, 2.35, 1.23, 1.85};");
		System.out.println("String[] sArray = {\"apple\", \"banana\", \"orange\"};");
		System.out.println();
		System.out.println("정수형 배열에서 가장 큰 값 : "+MyArrayAlg.getMax(iArray));
		System.out.println("정수형 배열에서 가장 작은 값 : "+MyArrayAlg.getMin(iArray));
		System.out.println("정수형 배열에서 끝 값 : "+MyArrayAlg.getMinMax(iArray));
		System.out.println();
		System.out.println("실수형 배열에서 가장 큰 값 : "+MyArrayAlg.getMax(dArray));
		System.out.println("실수형 배열에서 가장 작은 값 : "+MyArrayAlg.getMin(dArray));
		System.out.println("실수형 배열에서 끝 값 : "+MyArrayAlg.getMinMax(dArray));
		System.out.println();
		System.out.println("문자열 배열에서 가장 큰 값 : "+MyArrayAlg.getMax(sArray));	//문자열 배열에서 가장 큰 값 : orange
		System.out.println("문자열 배열에서 가장 작은 값 : "+MyArrayAlg.getMin(sArray));	//문자열 배열에서 가장 작은 값 : apple
		System.out.println("문자열 배열에서 끝 값 : "+MyArrayAlg.getMinMax(sArray));	//문자열 배열에서 끝 값 : (orange, apple).
		//이유: 두 단어를 첫 글자부터 알파벳의 아스키코드 숫자값을 비교. 즉 사전순으로 비교
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
