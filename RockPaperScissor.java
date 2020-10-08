// (Game: scissor, rock, paper)
// Yesterday we made a program that plays the scissor-rock-paper game.
// Revise the program to let the user continuously play until either the user
// or the computer wins more than two times than its opponent.
// You should include some text after every round prompting the next input. 

import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

		int computerWins;
		int	userWins;		
		computerWins = userWins = 0;

		do {
			int computer = (int)(Math.random() * 3);
	
			System.out.print("scissor (0), rock(1), paper (2): ");
			int user = input.nextInt();
	
			System.out.print("The computer is ");
			switch (computer)
			{
				case 0: System.out.print("scissor."); break;
				case 1: System.out.print("rock."); break;
				case 2: System.out.print("paper."); break;
			}
	
			System.out.print(" You are ");
			switch (user)
			{
				case 0: System.out.print("scissor"); break;
				case 1: System.out.print("rock"); break;
				case 2: System.out.print("paper"); break;
				default : System.out.println("wrong number");
			}
	
			if (computer == user) {
                System.out.println(". draw.");
            } else {

                boolean win = (user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1);
                
				if (win) {
                    System.out.println(". You won!");
                    userWins++;
				} else {
					System.out.println(". You lose.");
					computerWins++;
				}
				
			}

            System.out.println("Computer wins: " + computerWins + "\nUser wins: " + userWins);

        } while (Math.abs(computerWins - userWins) <= 2); 

    }    
    
}
