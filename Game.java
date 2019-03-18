import java.util.Scanner;




public class Game {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int initialPosition = 0;
		Scanner input = new Scanner(System.in);
		
		//THIS BOOLEAN WILL BE USED AS A ON AND OFF SWITCH FOR THE GAME
		boolean exit = true;
		
		//THESE ARE THE INITIAL DICEROLL VALUES
		int diceRollOne = 0;
		int diceRollTwo = 0;
		
		//SINCE EXIT STARTS AT TRUE THIS LOOP WILL BEGIN
		while(exit) {
			
			
			
			//TEXT TO INFORM USER ON CURRENT POSITION AND ACTIONS TO TAKE
			System.out.println("You are now at position " + initialPosition);
			System.out.println("What do you want to do?");
			
			System.out.println("0 to exit");
			System.out.println("1 to move 1 space, ");
			System.out.println("2 to roll");
			
			//USER INPUT
			int playerChoice = input.nextInt();
			
			
			
			if(playerChoice == 0) {
				//THIS IS MY EXIT STRATEGY
				//IF USER ENTERS 0 THEN EXIT WILL SWITCH TO FALSE
				//WHICH WILL STOP THE LOOP
				System.out.println("You exited the game");
				System.out.println("Bye");
				exit = false;
				
			} else if (playerChoice == 1) {
				int currentPositionHolder = Utils.move(initialPosition, 1);
				initialPosition = currentPositionHolder;
				
				
				
			} else if (playerChoice == 2) {
				//ROLLING TWO DICE
				diceRollOne = Utils.roll();
				diceRollTwo = Utils.roll();
				int totalDiceRoll = diceRollOne+diceRollTwo;
				
				//CALLING MY MOVE METHOD TO CALCULATE INITIAL POSITION
				int currentPositionHolder = Utils.move(initialPosition, totalDiceRoll );
				initialPosition = currentPositionHolder;
				System.out.println("You rolled " + totalDiceRoll + " and moved " + totalDiceRoll + " spaces");
				
			} else if (playerChoice > 2) {
				//THIS IS JUST A WAY MAKE SURE THE USER DOESNT
				//ENTER ANYTHING OTHER THAN THE STANDAR INPUTS FOR THE GAME
				System.out.println("You chose an invalid input, restart game");
				exit = false;
			}
			if(initialPosition == 100) {
				System.out.println("You won");
				System.out.println("Bye");
				exit = false;
			}
		}
		
	}
	
	


}
