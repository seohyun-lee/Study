package chap2_example;

import java.util.Scanner;

public class StringIntString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String a="";
		int b=0;
		String c="";
		boolean isReal=true;
		String temp="abcdefg";
		
		while(true) { 
			System.out.println("학번: ");
			a=input.nextLine();
			System.out.println("나이: ");
			b=input.nextInt();
			if(input.hasNextLine()) temp=input.nextLine();

			System.out.println("이름: ");
			c=input.nextLine();
			System.out.println("true/false?");
			isReal=input.nextBoolean();
			
			if(input.hasNextLine()) temp=input.nextLine();
			
			if(isReal==false) {
				continue;
			}
			System.out.println("temp: " + temp);
			System.out.println("학번 :"+a+" 나이:"+b+" 이름:"+c);
			break;
		}
		input.close();		
	}

}
