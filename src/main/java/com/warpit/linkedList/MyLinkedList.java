package com.warpit.linkedList;

import java.util.ArrayList;
import java.util.List;

public class MyLinkedList<T> {
	
	
	
	
	public Node<T> buildNode(T data){
		Node<T> node = new Node<T>(data, null);
		return node;
		
	}


    public String printLinkedList(Node<?> node) {
		StringBuffer resultBuffer= new StringBuffer();
		printRecursive(node,resultBuffer);
		return resultBuffer.toString()+"END";
	}


	private void printRecursive(Node<?> node,StringBuffer resultBuffer) {
		if(node.getData()!=null) resultBuffer.append(node.getData()+",");
		if(node.getNext()!=null) printRecursive(node.getNext(),resultBuffer);
		
		
 	}
	
	
	public int linkedListSize(Node<?> node) {
		
		if(node==null) return 0;
		else return 1 + linkedListSize(node.getNext());
		
				
	}
	
}
