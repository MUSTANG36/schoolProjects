import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * 
 */

/**
 * @author Ricardo Ochoa
 *
 */
public class applications {

	private JFrame frame;
	private JButton leftbtn;
	private JButton rightbtn;
	private JButton bothbtn;
	private JLabel leftDice;
	private JLabel rightDice;
	
	ImageIcon one = new ImageIcon("C:\\\\Users\\\\Ricardo Ochoa\\\\eclipse-workspace\\\\DiceRoller\\\\img\\\\1.PNG");
	ImageIcon two = new ImageIcon("C:\\\\Users\\\\Ricardo Ochoa\\\\eclipse-workspace\\\\DiceRoller\\\\img\\\\2.PNG");
	ImageIcon three = new ImageIcon("C:\\\\Users\\\\Ricardo Ochoa\\\\eclipse-workspace\\\\DiceRoller\\\\img\\\\3.PNG");
	ImageIcon four = new ImageIcon("C:\\\\Users\\\\Ricardo Ochoa\\\\eclipse-workspace\\\\DiceRoller\\\\img\\\\4.PNG");
	ImageIcon five = new ImageIcon("C:\\\\Users\\\\Ricardo Ochoa\\\\eclipse-workspace\\\\DiceRoller\\\\img\\\\5.PNG");
	ImageIcon six = new ImageIcon("C:\\\\Users\\\\Ricardo Ochoa\\\\eclipse-workspace\\\\DiceRoller\\\\img\\\\6.PNG");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					applications window = new applications();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public applications() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		leftDice = new JLabel("");
		leftDice.setIcon(one);
		panel.add(leftDice);
		
		rightDice = new JLabel("");
		rightDice.setIcon(two);
		panel.add(rightDice);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		leftbtn = new JButton("Roll left");
		panel_1.add(leftbtn);
		
		rightbtn = new JButton("Roll right");
		panel_1.add(rightbtn);
		
		bothbtn = new JButton("Roll both");
		panel_1.add(bothbtn);
	
		
		leftbtn.addActionListener(new buttonHandler());
		rightbtn.addActionListener(new buttonHandler());
		bothbtn.addActionListener(new buttonHandler());
		
		
		
	}
			
		public class buttonHandler implements ActionListener{

			
			@Override
			public void actionPerformed(ActionEvent e) {
				int newRoll; 
				// TODO Auto-generated method stub
				if(e.getSource() == leftbtn) {
					
					   newRoll = (int)(6 * Math.random());
					   if (newRoll == 1) {
						   leftDice.setIcon(one );
					   } if (newRoll == 2) {
						   leftDice.setIcon(two);
					   }  if (newRoll == 3) {
						   leftDice.setIcon(three);
					   } if (newRoll == 4) {
						   leftDice.setIcon(four);
					   } if (newRoll == 5) {
						   leftDice.setIcon(five);
					   } if (newRoll == 6) {
						   leftDice.setIcon(six);
					   }
					   }
				
				if(e.getSource() == rightbtn) {
					 newRoll = (int)(6 * Math.random());
					   if (newRoll == 1) {
						   rightDice.setIcon(one );
					   } if (newRoll == 2) {
						   rightDice.setIcon(two);
					   }  if (newRoll == 3) {
						   rightDice.setIcon(three);
					   } if (newRoll == 4) {
						   rightDice.setIcon(four);
					   } if (newRoll == 5) {
						   rightDice.setIcon(five);
					   } if (newRoll == 6) {
						   rightDice.setIcon(six);
					   }
				}

				if(e.getSource() == bothbtn) {
					 newRoll = (int)(6 * Math.random());
					 int newRoll2 = (int)(6 * Math.random());
					 
					   if (newRoll == 1) {
						   leftDice.setIcon(one );
					   } if (newRoll == 2) {
						   leftDice.setIcon(two );
	
					   }  if (newRoll == 3) {
						   leftDice.setIcon(three );
					   } if (newRoll == 4) {
						   leftDice.setIcon(four);
						   
					   } if (newRoll == 5) {
						   leftDice.setIcon(five);
						  
					   } if (newRoll == 6) {
						   leftDice.setIcon(six);
						
					   }
					   if (newRoll2 == 1) {
						   rightDice.setIcon(one );
					   } if (newRoll2 == 2) {
						   rightDice.setIcon(two );
	
					   }  if (newRoll2 == 3) {
						   rightDice.setIcon(three );
					   } if (newRoll2 == 4) {
						   rightDice.setIcon(four);
						   
					   } if (newRoll2 == 5) {
						   rightDice.setIcon(five);
						  
					   } if (newRoll2 == 6) {
						   rightDice.setIcon(six);
						
					   }
				}

			}
			
		}
			
		

	
}
