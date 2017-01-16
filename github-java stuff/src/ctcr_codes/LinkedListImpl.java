package ctcr_codes;

class Node{
	Node next;
	Object data;
	
	public Node(Object dataValue){
		next=null;
		data = dataValue;
	}
	
	public Node(Object dataValue, Node nextValue){
		next=nextValue;
		data=dataValue;		
	}
	
	public Object getData(){
		return data;
	}
	public void setData(Object dataValue){
		data= dataValue;
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
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(tempNode);
		}
		incrementCounter();
	}
	
	private static int getCounter(){
		return counter;
	}
	private static void incrementCounter(){
		counter++;
	}
	private static void decrementCounter(){
		counter--;
	}
	
	public void add(Object data, int index){
		Node tempNode = new Node(data);
		Node currentNode = head;
		
		if(currentNode!=null){
			for(int i=0; i< index && currentNode.getNext()!= null; i++){
				currentNode = currentNode.getNext();
			}
		}
		tempNode.setNext(currentNode.getNext());
		currentNode.setNext(tempNode);
		
		incrementCounter();
	}
	
	public Object get(int index){
		if(index<0){
			return null;
		}
		Node currentNode = null;
		if(head!=null){
			currentNode=head.getNext();
			for(int i=0;i<index;i++){
				if(currentNode.getNext() == null){
					return null;
				}
				 currentNode = currentNode.getNext();				 
			}
			return currentNode.getData();
		}
		return currentNode;
		
	}
	
	public boolean remove(int index){
		if(index<1|| index>size()){
			return false;
		}
		Node currentNode = head;
		if(head!= null){
			for(int i=0;i<index;i++){
				if(currentNode.getNext() == null){
					return false;
				}
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(currentNode.getNext().getNext());
			
			decrementCounter();
			return true;
		}
		return false;
	}
	
	public int size(){
		return getCounter();
	}
	
	public String toString(){
		String output="";
		if(head!=null){
			Node currenNode = head.getNext();
			while(currenNode!=null){
				output= output+"["+ currenNode.getData().toString()+"]";
				currenNode = currenNode.getNext();
			}
		}
		return output;
	}
	
}


public class LinkedListImpl {
public static ListOperations list1;
	public static void main(String[] args){
		
		list1 = new ListOperations();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		System.out.println("the list is : "+ list1);
		
		
	}
}
