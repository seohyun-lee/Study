import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        String �̸�, �а�, �뷡, ����;
        int �й�;
        float Ű;
        boolean b = true;
 
        while(true) {
            System.out.print("�̸� : ");
            �̸� = input.nextLine();
            System.out.print("�а� : ");
            �а� = input.nextLine();
            System.out.print("�й� : ");
            �й� = input.nextInt();
            
            System.out.print("Ű: ");
            String temp = input.nextLine();
            Ű = input.nextFloat();
 
            System.out.print("�����ϴ� �뷡: ");  
            input.nextLine(); //���� ��� ���̵� ���� �Ծ�� ����
            �뷡  = input.nextLine();
            System.out.print("�� �뷡�� �����ϴ� ������ �����ΰ���? ");
            ����  = input.nextLine();
 
            System.out.print("�Է��� ������ ������ true, Ʋ���� false�� �Է����ּ��� : ");
            b = input.nextBoolean();          
            System.out.println("��� : " + b + "\n");        
            input.nextLine(); 
            if(b == true) break;
            System.out.println("�ٽ� �Է¹ٶ��ϴ�");
        }
        
        System.out.println("#############################################");        
        System.out.println("�ȳ��ϼ���! ���� " + �а� + " " + �й� +"�й�, " + �̸� +"�Դϴ�.");
        System.out.println("Ű�� " + Ű + "cm�Դϴ�.");
        System.out.println("���� �����ϴ� �뷡�� " + �뷡 +"�Դϴ�.");
        System.out.println("�� �뷡�� �����ϴ� ������ " + ����);        
        System.out.println("#############################################");
        System.out.println("�Է��� ������ ��� " + b +"�Դϴ�!");        
        input.close();
        
    }
}
 