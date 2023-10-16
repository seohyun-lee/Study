//메소드 오버로딩
public class Week02_MO {

	/*public static void calc(int x, int y) {
		System.out.println(x*y);
	}
	public static void calc(int x) {
		System.out.println(x*x);
	}
	public static void calc(int x, double y) {
		System.out.println(x*y);
	}
	public static void calc(double x) {
		System.out.println(x*x);
	}
	public static void main(String[] args) {
		calc(2, 3);
		calc(2, 3.14);
		calc(2);
		calc(2.5);
	}*/
	
	public static int sum(int x, int y) {
		return (x+y);
	}
	public static int sum(int x, int y, int z) {
		return (x+y+z);
	}
	public static double sum(double x, double y) {
		return (x+y);
	}
	public static void main(String[] args) {
		System.out.println(sum(100, 90));
		System.out.println(sum(100, 90, 80));
		System.out.println(sum(10, 90.9));
		System.out.println(sum(10.0, 90.9));
	}
}
