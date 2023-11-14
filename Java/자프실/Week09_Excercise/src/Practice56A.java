import java.util.Scanner;

public class Practice56A {

	public static void main(String[] args) {
		int[] iArray = getInput();
	
		for (int i=0; i<iArray.length; i++) {
			iArray[i] = i*20;
		}
		for (int x: iArray) {
			System.out.print(x + "\t");
		}
	}
	
	public static int[] getInput() {
		Scanner s = new Scanner(System.in);
		int num;
		int[] rslt;
		
		try {
			System.out.print("배열의 크기를 입력하세요: ");
			String str = s.next();
			num = Integer.parseInt(str);
			rslt = makeArray(num);
		} catch (NumberFormatException e) {
			System.out.println("잘못된 형식의 숫자입니다.");
			rslt = new int[0];
		}
		s.close();
		return rslt;
	}

	public static int[] makeArray(int size) {
		int[] rslt;
		try {
			rslt = new int[size];
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 크기가 음수입니다.");
			rslt = new int[0];
		}
		return rslt;
	}
}


class Practice56B {

	public static void main(String[] args) {
		int[] iArray = getInput();
			
		for (int i=0; i<iArray.length; i++) {
			iArray[i] = i*20;
		}
		for (int x: iArray) {
			System.out.print(x + "\t");
		}
	}
	
	public static int[] getInput() {
		Scanner s = new Scanner(System.in);
		int num;
		int[] rslt;
		
		try {
			System.out.print("배열의 크기를 입력하세요: ");
			String str = s.next();
			num = Integer.parseInt(str);
			rslt = makeArray(num);
		} catch (NumberFormatException e) {
			System.out.println("잘못된 형식의 숫자입니다.");
			rslt = new int[0];
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 크기가 음수입니다.");
			rslt = new int[0];
		}
		s.close();
		return rslt;
	}

	public static int[] makeArray(int size) throws NegativeArraySizeException {
		int[] rslt = new int[size];
		return rslt;
	}
}


class Practice56C {

	public static void main(String[] args) {
		int[] iArray;
		try {
			iArray = getInput();
			
			for (int i=0; i<iArray.length; i++) {
				iArray[i] = i*20;
			}
			for (int x: iArray) {
				System.out.print(x + "\t");
			}
		} catch (NumberFormatException e) {
			System.out.println("잘못된 형식의 숫자입니다.");
		}
	}
	
	public static int[] getInput() throws NumberFormatException {
		Scanner s = new Scanner(System.in);
		int num;
		int[] rslt;
		
		System.out.print("배열의 크기를 입력하세요: ");
		String str = s.next();
		num = Integer.parseInt(str);
		rslt = makeArray(num);
		s.close();
		return rslt;
	}

	public static int[] makeArray(int size) {
		int[] rslt;
		try {
			rslt = new int[size];
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 크기가 음수입니다.");
			rslt = new int[0];
		}
		return rslt;
	}
}


class Practice56D {

	public static void main(String[] args) {
		int[] iArray;
		try {
			iArray = getInput();
			
			for (int i=0; i<iArray.length; i++) {
				iArray[i] = i*20;
			}
			for (int x: iArray) {
				System.out.print(x + "\t");
			}
		} catch (NumberFormatException e) {
			System.out.println("잘못된 형식의 숫자입니다.");
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 크기가 음수입니다.");
		}
	}
	
	public static int[] getInput() throws NumberFormatException, NegativeArraySizeException {
		Scanner s = new Scanner(System.in);
		int num;
		int[] rslt;
		
		System.out.print("배열의 크기를 입력하세요: ");
		String str = s.next();
		num = Integer.parseInt(str);
		rslt = makeArray(num);
		s.close();
		return rslt;
	}

	public static int[] makeArray(int size) throws NegativeArraySizeException {
		int[] rslt = new int[size];
		return rslt;
	}
}

