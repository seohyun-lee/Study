package view;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import player.*;

public class MusicianSelectView extends JFrame {

	private JPanel contentPane;
	private JLabel titleLabel;
    private Image backgroundImage; //����̹���
    
    public static int monCnt=1; //ù��° ���ͺ��� �÷���
    Musician p1;
    Monster p2;

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
        setTitle("Universe Battle Game");
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
		// ��� �̹��� ����
        String imagePath = "./src/images/universe.jpg";
        backgroundImage = new ImageIcon(imagePath).getImage();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null); //��ġ ������ ����-������Ʈ�� Absolute Layout���� ��ġ�ϰ���.
		setLocationRelativeTo(null); //JFrame ȭ�� �߾ӿ� ��ġ
				
		//���� �̹���
        titleLabel = new JLabel();
        titleLabel.setBounds(215, 72, 341, 85);
        titleLabel.setIcon(new ImageIcon("./src/images/selectplayer.png"));
        contentPane.add(titleLabel);
        
        //��ư��
		JButton btn1 = new JButton("SINGER");
		btn1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		btn1.setBounds(100, 180, 120, 200);
        contentPane.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            BackgroundMusic.music.play(102);
        		p1 = new Musician("singer");
        	}
        });

        JButton btn2 =  new JButton("GUITARIST");
        btn2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
        btn2.setBounds(250, 180, 120, 200);
        contentPane.add(btn2);
        btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            BackgroundMusic.music.play(102);
        		p1 = new Musician("guitarist");
        	}
        });

        JButton btn3 =  new JButton("BASSIST");
        btn3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
        btn3.setBounds(400, 180, 120, 200);
        contentPane.add(btn3);
        btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            BackgroundMusic.music.play(102);
        		p1 = new Musician("bassist");
        	}
        });

        JButton btn4 =  new JButton("DRUMMER");
        btn4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
        btn4.setBounds(550, 180, 120, 200);
        contentPane.add(btn4);
        btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            BackgroundMusic.music.play(102);
        		p1 = new Musician("drummer");
        	}
        });

        JButton btn5 = new JButton("LET'S BATTLE!!");
        btn5.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
        btn5.setBounds(300, 420, 172, 50);
        contentPane.add(btn5);        
        btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                BackgroundMusic.music.play(101);
				if(p1 != null) { // p1�� ���õ� �Ŀ��� BattleView�� �̵��� �� �ִ�
					//monCnt�� �� ������ NextGameView, GameOverView, GameCLerView���� �̷������
					p2 = new Monster("monster"+monCnt);
					new BattleView(p1, p2).setVisible(true);
	        		setVisible(false);
				} else {
					
				}
        	}
        });

        //�������
		BackgroundMusic.music.play(1);
	}
}
