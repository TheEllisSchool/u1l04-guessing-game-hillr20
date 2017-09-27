import javax.swing.JOptionPane;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computerNum = (int)(Math.random()*100) + 1; 
		//Code generates a decimal -> multiple by 100 to make it a whole number ->
		//use int to convert to integer to cut off decimal
		int userGuess = -100;
		int guessCount = 0;
		while (userGuess != computerNum && userGuess != -1) {
			String input = JOptionPane.showInputDialog(null, "This is a number guessing game. "
					+ "\nPlease guess a whole number between 1 and 100.");
			userGuess = Integer.parseInt(input);
			//JOptionPane.showMessageDialog(null, "Your guess was " + userGuess + ".");
			if (userGuess == -1){
				break;
			}
			else if (userGuess < 0 || userGuess > 100){
				JOptionPane.showMessageDialog(null, "Your number is invalid."
						+ " Please enter a number between 1 and 100.");	
			}
			
			else if (userGuess > computerNum){
				if (userGuess - 10 <= computerNum) {
					JOptionPane.showMessageDialog(null, "Your guess a little too high; "
							+ "within 10 of the number! Guess a little lower.");
					//guessCount ++; 
					//return guessCount;
				}
				else {
					JOptionPane.showMessageDialog(null, "Your guess was too high! "
							+ "Make a lower guess.");
					//guessCount ++;
				}
				guessCount ++;
			}
			else if (userGuess < computerNum) {
				if (userGuess + 10 >= computerNum) {
					JOptionPane.showMessageDialog(null, "Your guess was a little too low; "
							+ "but within 10 of the number! Guess a little higher.");
				}
				else {
					JOptionPane.showConfirmDialog(null, "Your guess was too low!"
							+ " Make a higher guess.");	
				}
				guessCount ++;
						
			}
			else {
				JOptionPane.showMessageDialog(null, "Yay! You guessed correctly!");
			}
			//JOptionPane.showMessageDialog(null, "# = " + computerNum +
					//"# of guesses = " + guessCount);
		}
		JOptionPane.showMessageDialog(null, "The random number was: " + computerNum +
				"\nIt took you " + guessCount + " guesses.");

	}

}
