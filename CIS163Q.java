public class CIS163Q<T> {

	private Node<T> first;
	private Node<T> last;
	private int size;
	
	Public CIS163Q(){
		


	}
	
	/**
	 * Adds node n to the end of the queue
	 * 
	 * @param Node n
	 */
	public void addToEnd(Node n){
		//Makes n come after tail
		tail.setNextNode(n); 
		
		//links n's prev. node tail
		n.setPreviousNode(tail);
		
		//updates tail
		this.tail = n;
		
		//increments size
		size++;
	}

	public Node dequeue(){
		Node temp, tempHead;
		temp = head.getNextNode();
		temp.setPerviousNode(null);
		head.setNextNode(null);
		
		tempHead = head;
		head = temp;
		
		
		return tempHead;
		
	}

}
