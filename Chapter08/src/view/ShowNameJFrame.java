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
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

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
		setBounds(100, 100, 435, 276);
		getContentPane().setLayout(null);
		
		JButton btnClose = new JButton("Close");
		btnClose.setIcon(new ImageIcon(ShowNameJFrame.class.getResource("/images32/close.png")));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.setBounds(151, 190, 109, 41);
		getContentPane().add(btnClose);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 399, 157);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ชื่อ-นามสกุล");
		lblNewLabel.setBounds(20, 26, 65, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		textName = new JTextField();
		textName.setBounds(95, 23, 162, 20);
		panel.add(textName);
		textName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textName.setColumns(10);
		
		JButton btnShow = new JButton("Show");
		btnShow.setBounds(275, 11, 109, 41);
		panel.add(btnShow);
		btnShow.setIcon(new ImageIcon(ShowNameJFrame.class.getResource("/images32/facebook.png")));
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textName.getText();				
				lblShow.setText("Hi " + name + " !");
				textName.setText("");
			}
		});
		btnShow.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblShow = new JLabel("New label");
		lblShow.setHorizontalAlignment(SwingConstants.CENTER);
		lblShow.setBounds(23, 83, 346, 34);
		panel.add(lblShow);
		lblShow.setFont(new Font("Tahoma", Font.PLAIN, 20));

	}
}
