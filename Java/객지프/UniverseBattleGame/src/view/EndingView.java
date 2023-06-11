package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EndingView extends JFrame {

	private JPanel contentPane;
    private Image backgroundImage; //����̹���

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
	public EndingView() {
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
        String imagePath = ".\\src\\file\\universe.jpg";
        backgroundImage = new ImageIcon(imagePath).getImage();
        
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);        
		
        JButton returnbtn = new JButton("RETURN");
        returnbtn.setBounds(300, 420, 160, 50);
        contentPane.add(returnbtn);
        returnbtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
    			new StartView().setVisible(true);
    			setVisible(false);
        	}
        });
		
	}
	
	public EndingView(String result) {
		this();
		if(result=="win") {
			//���� �ֱ�
		} else if(result=="lose") {
			//���� �ֱ�
		} else {
			//����ó��
		}
	}

}
