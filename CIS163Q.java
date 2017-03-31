public class CIS163Q<T> {

	private Node<T> first;
	private Node<T> last;
	private int size;
	
	Public CIS163Q(){
		


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
