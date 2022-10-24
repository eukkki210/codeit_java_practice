import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void print() {
		for (Card c : cards)
			System.out.println(c.toString());
	}
	
	public void shuffle() {
		Random random = new Random();
		
		for (int i = 0; i < cards.size(); i++) {
			int randIndex = random.nextInt(cards.size());
			Card temp = cards.get(i);
			cards.set(i, cards.get(randIndex));
			cards.set(randIndex, temp);
		}
	}
	
	public Deck deal(int count) {
		Deck hand = new Deck();
		if (count == 5) {
			for (int i = 0; i < count; i++) {
				hand.addCard(cards.remove(i));
			}
		}
		return hand;
	}
}
