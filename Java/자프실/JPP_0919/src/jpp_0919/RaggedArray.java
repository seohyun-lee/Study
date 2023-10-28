package jpp_0919;

//래그드 배열: 다차원 배열을 배열의 배열을 이용하여 구현한다 (비정형 크기 가능)
public class RaggedArray {
	
	public static void main(String[] args) {

		int[][] ragged = new int[3][]; //행의 크기를 적어야 한다.
		ragged[0] = new int[1];
		ragged[1] = new int[2];
		ragged[2] = new int[3];

		for (int r = 0; r < ragged.length; r++) {
			for (int c = 0; c <ragged[r].length; c++) {
				ragged[r][c] = c;
				System.out.print(ragged[r][c]); //확인용
			}
			System.out.println(); //행 구분
		}
	}

}

