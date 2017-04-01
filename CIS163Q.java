public class CIS163Q<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

	public CIS163Q(){

		size = 0;

	}

	/**
	 * We want people to be able to add an
	 * element to the list, not a node.  So
	 * we will create this method for them to use
	 * and call our internal enQ on a new
	 * node we create.  This is ok because
	 * we can overload methods.
	 * @param T an element
	 */
	public void enQ(T t){
		Node n = new Node();
		n.setThisElement(t);
		enQ(n);
	}

	/**
	 * Adds node n to the end of the queue
	 * 
	 * @param Node n
	 */
	private void enQ(Node n){
		//Makes n come after tail
		tail.setNextNode(n); 

		//links n's prev. node tail
		n.setPreviousNode(tail);

		//updates tail
		this.tail = n;

		//increments size
		size++;
	}

	public int size(Node<t> first)
	{
		return this.size;
	}

}
