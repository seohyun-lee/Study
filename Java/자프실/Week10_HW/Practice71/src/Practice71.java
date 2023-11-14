import java.util.ArrayList;

public class Practice71 {
	public static Double findMax(ArrayList<Double> scores) {
		double max=0;
		for(int i=0; i<scores.size(); i++) {
			if(max < scores.get(i))
				max = scores.get(i);
		}
		scores.remove(max); //Double은 Auto-boxing이 일어남
		return max;
	}
	
	public static Double findMin(ArrayList<Double> scores) {
		double min=10;
		for(int i=0; i<scores.size(); i++) {
			if(min > scores.get(i))
				min = scores.get(i);
		}
		scores.remove(min); //Double은 Auto-boxing이 일어남, 해당 값을 찾아서 삭제
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
		System.out.println("심사위원 채점결과");
		for(int i=0; i<10; i++) {
			list.add(Math.random()*10);
			System.out.print(list.get(i));
			if(i%2==0)
				System.out.print("\t");
			else
				System.out.println();
		}
		System.out.println("\n평균값 : "+getAve(list)+"\n");
		System.out.println("가장 높은 점수 : "+findMax(list));
		System.out.println("가장 낮은 점수 : "+findMin(list)+"\n");
		System.out.println("최고점과 최저점을 제외한 결과");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
			if(i%2==0)
				System.out.print("\t");
			else
				System.out.println();
		}
		System.out.println("\n최종 점수: "+getAve(list));
	}
}
