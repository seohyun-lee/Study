package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class RealMyView extends JFrame {
	JButton btn = new JButton(" 버튼버튼버튼~~~");

	public RealMyView() {
		// 크기와 보이기 속성만 설정!

		this.setSize(1000, 500);
		this.setVisible(true);
		getContentPane().setLayout(null);
		btn.setFont(new Font("굴림", Font.PLAIN, 23));

		// 컴퍼넌트 생성과 배치
		btn.setBounds(51, 32, 200, 100);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼이 눌렸음");
				btn.setText("메롱메롱");
			}

		}

		);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(282, 34, 200, 380);
		getContentPane().add(textArea);

		// 컴퍼넌트 추가하기
		getContentPane().add(btn);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RealMyView().setVisible(true);
		;
	}
}
