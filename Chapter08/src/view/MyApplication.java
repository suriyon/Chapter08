package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class MyApplication extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private ShowNameJFrame showNameJFrame;
	private CalculatorJFrame calculatorJFrame;
	private JMenuItem mntmShowName;
	private JMenuItem mntmExit;

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
					MyApplication frame = new MyApplication();
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
	public MyApplication() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MyApplication.class.getResource("/images32/facebook.png")));
		setTitle("My Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmShowName = new JMenuItem("Show Name");
		mntmShowName.setIcon(new ImageIcon(MyApplication.class.getResource("/images16/facebook_16.png")));
		mntmShowName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(showNameJFrame==null || showNameJFrame.isClosed()) {
					showNameJFrame = new ShowNameJFrame();
					showNameJFrame.setVisible(true);
					desktopPane.add(showNameJFrame);
				}
			}
		});
		mnFile.add(mntmShowName);
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.setIcon(new ImageIcon(MyApplication.class.getResource("/images16/close_16.png")));
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton toolBarExit = new JButton("Exit");
		toolBarExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JButton toolBarShowName = new JButton("Show Name");
		toolBarShowName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(showNameJFrame==null || showNameJFrame.isClosed()) {
					showNameJFrame = new ShowNameJFrame();
					showNameJFrame.setVisible(true);
					desktopPane.add(showNameJFrame);
				}
			}
		});
		toolBarShowName.setIcon(new ImageIcon(MyApplication.class.getResource("/images32/facebook.png")));
		toolBar.add(toolBarShowName);
		
		JButton toolBarCalculator = new JButton("Calculator");
		toolBarCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(calculatorJFrame==null || calculatorJFrame.isClosed()) {
					calculatorJFrame = new CalculatorJFrame();
					calculatorJFrame.setVisible(true);
					desktopPane.add(calculatorJFrame);
				}
			}
		});
		toolBarCalculator.setIcon(new ImageIcon(MyApplication.class.getResource("/images32/calculator.png")));
		toolBar.add(toolBarCalculator);
		toolBarExit.setIcon(new ImageIcon(MyApplication.class.getResource("/images32/close.png")));
		toolBar.add(toolBarExit);
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
	}
}
