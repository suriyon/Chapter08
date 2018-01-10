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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	
	private String tmp = "", operator, showResult = "";
	private float result = 0.0f, acc, operand;

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
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblResult.setBounds(10, 11, 342, 90);
		getContentPane().add(lblResult);
		
		btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp += "7";
				lblResult.setText(tmp);
			}
		});
		btn7.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_7.png")));
		btn7.setBounds(10, 174, 78, 51);
		getContentPane().add(btn7);
		
		btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp += "8";
				lblResult.setText(tmp);
			}
		});
		btn8.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_8.png")));
		btn8.setBounds(98, 174, 78, 51);
		getContentPane().add(btn8);
		
		btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp += "9";
				lblResult.setText(tmp);
			}
		});
		btn9.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_9.png")));
		btn9.setBounds(186, 174, 78, 51);
		getContentPane().add(btn9);
		
		btnMultiply = new JButton("");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblResult.setText(tmp);
				acc = Float.parseFloat(tmp);
				tmp = "";
				operator = "*";
			}
		});
		btnMultiply.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/multiply.png")));
		btnMultiply.setBounds(274, 174, 78, 51);
		getContentPane().add(btnMultiply);
		
		btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp += "4";
				lblResult.setText(tmp);
			}
		});
		btn4.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_4.png")));
		btn4.setBounds(10, 236, 78, 51);
		getContentPane().add(btn4);
		
		btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp += "5";
				lblResult.setText(tmp);
			}
		});
		btn5.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_5.png")));
		btn5.setBounds(98, 236, 78, 51);
		getContentPane().add(btn5);
		
		btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp += "6";
				lblResult.setText(tmp);
			}
		});
		btn6.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_6.png")));
		btn6.setBounds(186, 236, 78, 51);
		getContentPane().add(btn6);
		
		btnMinus = new JButton("");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResult.setText(tmp);
				acc = Float.parseFloat(tmp);
				tmp = "";
				operator = "-";
			}
		});
		btnMinus.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/minus.png")));
		btnMinus.setBounds(274, 236, 78, 51);
		getContentPane().add(btnMinus);
		
		btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tmp += "1";
				lblResult.setText(tmp);
			}
		});
		btn1.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_1.png")));
		btn1.setBounds(10, 297, 78, 51);
		getContentPane().add(btn1);
		
		btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp += "2";
				lblResult.setText(tmp);
			}
		});
		btn2.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_2.png")));
		btn2.setBounds(98, 297, 78, 51);
		getContentPane().add(btn2);
		
		btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp += "3";
				lblResult.setText(tmp);
			}
		});
		btn3.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_3.png")));
		btn3.setBounds(186, 297, 78, 51);
		getContentPane().add(btn3);
		
		btnPlus = new JButton("");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResult.setText(tmp);
				acc = Float.parseFloat(tmp);
				tmp = "";
				operator = "+";
				
			}
		});
		btnPlus.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/plus_2.png")));
		btnPlus.setBounds(274, 297, 78, 51);
		getContentPane().add(btnPlus);
		
		JButton button_10 = new JButton("");
		button_10.setBounds(10, 359, 78, 51);
		getContentPane().add(button_10);
		
		btn0 = new JButton("");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp += "0";
				lblResult.setText(tmp);
			}
		});
		btn0.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/number_0.png")));
		btn0.setBounds(98, 359, 78, 51);
		getContentPane().add(btn0);
		
		btnDot = new JButton("");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tmp += ".";
				lblResult.setText(tmp);
			}
		});
		btnDot.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/dot.png")));
		btnDot.setBounds(186, 359, 78, 51);
		getContentPane().add(btnDot);
		
		btnEqual = new JButton("");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand = Float.parseFloat(tmp);
				tmp = "";				
//				System.out.println("Accumulator : " + acc);
//				System.out.println("Operand : " + operand);
//				System.out.println("Operator : " + operator);
				result = calculate(acc, operand, operator);
				lblResult.setText("" + result);
				acc = 0.0f;
				operand = 0.0f;
			}
		});
		btnEqual.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/equal.png")));
		btnEqual.setBounds(274, 359, 78, 51);
		getContentPane().add(btnEqual);
		
		JButton button_14 = new JButton("");
		button_14.setBounds(10, 112, 78, 51);
		getContentPane().add(button_14);
		
		btnClear = new JButton("");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResult.setText("0");
				acc = 0.0f;
				operand = 0.0f;
				result = 0.0f;
				tmp = "";
				
			}
		});
		btnClear.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/letter_c.png")));
		btnClear.setBounds(98, 112, 78, 51);
		getContentPane().add(btnClear);
		
		btnBackSpace = new JButton("");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnBackSpace.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/backspace.png")));
		btnBackSpace.setBounds(186, 112, 78, 51);
		getContentPane().add(btnBackSpace);
		
		btnDivide = new JButton("");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResult.setText(tmp);
				acc = Float.parseFloat(tmp);
				tmp = "";
				operator = "/";
			}
		});
		btnDivide.setIcon(new ImageIcon(CalculatorJFrame.class.getResource("/images32/division.png")));
		btnDivide.setBounds(274, 112, 78, 51);
		getContentPane().add(btnDivide);

	}

	protected float calculate(float acc, float operand, String operator) {
		float result = 0.0f;
		switch(operator) {
			case "+" : result = acc + operand;break;
			case "-" : result = acc - operand;break;
			case "*" : result = acc * operand;break;
			case "/" : result = acc / operand;break;
		}
		return result;
	}
}
