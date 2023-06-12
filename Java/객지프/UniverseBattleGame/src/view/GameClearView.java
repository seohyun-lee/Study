package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GameClearView extends JFrame {

	private JPanel contentPane;
    private Image backgroundImage; //배경이미지
    private String text;

	/**
	 * Launch the application.
	 */    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartView frame = new StartView();
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
	public GameClearView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 600);		
		contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }

            }
        };		
		// 배경 이미지 설정
        String imagePath = ".\\src\\file\\universe.jpg";
        backgroundImage = new ImageIcon(imagePath).getImage();
        
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
        
        JLabel loseText = new JLabel("GAME CLEAR!!!!!");
        loseText.setForeground(new Color(255, 255, 255));
        loseText.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 70));
        loseText.setBounds(84, 172, 609, 105);
        contentPane.add(loseText);
		
        JButton returnbtn = new JButton("RESET");
        returnbtn.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
        returnbtn.setBounds(300, 420, 160, 50);
        contentPane.add(returnbtn);
        returnbtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
    			new StartView().setVisible(true);
    			setVisible(false);
        	}
        });
        
        //몬스터 번호 초기화
        MusicianSelectView.monCnt=1;
		
	}
}
