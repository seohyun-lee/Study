import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        String 이름, 학과, 노래, 이유;
        int 학번;
        float 키;
        boolean b = true;
 
        while(true) {
            System.out.print("이름 : ");
            이름 = input.nextLine();
            System.out.print("학과 : ");
            학과 = input.nextLine();
            System.out.print("학번 : ");
            학번 = input.nextInt();
            
            System.out.print("키: ");
            input.nextLine();
            키 = input.nextFloat();
 
            System.out.print("좋아하는 노래: ");  
            input.nextLine(); //변수 사용 없이도 엔터 먹어가기 가능
            노래  = input.nextLine();
            System.out.print("그 노래를 좋아하는 이유는 무엇인가요? ");
            이유  = input.nextLine();
 
            System.out.print("입력한 정보가 맞으면 true, 틀리면 false를 입력해주세요 : ");
            b = input.nextBoolean();          
            System.out.println("결과 : " + b + "\n");        
            input.nextLine(); 
            if(b == true) break;
            System.out.println("다시 입력바랍니다");
        }
        
        System.out.println("#############################################");        
        System.out.println("안녕하세요! 저는 " + 학과 + " " + 학번 +"학번, " + 이름 +"입니다.");
        System.out.println("키는 " + 키 + "cm입니다.");
        System.out.println("제가 좋아하는 노래는 " + 노래 +"입니다.");
        System.out.println("이 노래를 좋아하는 이유는 " + 이유);        
        System.out.println("#############################################");
        System.out.println("입력한 정보는 모두 " + b +"입니다!");        
        input.close();
        
    }
}
 