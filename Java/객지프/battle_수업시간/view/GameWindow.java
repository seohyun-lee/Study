package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import player.Player;
//Main���� �����ϱ�
public class GameWindow extends JFrame {
	private JPanel contentPane;
	private JPanel panel1;
	private JPanel panel2;

	private JLabel label1;
	private JLabel label2;
	private JButton btn1;
	private JButton btn2;
	private JProgressBar bar1;
	private JProgressBar bar2;

	private JScrollPane scrollPane;
	private JTextArea textArea;

	//�� window���� ����ÿ��� �ǵ��� player �ʱ�ȭ
	Player p1 = new Player("Avril", 1000, 100, "singer.png");
	Player p2 = new Player("Alien", 1000, 100, "monster_1.png");

	public static void main(String[] args) {

		new GameWindow().setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public GameWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 964, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel1 = new JPanel();
		panel1.setBounds(12, 20, 311, 400);
		panel1.setLayout(null);

		label1 = new JLabel("New label");
		label1.setBounds(12, 10, 310, 310);
		panel1.add(label1);

		btn1 = new JButton("�����ϱ�");
		btn1.setBounds(12, 250, 268, 30);
		panel1.add(btn1);

		bar1 = new JProgressBar();
		bar1.setMaximum(1000);
		bar1.setForeground(Color.RED);
		bar1.setValue(1000);
		bar1.setBounds(12, 320, 268, 35);
		panel1.add(bar1);

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(625, 10, 311, 400);

		label2 = new JLabel("New label");
		label2.setBounds(12, 10, 310, 310);
		panel2.add(label2);

		btn2 = new JButton("�����ϱ�");
		btn2.setBounds(12, 250, 268, 30);
		panel2.add(btn2);

		bar2 = new JProgressBar();
		bar2.setMaximum(1000);
		bar2.setForeground(Color.RED);
		bar2.setValue(1000);
		bar2.setBounds(12, 320, 268, 35);
		panel2.add(bar2);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(335, 20, 258, 397);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.attack(p2);
				bar2.setValue(p2.getHp());
				textArea.append(p1.name + "�� " + p2.name + "�� �����մϴ�.\n");
                
                // Monster�� ü���� 0�� ��� ó��
                if (p2.getHp() == 0) {
    				textArea.append(p1.name + "�� �������� �¸��߽��ϴ�.\n");
    				btn1.setVisible(false);
    				btn2.setVisible(false);
                }
			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2.attack(p1);
				bar1.setValue(p1.getHp());
				textArea.append(p2.name + "�� " + p1.name + "�� �����մϴ�.\n");
				
				// Musician�� ü���� 0�� ��� ó��
                if (p1.getHp() == 0) {
    				textArea.append(p2.name + "(��)�� �¸��߽��ϴ�.\n");
    				btn1.setVisible(false);
    				btn2.setVisible(false);
                }
			}
		});
		contentPane.add(panel1);
		contentPane.add(panel2);
	}

	public GameWindow(Player p1, Player p2) {

		this();
		this.p1 = p1;
		this.p2 = p2;
		// bar1�� �ִ밪�� ���簪 setting
		bar1.setMaximum(p1.getHp());
		bar2.setMaximum(p2.getHp());
		bar1.setValue(p1.getHp());
		bar2.setValue(p2.getHp());

		// �̹�������
		label1.setIcon(new ImageIcon(p1.getImgFile()));
		label2.setIcon(new ImageIcon(p2.getImgFile()));

	}

}
