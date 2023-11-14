
public class Practice37 {

	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2 = new Plane(1030615, "보잉 737", 75);
		Plane p3 = new Plane(2464737, "보잉 747", 150);
		
		System.out.println("디폴트 비행기의 정보입니다.");
		System.out.println("식별번호: "+p1.id+"편");
		System.out.println("모델: "+p1.model);
		System.out.println("승객 수: "+p1.capacity+"명");
		
		System.out.println("제주행 비행기의 정보입니다.");
		System.out.println("식별번호: "+p2.id+"편");
		System.out.println("모델: "+p2.model);
		System.out.println("승객 수: "+p2.capacity+"명");
		
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.println("식별번호: "+p3.id+"편");
		System.out.println("모델: "+p3.model);
		System.out.println("승객 수: "+p3.capacity+"명");
	}

}
