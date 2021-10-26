
public class Game {
	
	private Deck deck;
	
	private House house;
	
	private LinkedList<Player> players;
	
	public Game(String[] playerNames, int startingBank) {
		deck = new Deck();
		house = new House();
		players = new LinkedList<Player> ();
		for(int i = 0; i < players.size(); i ++) {
			players.insertLast(new Player(playerNames[i], startingBank));
		}
	}
	
	public Deck deck() {
		return deck;
	}
	
	public House house() {
		return house;
	}
	
	public LinkedList<Player> players() {
		return players;
	}
	
	public Player player(int value) {
		int v = value;
		Node<Player> temp = players.getFirst();
		while(v > 0 && temp != null) {
			temp = temp.next();
			v --;
		}
		return temp.data();
	}
	
	public void addPlayer(Player p) {
		players.insertLast(p);
	}
	
	public void bet(Player p, int value) {
		p.removeBank(value);
		house.addPot(value);
	}
}
