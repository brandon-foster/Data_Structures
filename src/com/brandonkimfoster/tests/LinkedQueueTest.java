package com.brandonkimfoster.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import com.brandonkimfoster.concrete.LinkedQueue;

/**
 * Test cases for LinkedQueue.
 * 
 * @author Brandon Foster
 * @version 2013.12.30
 * 
 */
public class LinkedQueueTest {

	LinkedQueue<String> queue;

	/**
	 * Performs setup actions common to all test cases
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		queue = new LinkedQueue<String>();
	}

	/**
	 * Assert queue has size 0 upon construction. Assert that enqueue()
	 * increments the size by 1
	 */
	@Test
	public void testEnqueue() {
		assertTrue(queue.isEmpty());
		assertEquals(0, queue.size());
		queue.enqueue("a");
		assertEquals(1, queue.size());
		queue.enqueue("a");
		assertEquals(2, queue.size());
	}

	/**
	 * Assert that dequeue() decrements the size by 1 Assert dequeue returns the
	 * item at the front of the queue
	 */
	@Test
	public void testDequeue() {
		queue.enqueue("a");
		assertEquals("a", queue.dequeue());
		assertEquals(0, queue.size());

		queue.enqueue("b");
		queue.enqueue("c");
		assertEquals("b", queue.dequeue());
		assertEquals("c", queue.dequeue());
		assertTrue(this.queue.isEmpty());
		assertEquals(0, queue.size());

		// Assert NoSuchElementException is thrown when dequeueing an empty
		// queue
		Exception thrown = null;
		try {
			queue.dequeue();
		} catch (Exception exception) {
			thrown = exception;
		}

		assertNotNull(thrown);
		assertTrue(thrown instanceof NoSuchElementException);
	}

	/**
	 * Assert that head() returns the item at the head of the queue, but does
	 * not modify the size of the queue
	 */
	@Test
	public void testHead() {
		queue.enqueue("a");
		assertEquals("a", queue.head());
		assertEquals(1, queue.size());

		// Assert NoSuchElementException is thrown when calling head() on an
		// empty queue
		
		// empty the queue
		queue.dequeue();
		
		Exception thrown = null;
		try {
			queue.head();
		} catch (Exception exception) {
			thrown = exception;
		}
		
		assertNotNull(thrown);
		assertTrue(thrown instanceof NoSuchElementException);
	}

}
