import javax.swing.JOptionPane;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computerNum = (int)(Math.random()*100) + 1; 
		//Code generates a decimal -> multiple by 100 to make it a whole number ->
		//use int to convert to integer to cut off decimal
		int userGuess;
		while (userGuess != computerNum && userGuess != -1) {
			String input = JOptionPane.showInputDialog(null, "This is a number guessing game. "
					+ "\nPlease guess a whole number between 1 and 100.");
			userGuess = Integer.parseInt(input);
			JOptionPane.showMessageDialog(null, "Your guess was " + userGuess);
			
			
		}
		

	}

}
