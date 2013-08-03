package com.brandonkimfoster.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.brandonkimfoster.concrete.ArrayListStack;

public class ArrayListStackTest {
	
	ArrayListStack<String> stack;

	/**
	 * Perform setup actions common to all test cases.
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		stack = new ArrayListStack<String>();
	}

	/**
	 * Check that the push() method adds an item at the top of the stack.
	 */
	@Test
	public void testPush() {
		
		// pushes a valid item on the stack
		stack.push("string1");
		
		assertEquals(1, stack.size());
		assertEquals("string1", stack.peek());
		
		stack.push("string2");
		
		assertEquals(2, stack.size());
		assertEquals("string2", stack.peek());
		
		// pushes a null item on the stack
		String nullItem = null;
		
		Exception thrown = null;
		try {
			stack.push(nullItem);
		}
		catch (Exception exception) {
			thrown = exception;
		}
		
		assertNotNull(thrown);
		assertTrue(thrown instanceof NullPointerException);
	}

}
