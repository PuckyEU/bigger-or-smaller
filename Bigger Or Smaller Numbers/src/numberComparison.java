import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
@SuppressWarnings("unused")
public class numberComparison implements ActionListener {
	
	private JFrame  frame;
	private JPanel panel;
	private JTextField userInput;
	private static JLabel outputLabelOne;
	private static JLabel outputLabelTwo;
	private static JLabel comparator;
	static int pointsOne;
	static String stringPointsOne;
	static int pointsTwo;
	static String stringPointsTwo;
	static String stringComparator;
	
	public numberComparison() {
		
		JFrame frame = new JFrame("Comparator");
		frame.setSize(500, 500);
		frame.setLayout(null);

		JButton addNumberOne = new JButton("+");
		JButton addNumberTwo = new JButton("+");
		JButton removeNumberOne = new JButton("-");
		JButton removeNumberTwo = new JButton("-");
		outputLabelOne = new JLabel();
		outputLabelTwo = new JLabel();
		comparator = new JLabel();

		addNumberOne.setBounds(75, 100, 150, 50);
		addNumberOne.setFont(new Font("Arial", Font.BOLD, 32));
		removeNumberOne.setBounds(225, 100, 150, 50);
		removeNumberOne.setFont(new Font("Arial", Font.BOLD, 32));
		addNumberTwo.setBounds(75, 200, 150, 50);
		addNumberTwo.setFont(new Font("Arial", Font.BOLD, 32));
		removeNumberTwo.setBounds(225, 200, 150, 50);
		removeNumberTwo.setFont(new Font("Arial", Font.BOLD, 32));
		outputLabelOne.setBounds(136, 300, 200, 50);
		outputLabelOne.setFont(new Font("Arial", Font.BOLD, 32));
		outputLabelOne.setForeground(Color.BLUE);
		outputLabelOne.setText("" + pointsOne);
		outputLabelTwo.setBounds(286, 300, 200, 50);
		outputLabelTwo.setFont(new Font("Arial", Font.BOLD, 32));
		outputLabelTwo.setForeground(Color.BLUE);
		outputLabelTwo.setText("" + pointsOne);
		comparator.setBounds(218, 300, 200, 50);
		comparator.setFont(new Font("Arial", Font.BOLD, 32));
		comparator.setForeground(Color.BLUE);
		comparator.setText("" + pointsOne);

		frame.add(addNumberOne);
		frame.add(addNumberTwo);
		frame.add(removeNumberOne);
		frame.add(removeNumberTwo);
		frame.add(outputLabelOne);
		frame.add(outputLabelTwo);
		frame.add(comparator);
		
		comparator.setText("=");

		addNumberOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberComparison.addOnePoint();
				numberComparison.compare();
			}
		});
		removeNumberOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberComparison.removeOnePoint();
				numberComparison.compare();
			}
		});
		addNumberTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberComparison.addTwoPoint();
				numberComparison.compare();
			}
		});
		removeNumberTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberComparison.removeTwoPoint();
				numberComparison.compare();
			}
		});
		frame.setVisible(true);
	}
	
		public static void addOnePoint(){
			pointsOne++;
			outputLabelOne.setText("" + pointsOne);
			
			System.out.println("1:" + pointsOne);
			stringPointsOne = String.valueOf(pointsOne);
		}
		
		public static void removeOnePoint() {
			pointsOne--;
			outputLabelOne.setText("" + pointsOne);
			
			System.out.println("1:" + pointsOne);
			stringPointsOne = String.valueOf(pointsOne);
		}
		public static void addTwoPoint(){
			pointsTwo++;
			outputLabelTwo.setText("" + pointsTwo);
			
			System.out.println("2:" + pointsTwo);
			stringPointsTwo = String.valueOf(pointsTwo);
		}
		
		public static void removeTwoPoint() {
			pointsTwo--;
			outputLabelTwo.setText("" + pointsTwo);
			
			System.out.println("2:" + pointsTwo);
			stringPointsTwo = String.valueOf(pointsTwo);
		}
		
		public static void compare() {
			if(pointsOne < pointsTwo) {
				comparator.setText("<");
				System.out.println("<");
			}
			else if(pointsOne > pointsTwo) {
				comparator.setText(">");
				System.out.println(">");
			}
			else if(pointsOne == pointsTwo) {
				comparator.setText("=");
				System.out.println("=");
			}
			else {
				comparator.setText("");
				System.out.println("");
			}
			
		}
	public static void main(String[] args) {
		new numberComparison();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
