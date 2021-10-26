import java.io.Serializable;

public class Card implements Comparable<Card>, Serializable{
	
	private int card;
	
	private String value;
	
	private String suit;
		
	public Card(int c) {
		card = c;
		if(card % 13 == 0) {
			value = "ace";
		}
		if(card % 13 == 1) {
			value = "two";
		}
		if(card % 13 == 2) {
			value = "three";
		}
		if(card % 13 == 3) {
			value = "four";
		}
		if(card % 13 == 4) {
			value = "five";
		}
		if(card % 13 == 5) {
			value = "six";
		}
		if(card % 13 == 6) {
			value = "seven";
		}
		if(card % 13 == 7) {
			value = "eight";
		}
		if(card % 13 == 8) {
			value = "nine";
		}
		if(card % 13 == 9) {
			value = "ten";
		}
		if(card % 13 == 10) {
			value = "jack";
		}
		if(card % 13 == 11) {
			value = "queen";
		}
		if(card % 13 == 12) {
			value = "king";
		}
		if(card < 13) {
			suit = "spades";
		}
		else if(card < 26) {
			suit = "clubs";
		}
		else if(card < 39) {
			suit = "hearts";
		}
		else {
			suit = "diamonds";
		}
		
	}
	
	public int card() {
		return card;
	}
	
	public String value() {
		return value;
	}
	
	public String suit() {
		return suit;
	}

	@Override
	public int compareTo(Card c) {
		Integer cardValue1 = card;
		Integer cardValue2 = c.card();
		return cardValue1.compareTo(cardValue2);
	}
	
	@Override
	public String toString() {
		return value + " of " + suit;
	}
}
