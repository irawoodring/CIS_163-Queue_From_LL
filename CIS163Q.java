public class CIS163Q {

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
