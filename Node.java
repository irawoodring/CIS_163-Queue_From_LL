

public class Node<T>{
	
	/** Instance variables **/

	/* Generic instance variable for current element */
	private T thisElement;
	
	
	/* Node variable for next node */
	private Node nextNode;
	
	
	/* Node variable for previous node */
	private Node previousNode;
	
	
	/* Getter method that returns current element 
	 * @return T
	 * */
	public T getThisElement() {
		return thisElement;
	}
	
	
	/* Setter method that sets the current element 
	 * @param T thisElement
	 */
	public void setThisElement(T thisElement) {
		this.thisElement = thisElement;
	}
	
	
	/* Getter method that returns next node 
	 * @return Node
	 * */
	public Node getNextNode() {
		return nextNode;
	}
	
	
	/* Setter method that sets the next node 
	 * @param Node nextNode
	 */
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
	/* Getter method that returns previous node 
	 * @return Node
	 * */
	public Node getPreviousNode() {
		return previousNode;
	}
	
	
	/* Setter method that sets the previous node 
	 * @param Node previousNode
	 */
	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}
	
	
	
}


