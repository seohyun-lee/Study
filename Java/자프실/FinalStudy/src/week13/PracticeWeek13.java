package week13;



/*//예제 9-1 스윙프레임
import java.awt.Container;
import javax.swing.*;

class MyFrame extends JFrame {
	public MyFrame() {
		super("타이틀문자열"); //JFrame의 생성자 호출하여 타이틀 달기
		setTitle("300x300 스윙 프레임 만들기"); //메소드 호출하여 타이틀 달기
		setSize(300, 300); //프레임 크기 300x300
		setVisible(true); //프레임 출력
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}*/

/* //예제 9-2 버튼 갖는 스윙프레임
import javax.swing.*;	//JFrame, JButton 때문
import java.awt.*;		//Container 때문

class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //이것을 설정해야 닫았을 때 종료됨
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
*/

/*//예제 9-3 FlowLayout
import javax.swing.*;
import java.awt.*;

class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		//FlowLayout.LEFT로 정렬됨. hGap:30px, vGap:40px
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("nul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}*/

/*//예제 9-4 BorderLayout 배치관리자
import javax.swing.*;
import java.awt.*;

class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(30, 20));
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		
		setSize(300, 200); //프레임 크기 300x200
		setVisible(true); //프레임을 화면에 출력
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}*/

/* //GridLayout
import javax.swing.*;
import java.awt.*;

class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 2); //4행 2열
		grid.setVgap(5); //두 행 사이 수직 간격 vGap이 5로 설정됨
		
		Container c = getContentPane();
		c.setLayout(grid); //위에서 만든 GridLayout 객체를 넣어줌
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}*/

/* //배치관리자 없는 컨테이너에 컴포넌트를 절대 위치와 크기로 지정
import javax.swing.*;
import java.awt.*;

class NullContainerEx extends JFrame {
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);	//배치 관리자 없앰
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50); //절대 위치
		la.setSize(200, 20);
		c.add(la);
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); //String으로 인자 전달해야 해서...
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			c.add(b);
		}
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NullContainerEx();
	}	
}*/

/* //공부
import java.awt.*;
import javax.swing.*;

class TestFrame extends JFrame {
	public TestFrame () {
		setTitle("title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLay
		out(new BorderLayout());
		c.add(new JButton("FIRST"), BorderLayout.EAST);
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		c.add(new JButton("SECOND"));		
		c.setLayout(new GridLayout(3, 2));
		c.add(new JLabel("THIRD"));
		//setLayout이 여러개면 그중 가장 마지막 레이아웃이 적용되고, add한 것들은 다 넣어져 있음
		//BorderLayout()은 add 형식 때문에 몇 개 안보일수도 있음
		setSize(300,200);
		setVisible(true);
		//배치관리자 없는 컨테이너? JButton 같은 거 가지고 .setLocation(), .setSize()
	}
	public static void main(String[] args) {
		new TestFrame();
	}
}
*/
public class PracticeWeek13 {

	
	public static void main(String[] args) {
		;
	}

}
