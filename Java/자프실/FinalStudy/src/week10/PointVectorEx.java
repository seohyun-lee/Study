package week10;

import java.util.Vector;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	public boolean equals(Object o) {
		Point p = (Point)o;
		return (x==p.x && y==p.y);
	}
}
public class PointVectorEx {

	public static void printVector(Vector<Integer> v) {
		for(int i=0; i<v.size(); i++) {
			int n=v.get(i); System.out.println(n);
		}
	}
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		System.out.println("contains (-5, 20? "+v.contains(new Point(-5, 20)));
		
		v.remove(1); //¿Œµ¶Ω∫ 1¿« ∞¥√º ªË¡¶!
		for(int i=0; i<v.size(); i++) {
			Point p=v.get(i);
			System.out.println(p); //p.toString()¿ª ¿ÃøÎ«ÿ ∞¥√º p √‚∑¬µ 
		}
		Vector<Integer> v1 = new Vector<>();
		v1.add(0); v1.add(1); v1.add(2);
		printVector(v1);
	}

}
