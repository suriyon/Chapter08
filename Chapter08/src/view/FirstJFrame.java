package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JLabel lblShowName;
	private JButton btnClose;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstJFrame frame = new FirstJFrame();
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
	public FirstJFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FirstJFrame.class.getResource("/images32/facebook.png")));
		setTitle("First GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textName.setBounds(107, 52, 158, 23);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textName.getText();
				//System.out.println("Name : " + name);
				lblShowName.setText("สวัสดีคุณ " + name);
				textName.setText("");
			}
		});
		btnShow.setIcon(new ImageIcon(FirstJFrame.class.getResource("/images32/facebook.png")));
		btnShow.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnShow.setBounds(275, 41, 105, 47);
		contentPane.add(btnShow);
		
		JLabel lblNewLabel = new JLabel("ชื่อ-นามสกุล");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(32, 58, 67, 14);
		contentPane.add(lblNewLabel);
		
		lblShowName = new JLabel("New label");
		lblShowName.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblShowName.setBounds(32, 110, 330, 55);
		contentPane.add(lblShowName);
		
		btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setIcon(new ImageIcon(FirstJFrame.class.getResource("/images32/close.png")));
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.setBounds(275, 170, 105, 47);
		contentPane.add(btnClose);
	}
}
