
class Dice {
	private int value;

	Dice () {
		setValue(0);
	}
	
	public void roll() {
		int number = (int)(Math.random() * 6) + 1;
		setValue(number);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class Practice03 {

	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		for (int i = 1; ; i++) {
			dice1.roll();
			dice2.roll();
			System.out.println("주사위1= " + dice1.getValue() + " 주사위2= " + dice2.getValue());
			if (dice1.getValue() == dice2.getValue()) {
				System.out.println("("+dice2.getValue()+", "+dice1.getValue()+")이 나오는 데 걸린 횟수= "+i);
				break;
			}
		}
	}

}
