package midterm;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //동물 마리수를 입력받고        
        //동물마리수만큼의 이름을 저장할 수 있는 배열을 생성한 후
        //입력과 출력을 위한 코드를 작성하세요
        int n=input.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i]=input.next();
        }
        for(int i=0; i<n; i++){
            System.out.println((i+1)+" : "+arr[i]);
        }
    }
}