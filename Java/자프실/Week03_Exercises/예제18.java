
//예제18: 극장 관객 수 계산
public class 예제18 {

	public static void main(String[] args) {
		int[][] seats = {{0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
				{0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 1, 1, 1, 0}};
		int count = 0;
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++){
				if (seats[i][j] == 1)
					count++;
			}
		}
		System.out.println("현재 관객 수는 " + count + "명입니다.");
	}

}
