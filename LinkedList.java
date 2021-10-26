
public class LinkedList<T> {

   	private Node<T> head;

    private Node<T> tail;

	private int size;

	public LinkedList(){
		size = 0;
	}

	public int size() {
		return size;
	}
	
	public Node<T> getFirst() {
		return head;
	}

	public void insertFirst(T value) {
		if(head == null) {
			head = new Node<T>(value);
		}
		else if(size == 1) {
			Node<T> temp = new Node<T>(value, head);
			tail = head;
			head = temp;
		}
		else {
			Node<T> temp = new Node<T>(value, head);
			head = temp;
		}
		size ++;
	}

	public void insertLast(T value) {
		Node<T> newNode = new Node<T> (value);
		if(head == null) {
			head = newNode;
		}
		else if(size == 1) {
			head.setNext(newNode);
			tail = newNode;
		}
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
		size ++;
	}

	public Node<T> removeFirst() {
		if(head == null) {
			return null;
		}
		Node<T> output = head;
		head = head.next();
		size --;
		return output;
	}

	public boolean contains(T value) {
		Node<T> temp = head;
		while(temp != null) {
			if(temp.data().equals(value)) {
				return true;
			}
			temp = temp.next();
		}
		return false;
	}
	
	@Override
	public String toString() { 
		if(head == null) {
			return "";
		}
		StringBuilder output = new StringBuilder();
		Node<T> temp = head;
		while(temp != null) {
			output.append(temp + "\n");
			temp = temp.next();
		}
		if(output != null && output.length() > 0 && output.charAt(output.length() - 1) == '\n') {
			output.deleteCharAt(output.length() - 1);
		}
		return output.toString();
	}
}
