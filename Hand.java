
public class Hand {
	
	private LinkedList<Card> list;
	
	public Hand() {
		list = new LinkedList<Card> ();
	}
	
	public LinkedList<Card> list(){
		return list;
	}
	
	public int size() {
		return list.size();
	}
	
	public void add(Card c) {
		list.insertLast(c);
	}
	
	public void clear() {
		list = new LinkedList<Card> ();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}
