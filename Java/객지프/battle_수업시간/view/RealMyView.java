package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class RealMyView extends JFrame {
	JButton btn = new JButton(" ��ư��ư��ư~~~");

	public RealMyView() {
		// ũ��� ���̱� �Ӽ��� ����!

		this.setSize(1000, 500);
		this.setVisible(true);
		getContentPane().setLayout(null);
		btn.setFont(new Font("����", Font.PLAIN, 23));

		// ���۳�Ʈ ������ ��ġ
		btn.setBounds(51, 32, 200, 100);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("��ư�� ������");
				btn.setText("�޷ո޷�");
			}

		}

		);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(282, 34, 200, 380);
		getContentPane().add(textArea);

		// ���۳�Ʈ �߰��ϱ�
		getContentPane().add(btn);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RealMyView().setVisible(true);
		;
	}
}
