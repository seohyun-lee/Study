import java.util.ArrayList;

public class Practice71 {
	public static Double findMax(ArrayList<Double> scores) {
		double max=0;
		for(int i=0; i<scores.size(); i++) {
			if(max < scores.get(i))
				max = scores.get(i);
		}
		scores.remove(max); //Double�� Auto-boxing�� �Ͼ
		return max;
	}
	
	public static Double findMin(ArrayList<Double> scores) {
		double min=10;
		for(int i=0; i<scores.size(); i++) {
			if(min > scores.get(i))
				min = scores.get(i);
		}
		scores.remove(min); //Double�� Auto-boxing�� �Ͼ, �ش� ���� ã�Ƽ� ����
		return min;
	}

	public static Double getAve(ArrayList<Double> scores) {
		double average=0;
		for(int i=0; i<scores.size(); i++) {
			average += scores.get(i);
		}
		average /= scores.size();
		return average;
	}

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		System.out.println("�ɻ����� ä�����");
		for(int i=0; i<10; i++) {
			list.add(Math.random()*10);
			System.out.print(list.get(i));
			if(i%2==0)
				System.out.print("\t");
			else
				System.out.println();
		}
		System.out.println("\n��հ� : "+getAve(list)+"\n");
		System.out.println("���� ���� ���� : "+findMax(list));
		System.out.println("���� ���� ���� : "+findMin(list)+"\n");
		System.out.println("�ְ����� �������� ������ ���");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
			if(i%2==0)
				System.out.print("\t");
			else
				System.out.println();
		}
		System.out.println("\n���� ����: "+getAve(list));
	}
}
