
public class Practice66 {

	public static void main(String[] args) {
		HealthData<Integer, Integer> human1 = new HealthData<>("�赿��", 50, 160);

		HealthData<Double, Integer> human2 = new HealthData<>("ȫ�浿", 100.35, 180);
		HealthData<Integer, Double> human3 = new HealthData<>("������", 65, 156.7);
		System.out.println(human1.toString());
		System.out.println(human2.toString());
		System.out.println(human3.toString());
		System.out.println("3��� ü���� �� : "+(double)(human1.getW()+human2.getW()+human3.getW()));
	}

}
