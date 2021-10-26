
public class Node<T> {
	
	private T data;
	
	private Node<T> next;
	
	public Node (T d) {
		this(d, null);
	}

	public Node(T d, Node<T> n) {
		data = d;
		next = n;
	}
	
	public T data() {
		return data;
	}
	
	public Node<T> next(){
		return next;
	}
	
	public void setData(T d) {
		data = d; 
	}
	
	public void setNext(Node<T> n) {
		next = n;
	}
	
	@Override
	public String toString() {
		return data.toString();
	}
}
