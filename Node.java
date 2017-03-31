

public class Node<T>{

	private T thisElement;
	private Node nextNode;
	private Node previousNode;
	
	public T getThisElement() {
		return thisElement;
	}
	public void setThisElement(T thisElement) {
		this.thisElement = thisElement;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Node getPreviousNode() {
		return previousNode;
	}
	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}
	
	
	
}


