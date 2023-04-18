package prgrms;
/*
정수 n을 입력으로 하여, 높이와 너비가 n인 직각삼각형을 "*"문자로 출력하는 함수를 완성하세요.

힌트1: 사각형을 그리는 방식을 변형합니다.
힌트2: 두개의 반복문이 필요합니다.

제한사항 1<n<100

설명 : n이 3이므로 첫번째라인에 *, 두번째라인에 **, 세번째 라인에 ***을 출력합니다.
*/
import java.util.Scanner;

public class WarmingUp_3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //필요한 코드를 작성하세요
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}