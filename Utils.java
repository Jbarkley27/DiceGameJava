import java.util.Scanner;
import java.util.Random;
public class Utils {

	//THIS IS MY ROLL METHOD
	//WHICH GENERATES A RANDOM NUMBER FROM 1 TO 6
	public static int roll() {
		int randomRoll = (int )(Math.random() * 6 + 1);
		return randomRoll;
		
	}
	//THIS IS MY MOVE METHOD
	//CALCULATES THE PLAYERS MOVEMENT
	public static int move(int currentPositionHolder, int movementAmount) {
		
		//THIS CURRENTPOSITIONHOLDER VARIABLE HOLDS THE PLAYERS 
		//INITIAL POSITION WHICH WILL BE CONVERTED INTO THE 
		//INITIAL POSITION VARIABLE IN THE MAIN METHOD
		currentPositionHolder = currentPositionHolder + movementAmount;
		
		//THIS GETS THE INITIAL POSITION'S LAST DIGIT AND HOLDS IT
		//IN THE LASTDIGIT VARIABLE
		int lastDigit = currentPositionHolder%10;
		
		//THIS LOGIC CALCULATES IF THE INITIAL POSITION NEEDS TO
		//RUN THROUGH A SECOND CALCULATION STEP
		//OR THE RULES OF THE GAME
		if(currentPositionHolder > 100) {
			currentPositionHolder = currentPositionHolder - 100;
		} else if (lastDigit == 5) {
			currentPositionHolder = currentPositionHolder + 5;
		} else if (currentPositionHolder % 13 == 0) {
			int newMovementAmount = movementAmount*2;
			currentPositionHolder = currentPositionHolder - newMovementAmount;
		}
		
		//RETURNS INITIAL POSITION IN THIS VARIABLE
		return currentPositionHolder;
		
	}
	
}
