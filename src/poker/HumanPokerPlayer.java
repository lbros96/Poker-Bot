package poker;

import java.util.Scanner;

public class HumanPokerPlayer extends PokerPlayer {
	
	public HumanPokerPlayer(DeckOfCards deck) {
		super(deck);
		System.out.println("What is your name?");
		name = prompt();
	}
	
	public String prompt() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	public int getChipsToBet() {
		boolean correctInput = false;
		int chipsBet = 0;
		do {
			System.out.println("How much would you like to bet? (< " + chips + ")");
			try {
				chipsBet = Integer.parseInt(prompt());

				if (chipsBet > chips) { // Cannot bet more than chips held by player
					System.out.println("You only have " + chips + " chip(s)");
				}
				else if (chipsBet < 0) {
					System.out.println("Must be a positive number!");
				}
				else {
					bet(chipsBet); // take chips away from player
					System.out.println("> You have bet " + chipsBet + " chip(s)");
					return chipsBet;
				}
			}
			catch (NumberFormatException e){ // String entered is not a valid integer
				System.out.println("Bet must be a number!");
			}

		} while (!correctInput);
		return chipsBet;
	}
	
	public boolean fold() {
		System.out.println("\nWould you like to fold?");
		String input = prompt();

		do {
			if (input.equals("y") || input.equals("Y")) {
				System.out.println("You have folded\n");
				return true;
			}
			else if (input.equals("n") || input.equals("N")) {
				return false;
			}
			else {
				System.out.println("Wrong input");
			}
		} while (true);
	}
}
