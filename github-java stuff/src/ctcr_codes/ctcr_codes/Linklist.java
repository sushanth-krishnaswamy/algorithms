package ctcr_codes;

class Node{
	Node next;
	Object data;
	
	public Node(Object dataValue){
		next=null;
		data = dataValue;
	}

	public Node(Object dataValue, Node nextValue){
		next = nextValue;
		data = dataValue;
	}
	
	public Object getData(){
		return data;
	}
	
	public void setData(Object dataValue){
		data = dataValue;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node nextValue){
		next = nextValue;
	}
	
}

class ListOperations{
	private static int counter;
	private Node head;
	
	public ListOperations(){
		
	}
	
	public void add(Object data){
		if(head==null){
			head = new Node(data);
		}
		
		Node tempNode = new Node(data);
		Node currentNode = head;
		
		if(currentNode!=null){
			while(currentNode.getNext()!=null){
				currentNode=currentNode.getNext();
				
			}
			currentNode.setNext(tempNode);
		}
		incrementCounter();
	}
	
	private static int getCounter(){
		return counter;
	}
	
	private void incrementCounter(){
		counter++;
	}
	
	private void decrementCounter(){
		counter--;
	}
	
	
	
}

public class Linklist {

}
