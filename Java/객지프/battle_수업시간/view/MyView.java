package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyView extends JFrame {

	private JPanel contentPane;
	private JButton btn2;
	private JButton btn3;
	private JButton btn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyView frame = new MyView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btn1 = new JButton("��ư~!");
		btn1.setForeground(Color.MAGENTA);
		btn1.setFont(new Font("����", Font.BOLD, 14));
		btn1.setBounds(23, 147, 640, 108);
		contentPane.add(btn1);

		btn2 = new JButton("��ư~");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� ����~!");
				String s = btn1.getText() + " ����Ŀ�~";
				btn1.setText(s);
				// btn3.setText(btn3.getText() + "����Ŀ�~");

			}
		});
		btn2.setForeground(Color.MAGENTA);
		btn2.setFont(new Font("����", Font.BOLD, 20));
		btn2.setBounds(84, 29, 221, 108);
		contentPane.add(btn2);

		btn3 = new JButton("��ư");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText("�͸����� ��������~");
			}
		});
		btn3.setForeground(Color.MAGENTA);
		btn3.setFont(new Font("����", Font.BOLD, 20));
		btn3.setBounds(352, 29, 109, 108);
		contentPane.add(btn3);

		JLabel label2 = new JLabel("New label");
		label2.setBounds(247, 290, 168, 191);
		contentPane.add(label2);

		JLabel label1 = new JLabel("New label");
		label1.setBounds(53, 290, 168, 191);
		contentPane.add(label1);
	}
}
