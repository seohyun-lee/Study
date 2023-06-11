package midterm;
import java.util.Scanner;

public class HideAndSeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //반복문과 비교문이 필요합니다.
        //주의할 점 : 1 뒤에는 ","가 없어요
        //입력값에 대하여 출력값이 정확히 출력되도록 작성하세요. 
        int n;
        while(true){
            n=input.nextInt();
            if(n>2) break;
            System.out.println("다시입력하세요");
        }
        for(int i=n; i>0; i--){
            System.out.print(i);
            if(i!=1){
                System.out.print(",");
            }
        }
        System.out.print(" 찾는다!");
    
    }
}