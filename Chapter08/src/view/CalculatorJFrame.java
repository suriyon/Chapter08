package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;

public class CalculatorJFrame extends JInternalFrame {
	private JLabel lblResult;
	private JButton btnClear;
	private JButton btnBackSpace;
	private JButton btnDivide;
	private JButton btnMultiply;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMinus;
	private JButton btnPlus;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton btn0;
	private JButton btnDot;
	private JButton btnEqual;

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
		setBounds(100, 100, 377, 453);
		getContentPane().setLayout(null);
		
		lblResult = new JLabel("0");
		lblResult.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResult.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 84));
		lblResult.setBounds(10, 11, 342, 90);
		getContentPane().add(lblResult);
		
		btn7 = new JButton("");
		btn7.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_7.png")));
		btn7.setBounds(10, 174, 78, 51);
		getContentPane().add(btn7);
		
		btn8 = new JButton("");
		btn8.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_8.png")));
		btn8.setBounds(98, 174, 78, 51);
		getContentPane().add(btn8);
		
		btn9 = new JButton("");
		btn9.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_9.png")));
		btn9.setBounds(186, 174, 78, 51);
		getContentPane().add(btn9);
		
		btnMultiply = new JButton("");
		btnMultiply.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/multiply.png")));
		btnMultiply.setBounds(274, 174, 78, 51);
		getContentPane().add(btnMultiply);
		
		btn4 = new JButton("");
		btn4.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_4.png")));
		btn4.setBounds(10, 236, 78, 51);
		getContentPane().add(btn4);
		
		btn5 = new JButton("");
		btn5.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_5.png")));
		btn5.setBounds(98, 236, 78, 51);
		getContentPane().add(btn5);
		
		btn6 = new JButton("");
		btn6.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_6.png")));
		btn6.setBounds(186, 236, 78, 51);
		getContentPane().add(btn6);
		
		btnMinus = new JButton("");
		btnMinus.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/minus.png")));
		btnMinus.setBounds(274, 236, 78, 51);
		getContentPane().add(btnMinus);
		
		btn1 = new JButton("");
		btn1.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_1.png")));
		btn1.setBounds(10, 297, 78, 51);
		getContentPane().add(btn1);
		
		btn2 = new JButton("");
		btn2.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_2.png")));
		btn2.setBounds(98, 297, 78, 51);
		getContentPane().add(btn2);
		
		btn3 = new JButton("");
		btn3.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_3.png")));
		btn3.setBounds(186, 297, 78, 51);
		getContentPane().add(btn3);
		
		btnPlus = new JButton("");
		btnPlus.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/plus_2.png")));
		btnPlus.setBounds(274, 297, 78, 51);
		getContentPane().add(btnPlus);
		
		JButton button_10 = new JButton("");
		button_10.setBounds(10, 359, 78, 51);
		getContentPane().add(button_10);
		
		btn0 = new JButton("");
		btn0.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_0.png")));
		btn0.setBounds(98, 359, 78, 51);
		getContentPane().add(btn0);
		
		btnDot = new JButton("");
		btnDot.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/dot.png")));
		btnDot.setBounds(186, 359, 78, 51);
		getContentPane().add(btnDot);
		
		btnEqual = new JButton("");
		btnEqual.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/equal.png")));
		btnEqual.setBounds(274, 359, 78, 51);
		getContentPane().add(btnEqual);
		
		JButton button_14 = new JButton("");
		button_14.setBounds(10, 112, 78, 51);
		getContentPane().add(button_14);
		
		btnClear = new JButton("");
		btnClear.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/letter_c.png")));
		btnClear.setBounds(98, 112, 78, 51);
		getContentPane().add(btnClear);
		
		btnBackSpace = new JButton("");
		btnBackSpace.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/backspace.png")));
		btnBackSpace.setBounds(186, 112, 78, 51);
		getContentPane().add(btnBackSpace);
		
		btnDivide = new JButton("");
		btnDivide.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/division.png")));
		btnDivide.setBounds(274, 112, 78, 51);
		getContentPane().add(btnDivide);

	}
}
