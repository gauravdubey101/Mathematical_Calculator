package calculator;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class calculator {
	
	JFrame frame =  new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	
	JButton buttonadd = new JButton();
	JButton buttonsub = new JButton();
	JButton buttonmul = new JButton();
	JButton buttondiv = new JButton();
	JButton buttonclear = new JButton();
	JButton buttondot = new JButton();
	JButton buttonequal = new JButton();
	
	double number1,number2,result;
	int addc = 0,mulc=0,divc = 0,subc =0;
	
	public calculator() {
		frame.setSize(400,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Gaurav");
		
		//frame.setResizable(false);
		
		frame.add(panel);
		panel.setBackground(color.LiGHT_GRAY);
		Boder Border border = BorderFactory.createLineBorder(color.Voilet,4);
		
		panel.add(textarea);
		textarea.setBackground(Color,BLACK);
		Border tborder = BorderFactory.createLineBorder(Color,Blue,3);
		textarea.setBorder(tborder);
		font font new Font("arial",Font.Bold,33);
		textarea.setFont(font);
		textarea.setForeground(Color.WHITE);
		textarea.setPreferredSize(new Dimension(2,10));
	}
	
}
