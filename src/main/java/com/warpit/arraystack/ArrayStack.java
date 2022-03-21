package com.warpit.arraystack;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

import groovyjarjarantlr4.v4.parse.ANTLRParser.throwsSpec_return;

public class ArrayStack<T> {

	private T[] itemsArr;
	private int top=0;
	
	@SuppressWarnings("unchecked")
	public ArrayStack() {
		super();
		itemsArr = (T[])new Object[16];
	}
	
	public int size() {
		return top;
	}
	
	public void push(T item) {
		itemsArr[top]= item;
		top++;
		
	}
	
	public T peek() {
		if(isEmpty()) throw new StackIsEmptyException();
		return itemsArr[top-1];
	}

	public T pop() {
		T itemOnTop = peek();
		top--;
		itemsArr[top]=null;
		return itemOnTop;
	}

	

	  public boolean isEmpty() { return size() == 0; }

}
