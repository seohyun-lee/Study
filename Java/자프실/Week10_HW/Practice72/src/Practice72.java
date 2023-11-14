import java.util.HashSet;
import java.util.Random;

public class Practice72 {

	public static void main(String[] args) {
        Random random = new Random();
        
		for(int i=0; i<10; i++) {
			HashSet<Integer> randNumSet = new HashSet<>();
	        while (randNumSet.size() < 5) {
	        	randNumSet.add(random.nextInt(90) + 10);
	        }

			System.out.print("("+(i+1)+"ȸ) ");
			System.out.println(randNumSet.toString());
		}
	}
}
