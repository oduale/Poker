import java.io.Serializable;

public class Player implements Serializable{
	
	private String name;
	
	private Hand hand;
	
	private int bank;
	
	public Player(String n, int b) {
		name = n;
		bank = b;
	}
	
	public String name() {
		return name;
	}
	
	public Hand hand() {
		return hand;
	}
	
	public int bank() {
		return bank;
	}
	
	public void addBank(int value) {
		bank += value;
	}
	
	public void removeBank(int value) {
		bank -= value;
	}
	
	public void draw(Card c) {
		hand.add(c);
	}
	
	public void clearHand() {
		hand.clear();
	}
	
	@Override
	public String toString() {
		return "Player: \n" + name + "\nBank: \n" + bank + "\nHand: \n" + hand.toString();
	}
}
