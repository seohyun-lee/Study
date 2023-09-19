package jpp_0919;

import java.util.Scanner;

public class Week03Examples {

	//1차원 배열 선언 예시
/*	public static void example01() {
		int[] myArr = new int[5];
		myArr[0] = 10;
		myArr[1] = 20;
		myArr[2] = 30;
		myArr[3] = 40;
		myArr[4] = 50;
		for (int i = 0; i < 5; i++)
			System.out.println(i + "번째 요소값 : "+ myArr[i]);
	}*/
	
	//(예제 6-1) 1차원 배열을 이용하여 문자열 저장하고 출력하기
	public static void array01() {
		String[] myArr;
		myArr = new String[3];
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			myArr[i] = s.nextLine();
		}
		
		for (int i = 0; i< 3; i++) {
			System.out.println(myArr[i] + "");
		}
	}

	//1차원 배열 초기화 예시
/*	public static void example02() {
		int[] myArr = {10, 20, 30, 40, 50};
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(i+ "번째 요소값: " + myArr[i]);
		}
	}*/

	//(예제 6-2) 1차원 배열을 이용하여 초깃값의 합과 평균 구하기
	public static void array02() {
		double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};
		double sum = 0.0;
		for (int i = 0; i < gradeArr.length; i++) {
			sum += gradeArr[i];
		}
		double average = sum / gradeArr.length;
		System.out.println("합계: "+ sum);
		System.out.format("평균: %.2f", average);
	}
	
	//2차원 배열 선언 예시
/*	public static void example03() {
		int[][] myArr = new int[2][4];
		myArr[0][0] = 2;
		myArr[0][1] = 5;
		myArr[0][2] = 7;
		myArr[0][3] = 4;
		myArr[1][0] = 9;
		myArr[1][1] = 3;
		myArr[1][2] = 2;
		myArr[1][3] = 8;
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < 4; i++) {
			sum1 += myArr[0][i];
		}
		System.out.println("첫 번째 행의 합계: " + sum1);
		for (int i = 0; i < 4; i++) {
			sum2 += myArr[1][i];
		}
		System.out.println("두 번째 행의 합계: " + sum2);
	}*/
	
	//(예제 6-3) 2차원 배열을 이용하여 과목 점수의 평균 구하기
	public static void array03() {
		double[][] marks = new double[2][3];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("학생번호" + (i + 1));
			System.out.print("국어점수 : ");
			marks[i][0] = s.nextDouble();
			System.out.print("수학점수 : ");
			marks[i][1] = s.nextDouble();
			marks[i][2] = (marks[i][0] + marks[i][1])/2;
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("학생번호" + (i + 1));
			System.out.print("국어" + ":" + marks[i][0] + " ");
			System.out.print("수학" + ":" + marks[i][1] + " ");
			System.out.println("평균" + ":" + marks[i][2] + " ");
		}
	}
	
	//2차원 배열 초기화 예시
/*	public static void exmaple04() {
		int myArr[][] = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15} };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(myArr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("myArr[0][1] 값: " + myArr[0][1]);
	}
	*/
	
	//(예제 6-4) 2차원 배열을 이용하여 두 행렬의 합 구하기
	public static void array04() {
		int rows = 2, columns = 3;
		int[][] firstMatrix = { {2, 3, 4}, {3, 2, 1} };
		int[][] secondMatrix = { {1, 2, 3}, {-4, -2, 1} };
		int[][] sum = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		System.out.println("두 행렬의 합: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(sum[i][j] + " ");
			}
		}
		System.out.println();
	}
	
	//문자열 - String 클래스의 메서드
	//문자열 메서드 사용 예시
/*	public static void example06() {
		String s = " Java Programming ";
		System.out.println("s.length() : " + s.length());
		System.out.println("s.charAt(1) : " + s.charAt(1));
		System.out.println("s.substring(6) : " + s.substring(6));
		System.out.println("s.substring(5,13) : " + s.substring(5,13));
		System.out.println("s.indexOf('P') : " + s.indexOf("P")); 
		System.out.println("s.toLowerCase() : " +	s.toLowerCase());
		System.out.println("s.toUpperCase() : " + s.toUpperCase());
		//아래로 추가함
		System.out.println("s.trim : " + s.trim());
		System.out.println("s.concat : " + s.concat("!"));
		System.out.println("s.replace : " + s.replace(' ', '_'));
	}*/

	//(예제 6-6) String 클래스 메서드 이용하기
	public static void array06() {
		String s = " Java Programming ";
		String s1 = "Java";
		String s2 = " Programming";
		String s3 = s1.concat(s2);
		String s4 = s.trim();
		System.out.println("s3 " + s3);
		System.out.println("s4 " + s4);
		System.out.println("s3.equals(s4) " + s3.equals(s4));
	}

	//문자열 메서드 연산 예시
/*	public static void example07() {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "java";
		System.out.println(s1 == s2);
		System.out.println(s1 != s2);
		
		System.out.println(s2 == s3);
		System.out.println(s2 != s3);
		String s4 = s2 + s3;
		System.out.println(s4);
	}*/

	public static void array07() {
		String s1 = new String("Java");
		String s2 = new String("Java"); 
		String s3 = s1;

		if (s1 == s2)
			System.out.println("s1과 s2는 같다");
		else
			System.out.println("s1과 s2는 같지 않다");

		if (s1 == s3)
			System.out.println("s1과 s3은 같다");
		else
			System.out.println("s1과 s3은 같지 않다");

		if (s1.equals(s2))
			System.out.println("s1과 s2의 값은 같다");
		else
			System.out.println("s1과 s2의 값은 같지 않다");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array01();
		//example06();
		array07(); //s1!=s2, s1==s3, s1와 s2의 값은 같다.
	}
}