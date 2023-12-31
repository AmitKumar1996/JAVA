package com.amit.Linkedlist;

import java.util.LinkedList;

//import java.util.linkedlist;
public class SyntaxLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("is");
		list.add("a");
		list.addFirst("This");
		list.addLast("List");
		System.out.println(list);
		list.add(3, "Linked");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);

	}

}
