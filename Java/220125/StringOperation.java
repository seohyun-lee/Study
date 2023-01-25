
public class StringOperation {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello, [[name]] ... bye".replace("[[name]]", "Lee"));
		//Hello, Lee ... bye 출력

		String a = "Hello";
		a= a.replace("el", "a");
		System.out.println(a);
		//Halo 출력
	}

}