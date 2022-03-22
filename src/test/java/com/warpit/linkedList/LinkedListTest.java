package com.warpit.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class LinkedListTest {

	MyLinkedList<Integer> myLinkedList ;
	
	@BeforeEach
	void setUp() {
		myLinkedList = new MyLinkedList<Integer>();
	}
	
	@Test
	void linkedListWithZeroNode() {
		assertThat(myLinkedList.linkedListSize(null)).isZero();
	}

	
	@Test
	void linkedListWithOneNode() {
		Node<Integer> headNode=myLinkedList.buildNode(8);
		assertThat(myLinkedList.linkedListSize(headNode)).isOne();
	}
	
	@Test
	void linkedListWithTwoNode() {
		Node<Integer> headNode=myLinkedList.buildNode(8);
		headNode.setNext(myLinkedList.buildNode(10));
		assertThat(myLinkedList.linkedListSize(headNode)).isEqualTo(2);
	}
	
	@Test
	void linkedListWithTwoNodeAndPrint() {
		Node<Integer> headNode=myLinkedList.buildNode(8);
		headNode.setNext(myLinkedList.buildNode(10));
		assertThat(myLinkedList.linkedListSize(headNode)).isEqualTo(2);
		assertThat(myLinkedList.printLinkedList(headNode)).isEqualTo("8,10,END");
	}
	
	@Test
	void linkedListWith5NodeAndPrint() {
		Node<Integer> headNode=myLinkedList.buildNode(8);
		Node<Integer> nodeA=myLinkedList.buildNode(3);
		Node<Integer> nodeB=myLinkedList.buildNode(18);
		Node<Integer> nodeC=myLinkedList.buildNode(12);
		Node<Integer> nodeD=myLinkedList.buildNode(11);
		headNode.setNext(nodeA);
		nodeA.setNext(nodeB);
		nodeB.setNext(nodeC);
		nodeC.setNext(nodeD);

		assertThat(myLinkedList.linkedListSize(headNode)).isEqualTo(5);
		assertThat(myLinkedList.printLinkedList(headNode)).isEqualTo("8,3,18,12,11,END");
	}
	
}
