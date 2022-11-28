
public class BlackjackCard extends Card {
	public BlackjackCard(int suitNumber, int rankNumber) {
		super(suitNumber, rankNumber);
		// TODO Auto-generated constructor stub
	}

	public int getValue() {
		Card card = new Card(suitNumber, rankNumber);
		
		switch (card.getRank()) {
		case "Ace":
			return 11;
		case "Jack":
			return 10;
		case "Queen":
			return 10;
		case "King":
			return 10;
		default:
			return card.rankNumber;
		}
	}
	
	public boolean isAce() {
		Card card = new Card(suitNumber, rankNumber);
		if (card.rankNumber == 1) {
			return true;
		} else {
			return false;
		}
	}
}
