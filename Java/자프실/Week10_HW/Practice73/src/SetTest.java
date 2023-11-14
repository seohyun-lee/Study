import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<>();
		set1.add("Bread");
		set1.add("Milk");
		set1.add("Butter");
		set1.add("Ham");
		set1.add("Cheese");
		System.out.println(set1.toString());

    	System.out.print("[");
		for (String e : set1) {
            System.out.print(e);
        	System.out.print(", ");
        }
    	System.out.println("]");

    	System.out.print("[");
    	Iterator<String> iter = set1.iterator();
    	while(iter.hasNext()){
    		String str = iter.next();
    		System.out.print(str);
        	System.out.print(", ");
    	}
    	System.out.println("]");
 
    	boolean flag = true;
    	System.out.print("[");
		for (String e : set1) {
			if(!flag)
	        	System.out.print(", ");
			else
				flag=false;
            System.out.print(e);
        }
    	System.out.println("]");
	}

}
