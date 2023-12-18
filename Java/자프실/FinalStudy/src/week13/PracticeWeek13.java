package week13;



/*//���� 9-1 ����������
import java.awt.Container;
import javax.swing.*;

class MyFrame extends JFrame {
	public MyFrame() {
		super("Ÿ��Ʋ���ڿ�"); //JFrame�� ������ ȣ���Ͽ� Ÿ��Ʋ �ޱ�
		setTitle("300x300 ���� ������ �����"); //�޼ҵ� ȣ���Ͽ� Ÿ��Ʋ �ޱ�
		setSize(300, 300); //������ ũ�� 300x300
		setVisible(true); //������ ���
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}*/

/* //���� 9-2 ��ư ���� ����������
import javax.swing.*;	//JFrame, JButton ����
import java.awt.*;		//Container ����

class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�̰��� �����ؾ� �ݾ��� �� �����
		
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

/*//���� 9-3 FlowLayout
import javax.swing.*;
import java.awt.*;

class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		//FlowLayout.LEFT�� ���ĵ�. hGap:30px, vGap:40px
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

/*//���� 9-4 BorderLayout ��ġ������
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
		
		setSize(300, 200); //������ ũ�� 300x200
		setVisible(true); //�������� ȭ�鿡 ���
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
		
		GridLayout grid = new GridLayout(4, 2); //4�� 2��
		grid.setVgap(5); //�� �� ���� ���� ���� vGap�� 5�� ������
		
		Container c = getContentPane();
		c.setLayout(grid); //������ ���� GridLayout ��ü�� �־���
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}*/

/* //��ġ������ ���� �����̳ʿ� ������Ʈ�� ���� ��ġ�� ũ��� ����
import javax.swing.*;
import java.awt.*;

class NullContainerEx extends JFrame {
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);	//��ġ ������ ����
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50); //���� ��ġ
		la.setSize(200, 20);
		c.add(la);
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); //String���� ���� �����ؾ� �ؼ�...
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

/* //����
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
		//setLayout�� �������� ���� ���� ������ ���̾ƿ��� ����ǰ�, add�� �͵��� �� �־��� ����
		//BorderLayout()�� add ���� ������ �� �� �Ⱥ��ϼ��� ����
		setSize(300,200);
		setVisible(true);
		//��ġ������ ���� �����̳�? JButton ���� �� ������ .setLocation(), .setSize()
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
