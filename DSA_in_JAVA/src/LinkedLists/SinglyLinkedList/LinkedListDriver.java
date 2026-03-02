package LinkedLists.SinglyLinkedList;

class Node
{
	
	public int data;
	Node next;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	
}

class LinkedList
{
	
	Node head;
	
	public LinkedList()
	{
		this.head=null;
	}
	
	public boolean isEmpty()
	{
		return (head==null);
	}
	
	public void insertAtStart(int data)
	{
		Node newNode=new Node(data);
		if(isEmpty())
		{
			head=newNode;
			return ;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public void insertAtEnd(int data)
	{
		Node newNode=new Node(data);
		if(isEmpty())
		{
			head=newNode;
			return ;
		}
		Node currNode=head;
		while(currNode.next!=null)
			currNode=currNode.next;
		currNode.next=newNode;
	}
	
	public void display()
	{
		Node currNode=head;
		while(currNode!=null)
		{
			System.out.print(currNode.data+"--->");
			currNode=currNode.next;
		}
		System.out.println("null");
	}
	
	public void deleteFromStart()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
			return ;
		}
		head=head.next;
	}
	
	public void deleteFromEnd()
	{
		if(isEmpty())
		{
			System.out.println("List is empty.");
			return ;
		}
		Node currNode=head;
		if(currNode.next==null)//If linked list size is 1
		{
			head=null;
			return ;
		}
		while(currNode.next.next!=null)
			currNode=currNode.next;
		currNode.next=null;
	}
	
	public void deleteFirstElementWithValue(int element)
	{
		if(isEmpty())
		{
			System.out.println("Empty List");
			return ;
		}
		if(head.data==element)//First element itself has to be deleted
			deleteFromStart();
		Node currNode=head;
		while(currNode.next!=null && currNode.next.data!=element)//Normal Case
			currNode=currNode.next;
		if(currNode.next==null)//Element not missing(reached last node and still did not find the element)
		{
			System.out.println("Element is not present in list.");
			return ;
		}
		currNode.next=currNode.next.next;
	}
	
	public void deleteAllElementwithValue(int element)
	{
		if(isEmpty())
		{
			System.out.println("Empty List");
			return ;
		}
		while(head!=null && head.data==element)//Suppose the first element itself has to be deleted
			deleteFromStart();
		if(isEmpty())
			return ;
		Node currNode=head;
		while(currNode.next!=null)//
		{
			if(currNode.next.data==element)//
			{
				currNode.next=currNode.next.next;
				continue;
			}
			else
				currNode=currNode.next;
		}
	}
	
}

public class LinkedListDriver 
{
	
	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		list.insertAtStart(1);
		list.insertAtStart(1);
		list.insertAtStart(1);
		list.insertAtStart(1);
		list.insertAtStart(1);
		list.insertAtStart(1);
		list.display();
		list.deleteAllElementwithValue(1);
		list.display();
	}
	
}
