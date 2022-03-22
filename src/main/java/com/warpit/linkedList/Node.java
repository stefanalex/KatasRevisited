package com.warpit.linkedList;

public class Node<D> {
	
	private D data;
	private Node<?> next;
	
	
	public Node(D data, Node<?> next) {
		super();
		this.data = data;
		this.next = next;
	}


	public D getData() {
		return data;
	}


	public void setData(D data) {
		this.data = data;
	}


	public Node<?> getNext() {
		return next;
	}


	public void setNext(Node<?> next) {
		this.next = next;
	}

     
	

}
