package com.warpit.arraystack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.warpit.arraystack.ArrayStack;
import com.warpit.arraystack.StackIsEmptyException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class ArrayStackTest {

	ArrayStack<String> stack;
	
	@BeforeEach
	void setupBeforeEachTC() {
		stack = new ArrayStack<String>();
	}
	
	@Test
	void testArraySizeIsZero() {
		assertThat(stack.size()).isZero();
		assertThat(stack.isEmpty()).isTrue();
	}

	@Test
	void testPushAndPeek() {
		final String itemPushed ="a";
		stack.push(itemPushed);
		assertThat(stack.size()).as("stack size").isEqualTo(1);
		assertThat(stack.peek()).isEqualTo(itemPushed);
	}
	
	@Test
	@DisplayName("Single Item Pushed and then Popped")
	void testPushAndPeekAndPop() {
		final String itemPushed ="a";
		stack.push(itemPushed);
		assertThat(stack.size()).as("stack size").isEqualTo(1);
		assertThat(stack.pop()).isEqualTo(itemPushed);
		assertThat(stack.size()).as("stack size").isZero();
	}
	
	//edge testcase
	@Test
	void testPeekShouldThrowAnExceptionOnEmptyStack() throws Exception{
		assertThatExceptionOfType(StackIsEmptyException.class)
		         .isThrownBy(()-> stack.peek());
	}
}
