# DiceGameJava
This is a small dice game written in Java

The player starts on square 0.
The player makes a series of moves.  The player may choose to move 1 square, or the player may choose to roll two dice, and move the number of squares represented by the sum of the dice.  The player’s move puts him at an “initial position.”  
The player’s initial position may be changed to a “final position” by the following rules.  The rules are checked in the following order, and only the first applicable rule should be applied:



1.	If the initial position is past square 100, the final position is calculated by subtracting 100 from the initial position.  For example, if the player is on square 94 and rolls 10, thus giving an initial position of 104, the final position will be position 4 (104 – 100).


2.	If the initial position ends in 5 (5, 15, 25, etc.), the player is moved an extra 5 places for the final position.  For example, if the player is on position 33 and rolls 2, placing him on position 35, he is moved 5 extra spaces, putting him at position 40.  If a player is on position 44 and chooses to move 1 square to position 45, he is moved 5 squares for a final position of 50.



3.	If the initial position is evenly divisible by 13 (13, 26, 39, etc.), the final position is calculated by subtracting twice the player’s movement from the initial position.  For example, if a player is on position 29 and rolls 10, the initial position is 39, which is evenly divisible by 13.  The final position is calculated by subtracting twice the movement (2 * 10) from the initial position of 39, yielding a final position of 19.  If a player at position 25 chooses to move 1, the initial position is 26.  The final position is calculated by subtracting twice the movement (2 * 1) from the initial position of 26, giving a final position of 24.


4.	If none of the above conditions hold, the initial position becomes the final position.
When the player lands on position 100, the game terminates.

