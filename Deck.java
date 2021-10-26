import java.util.Random;
import java.io.Serializable;

public class Deck implements Serializable{
	
	private LinkedList<Card> list;
	
	public Deck() {
		list = new LinkedList<Card> ();
		for(int i = 0; i < 52; i++) {
			list.insertLast(new Card(i));
		}
		shuffle();
	}
	
	public int size() {
		return list.size();
	}
	
	public void restart() {
		list = new LinkedList<Card> ();
		for(int i = 0; i < 52; i++) {
			list.insertLast(new Card(i));
		}
		shuffle();
	}
	
	public void shuffle() {
		Card[] temp = new Card[52];
		Random random = new Random();
		for(int i = 0; i < 52; i ++) {
			int rand = random.nextInt(52);
			while(temp[rand] != null) {
				rand = random.nextInt(52);
			}
			temp[rand] = list.removeFirst().data();
		}
		for(int i = 0; i < 52; i ++) {
			list.insertLast(temp[i]);
		}
	}
	
	public Card remove() {
		return list.removeFirst().data();
	}
	
	@Override
	public String toString() {
		return "Size : \n" + size() + "\nDeck: \n" + list.toString();
	}
}
