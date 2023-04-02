package chap2_example;

public class Example09 {

	public static void main(String[] args) {
		short a = 0x0011;
		short b = 0x1110;
		
		System.out.println("비트 연산 결과");
		System.out.printf("%04x\n", (a&b));
		System.out.printf("%04x\n", (a|b));
		System.out.printf("%04x\n", (a^b));
		System.out.printf("%04x\n\n", (short)(~a));
		
		byte c = 20;
		byte d = -8;
		System.out.print(20 + ": ");
		System.out.println(Integer.toBinaryString(20));

		System.out.print(-8 + ": ");
		System.out.println(Integer.toBinaryString(-8));
		
		
		System.out.println("시프트 연산 결과");
		System.out.println(c<<2);
		System.out.println(c>>2);
		System.out.println(d>>2);
		System.out.printf("%x\n", (d>>2));
	}

}
