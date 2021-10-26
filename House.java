import java.io.Serializable;

public class House implements Serializable{
	
	private Hand hand;
	
	private int pot;
	
	public House() {
		pot = 0;
		hand = new Hand();
	}
	
	public Hand hand() {
		return hand;
	}
	
	public int pot() {
		return pot;
	}
	
	public void addPot(int value) {
		pot += value;
	}
	
	public int clearPot() {
		int temp = pot;
		pot = 0;
		return temp;
	}
	
	public void draw(Card c) {
		hand.add(c);
	}
	
	public void clearHand() {
		hand.clear();
	}
	
	@Override
	public String toString() {
		return "House\nPot: \n" + pot + "\nHand: \n" + hand.toString();
	}
}
