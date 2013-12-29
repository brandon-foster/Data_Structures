package com.brandonkimfoster.tests;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

import com.brandonkimfoster.array_list_stack.ArrayListStack;

/**
 * Test cases for ArrayListStack.
 * 
 * @author Brandon Foster
 * @version 2013.08.03
 *
 */
public class ArrayListStackTest {

	ArrayListStack<String> stack;

	/**
	 * Performs setup actions common to all test cases
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {

		stack = new ArrayListStack<String>();
	}

	/**
	 * Check that the push() method adds an item on the top of the stack and
	 * throws a NullPointerException if a null item is pushed on the stack
	 */
	@Test
	public void testPush() {

		// pushes a valid item on the stack
		this.stack.push("string1");

		assertEquals(1, this.stack.size());
		assertEquals("string1", this.stack.peek());

		this.stack.push("string2");

		assertEquals(2, this.stack.size());
		assertEquals("string2", this.stack.peek());

		// pushes a null item on the stack
		String nullItem = null;

		Exception thrown = null;
		try {
			this.stack.push(nullItem);
		} catch (Exception exception) {
			thrown = exception;
		}

		assertNotNull(thrown);
		assertTrue(thrown instanceof NullPointerException);
	}

	/**
	 * Checks that the pop() method removes the item on the top of the stack and
	 * throws an EmptyStackException if pop() is called on an empty stack
	 */
	@Test
	public void testPop() {

		int numItems = 5;

		// pushes five items on the stack
		for (int i = 0; i < numItems; i++) {
			this.stack.push("#" + i);
		}

		// pops all items off the stack
		for (int i = 0; i < numItems; i++) {
			this.stack.pop();
			int expectedStackSize = numItems - (i + 1);
			assertEquals(expectedStackSize, this.stack.size());
		}

		// pops an empty stack

		Exception thrown = null;
		try {
			this.stack.pop();
		} catch (Exception exception) {
			thrown = exception;
		}
		assertNotNull(thrown);
		assertTrue(thrown instanceof EmptyStackException);
	}

}
