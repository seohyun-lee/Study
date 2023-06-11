
/*
이 문제는 2차배열을 이용하는 문제로 규칙에 따라 배열을 채우는 문제입니다.
규칙은 2차배열을 오른쪽으로 90도 이동시키는 것입니다.
슈가와 친구들은 1024*1024 크기의 이미지를 오른쪽으로 회전한 후, 보기 좋게 출력하는 프로그램을 만들고 있습니다.
저장된 코드와 주어진 main코드기록이 초기코드가 주어져 있습니다. 미리 주어진 코드를 잘 확인하고 필요한 부분을 넣어 프로그램을 완성 시켜 보세요!
N은 2이상 1024 이하의 값으로 주어집니다.
*/
import java.util.Scanner;

public class WarmingUp_4 {

	static Scanner input = new Scanner(System.in);
    //ar배열의 N*N 공간에 데이터를 입력받는다.
    public static void input_image(int [][] ar){
        
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar.length; j++)
                ar[i][j]=input.nextInt();
        }        
    }
    //ar배열의 N*N 공간을 출력한다.
    public static void show_image(int [][]ar){                 
 
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar.length; j++){
                if(ar[i][j] == 1 ) System.out.print("●"); 
                else System.out.print("○");
            }
            System.out.println();
        }
    
    }
    //오른쪽으로 회전하기. 프로토타입을 수정하여 작성하세요
    public static void rotate_right(int [][] a, int [][] b){
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                b[i][j]=a[n-j-1][i]; //예시 적어보고 이렇게 만듬
            }
        }
        
    }
        
    
    public static void main(String[] args) {
       
        int [][] A ;  //원래 배열
        int [][] B ;  //회전한 배열
        //배열의 크기와 A배열을 입력받는다.  
        int N = input.nextInt();
        
        //필요한 배열 생성하기
        A = new int[N][N]; //여기에 엔터 하나 있었음! 코드쓰는 위치인거 눈치채기
        B = new int[N][N];
        
        input_image(A);
        
        //A배열을 회전시켜 B배열에 저장한다.
        rotate_right(A,B);
        //B배열을 출력한다.
        show_image(B);
    }

}
