import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.DimmingLights;

public class OkJavaGoInHomeInput {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a ID");
		String bright  = JOptionPane.showInputDialog("Enter a Bright Level");
		// Elevator call
		//org.opentutorials.iot.Elevator 쓰는 것 대신 import
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1); //1층으로 엘리베이터 보내기
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off(); //괄호 붙어있는 명령은 '메소드'
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / hallLamp");
		hallLamp.on();
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+"mood");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
	}

}
