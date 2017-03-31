public class CIS163Q<T> {

	private Node<T> first;
	private Node<T> last;
	private int size;
	
	Public CIS163Q(){
		


	}

	public int size(Node<t> first)
	{
		int temp = 0;
		Node<t> cur = first;

		while (cur.getNextNode().getThisElement() != null)
		{
			temp++;
			cur = cur.getNextNode();
		}

		return temp;
	}


}
