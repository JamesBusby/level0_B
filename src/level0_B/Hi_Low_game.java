package level0_B;

import java.util.Random;

import javax.swing.JOptionPane;

public class Hi_Low_game {

public static void main(String[] args) {
	int x = new Random().nextInt(100)+1;

	for (int i = 0; i < 10; i++) {
		String number = JOptionPane.showInputDialog("I'm thinking of a number between 1 and 100");
		int y = Integer.parseInt(number);
		if (y == x) {
			JOptionPane.showMessageDialog(null,"Good Job"+" The Answer Was "+y);
			System.exit(0);
		}
		else if(y < x){
			JOptionPane.showMessageDialog(null,"Too Low");
		}
		else if(y > x){
		JOptionPane.showMessageDialog(null, "Too High");
		}
		else if(y < 1){
			JOptionPane.showMessageDialog(null, "Too Low");
		}
		
	}
	JOptionPane.showMessageDialog(null, "You Lose");
}
}


