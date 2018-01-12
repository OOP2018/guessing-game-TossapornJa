import java.util.Random; 
/**
 * GuessingGame is about numbers.
 * @author Tossaporn_Jarupinyo
 */
public class GuessingGame extends NumberGame {
	/* properties of a guessing game */
	private int upperbound;
	private int secret;
	private int count;
	
	public GuessingGame(int upperbound) {
		this.upperbound = upperbound;
		long seed = System.nanoTime();
		Random ran = new Random(seed);
		this.secret = ran.nextInt(upperbound)+1;
		super.setMessage("I thinking of a number between 1 an 100");
		this.count = 0;
	}
	
	public int getUpperBound() {
		return upperbound;
	}
	
	public boolean guess(int number) {
    	if (number == secret) {
    		count++;
    		setMessage("Correct! The number is "+secret+".It's true!!!. You play "+count+" round ");
    		return true;
    	}
    	 if (number < secret) {
    		 count++;
    		setMessage("Your answer is too small.");
    	}
    	else if (number > secret) {
    		count++;
    		setMessage("Your answer is too large.");
    	}
    	return false;
    }
	/**
	 * get total to play guessing game
	 * @return total number that you play
	 */
	public int getCount() {
		return count;
	}
	
	public String toString() {
		return "Guessing game have a secret number between 1 and 100";
    }
}
