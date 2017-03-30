import javax.swing.*;
import java.awt.*;

public class GUI {
	private JPanel pnlNorth = new JPanel();
	private JPanel pnlCenter = new JPanel();
	private JPanel pnlEast = new JPanel();
	
	public static void main(String args[]) {
		new GUI();
	}
	
	public GUI() {
		JFrame frame = new JFrame();
		
		frame.setTitle("Calculator");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//Container pane = frame.getContentPane();
		
		//pane.setLayout(new GridLayout(5,10));
		
		JTextField f1 = new JTextField(10);
		
		f1.setEditable(false);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b0 = new JButton("0");
		JButton bclr = new JButton("Clear");
		JButton bplus = new JButton("+");
		JButton bminus = new JButton("-");
		JButton btimes = new JButton("*");
		JButton bdivide = new JButton("%");
		JButton bequals = new JButton("=");
		
		pnlNorth.add(f1);
		pnlCenter.add(b1);
		pnlCenter.add(b2);
		pnlCenter.add(b3);
		pnlCenter.add(b4);
		pnlCenter.add(b5);
		pnlCenter.add(b6);
		pnlCenter.add(b7);
		pnlCenter.add(b8);
		pnlCenter.add(b9);
		pnlCenter.add(b0);
		pnlEast.add(bclr);
		pnlEast.add(bplus);
		pnlEast.add(bminus);
		pnlEast.add(btimes);
		pnlEast.add(bdivide);
		pnlEast.add(bequals);
		
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(pnlNorth, BorderLayout.NORTH);
		frame.getContentPane().add(pnlCenter, BorderLayout.CENTER);
		frame.getContentPane().add(pnlEast, BorderLayout.EAST);
		
		/*
		pane.add(l1);
		pane.add(b1);
		pane.add(b2);
		pane.add(b3);
		pane.add(b4);
		pane.add(b5);
		pane.add(b6);
		pane.add(b7);
		pane.add(b8);
		pane.add(b9);
		pane.add(b0);
		*/
		
	}
}
