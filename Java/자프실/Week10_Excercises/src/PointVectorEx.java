import java.util.Vector;

class Point {
	private int x, y;
	public Point(int x, int y) { 
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public boolean equals(Object o) {
		Point p = (Point) o;
		return (x == p.x && y == p.y);
	}

}

public class PointVectorEx {
	public static void main(String[] args) {
		// Point ��ü�� ��ҷθ� ������ ���� ����
		Vector<Point> v = new Vector<Point>();

		// 3 ���� Point ��ü ����
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));

		v.remove(1); // �ε��� 1�� Point(-5, 20) ��ü ����

		// ���Ϳ� �ִ� Point ��ü ��� �˻��Ͽ� ���
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i); // ���Ϳ��� i ��° Point ��ü ����
			System.out.println(p); // p.toString()�� �̿��Ͽ� ��ü p ���
		}
		System.out.println("contains (-5,20) ? "+ v.contains(new Point(-5, 20)) );

	}
}
