package poker;

public class AutomatedPokerPlayer extends PokerPlayer{
		
	public AutomatedPokerPlayer(DeckOfCards deck, String botName) {
		super(deck);
		name = botName;
	}
	
	// returns amount of chips to bet according to hand held
	public int getChipsToBet() {
		// TODO
		if (chips > 2) {
			return 0;
		}
		else {
			return 0;
		}
	}
	
	// returns whether Bot folds or not
	public boolean fold(int lastBet) {
		// TODO
		if (chips <= lastBet) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
