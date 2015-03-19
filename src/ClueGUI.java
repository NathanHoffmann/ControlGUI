
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class ClueGUI extends JFrame {
	private JTextField turn;

	public ClueGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,240);
		createLayout();
	}
	
	private void createLayout() {
		
		JLabel turnLabel = new JLabel("Whose Turn?");
		turn = new JTextField(20);
		
		JButton next = new JButton("Next Player");
		JButton accusation = new JButton("Make an Accusation");
		
		
		JLabel rollLabel = new JLabel("Roll");
		JTextField roll = new JTextField(1);
		roll.setEditable(false);
		
		JLabel guessLabel = new JLabel("Guess");
		JTextField guess = new JTextField(50);
		guess.setEditable(false);
		
		JLabel resultLabel = new JLabel("Response");
		JTextField result = new JTextField(10);
		result.setEditable(false);
		
		JPanel dice = new JPanel();
		dice.setBorder(new TitledBorder (new EtchedBorder(), "Die"));
		dice.add(rollLabel);
		dice.add(roll);
		dice.setLayout(new GridLayout(1,2));
		
		JPanel guesses = new JPanel();
		guesses.setBorder(new TitledBorder(new EtchedBorder(),"Guess"));
		guesses.add(guessLabel);
		guesses.add(guess);
		guesses.setLayout(new GridLayout(2,1));
		
		JPanel guessResult = new JPanel();
		guessResult.setBorder(new TitledBorder (new EtchedBorder(), "Guess Result"));
		guessResult.add(resultLabel);
		guessResult.add(result);
		guessResult.setLayout(new GridLayout(1,2));
		
		JPanel top = new JPanel();
		JPanel center = new JPanel();
		JPanel whoseTurn = new JPanel();
		top.setLayout(new GridLayout(1,3));
		center.setLayout(new GridLayout(1,3));
		
		whoseTurn.add(turnLabel);
		whoseTurn.add(turn);
		
		top.add(whoseTurn);
		top.add(next);
		top.add(accusation);
		
		center.add(dice);
		center.add(guesses);
		center.add(guessResult);
		
		setLayout(new GridLayout(2,1));
		add(top,BorderLayout.NORTH);
		add(center,BorderLayout.CENTER);
				
	}
	
	public static void main(String[] args) {
		ClueGUI gui = new ClueGUI();
		gui.setVisible(true);
	}
}