
import java.util.Random;
import java.util.Scanner;

public class TheaterMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		극장예약시스템 m = new 극장예약시스템();
		
		m.Welcome();
		m.Seat = m.좌석만들기_ragid();
		m.좌석보이기(m.Seat);
		input.close();
		
	}

}
