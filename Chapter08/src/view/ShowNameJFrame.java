package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowNameJFrame extends JInternalFrame {
	private JTextField textName;
	private JLabel lblShow;

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
					ShowNameJFrame frame = new ShowNameJFrame();
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
	public ShowNameJFrame() {
		setTitle("Show Name JFrame");
		setFrameIcon(new ImageIcon(ShowNameJFrame.class.getResource("/images32/facebook.png")));
		setClosable(true);
		setBounds(100, 100, 435, 257);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ชื่อ-นามสกุล");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(36, 43, 65, 14);
		getContentPane().add(lblNewLabel);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textName.setBounds(111, 40, 162, 20);
		getContentPane().add(textName);
		textName.setColumns(10);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textName.getText();				
				lblShow.setText("สวัสดีคุณ " + name);
				textName.setText("");
			}
		});
		btnShow.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnShow.setBounds(293, 39, 89, 23);
		getContentPane().add(btnShow);
		
		lblShow = new JLabel("New label");
		lblShow.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblShow.setBounds(36, 100, 346, 34);
		getContentPane().add(lblShow);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.setBounds(164, 177, 89, 23);
		getContentPane().add(btnClose);

	}

}
