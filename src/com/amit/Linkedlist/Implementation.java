package com.amit.Linkedlist;

public class Implementation {
	public Node head=null;
	private int size;
	

	public class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
			this.next=null;
			
		}
	}	
	
	// Add Node in first place
	public void addfirst(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	// Add Node in Last place 
	public void addLast(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
			
		}
	      currNode.next=newNode;
	}
	// Print List 
	public void printList() {
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+"-->");
			currNode=currNode.next;
		}
		System.out.println("null");
		
	}
	
	// Remove First
	public void removeFirst() {
		if(head==null) {
			System.out.println("List is Empty nothing to return");
		    return;
		}
		head=head.next;
         		
	}
	
	
	// Remove Last Node
	
	public void removeLast() {
		if(head== null) {
			System.out.println("list is  Emopty nothing to Delete ");
			return;
			
		}
		if(head.next==null) {
			head=null;
			return;
		}
		Node currNode=head;
		Node lastNode=head.next;
		while(lastNode.next!=null) {
			lastNode=lastNode.next;
			currNode=currNode.next;
			
		}
		currNode.next=null;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Implementation imp=new Implementation();
		imp.addfirst("a");
		imp.addfirst("b");
		imp.addfirst("c");
		imp.addfirst("d");
		imp.printList();
		imp.addLast("e");
		imp.addLast("f");
		imp.printList();
		imp.removeFirst();
		imp.printList();
		imp.removeLast();
		imp.printList();
		

	}

}
