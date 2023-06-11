package view;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import player.Player;

public class MusicianSelectView extends JFrame {

	private JPanel contentPane;
	private JLabel titleLabel;
    private Image backgroundImage; //배경이미지
    
    Player p1, p2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicianSelectView frame = new MusicianSelectView();
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
	public MusicianSelectView() {
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
		contentPane.setLayout(null); //배치 관리자 삭제-컴포넌트를 Absolute Layout으로 배치하고자.
		setLocationRelativeTo(null); //JFrame 화면 중앙에 배치
		
		//글자 이미지
        titleLabel = new JLabel();
        titleLabel.setBounds(215, 72, 341, 85);
        titleLabel.setIcon(new ImageIcon("./src/file/selectplayer.png"));
        contentPane.add(titleLabel);
        
        
		JButton btn1 = new JButton("VOCALIST");
		btn1.setBounds(100, 180, 120, 200);
        contentPane.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        		p1 = new Player("Avril", 1000, 100, "singer.png");
        	}
        });

        JButton btn2 =  new JButton("GUITARIST");
        btn2.setBounds(250, 180, 120, 200);
        contentPane.add(btn2);
        btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        		p1 = new Player("Choi", 1000, 100, "guitarist.png");
        	}
        });

        JButton btn3 =  new JButton("BASSIST");
        btn3.setBounds(400, 180, 120, 200);
        contentPane.add(btn3);
        btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        		p1 = new Player("Kate", 1000, 100, "bassist.png");
        	}
        });

        JButton btn4 =  new JButton("DRUMMER");
        btn4.setBounds(550, 180, 120, 200);
        contentPane.add(btn4);
        btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        		p1 = new Player("Josh", 1000, 100, "drummer.png");
        	}
        });

        JButton btn5 = new JButton("LET'S BATTLE!!");
        btn5.setBounds(300, 420, 172, 50);
        contentPane.add(btn5);        
        btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2 = new Player("Alien", 1000, 100, "monster_1.png");
				new BattleView(p1, p2).setVisible(true);
        		setVisible(false);
        	}
        });
	}
}
