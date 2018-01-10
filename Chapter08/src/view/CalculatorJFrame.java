package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;

public class CalculatorJFrame extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorJFrame frame = new CalculatorJFrame();
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
	public CalculatorJFrame() {
		setTitle("Calculator");
		setFrameIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/calculator.png")));
		setClosable(true);
		setBounds(100, 100, 427, 458);

	}

}
