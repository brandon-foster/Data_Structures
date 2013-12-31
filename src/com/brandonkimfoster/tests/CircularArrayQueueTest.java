package com.brandonkimfoster.tests;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import com.brandonkimfoster.concrete.CircularArrayQueue;

public class CircularArrayQueueTest {

	CircularArrayQueue<String> queue;
	int initCapacity;

	@Before
	public void setUp() throws Exception {
		initCapacity = 5;
		queue = new CircularArrayQueue<String>(initCapacity);
	}

	/**
	 * Check that the queue has size 0 upon construction. Check that enqueue()
	 * increments the size by 1.
	 */
	@Test
	public void testEnqueueEmpty() {
		assertTrue(queue.size() == 0);
		queue.enqueue("a");
		assertTrue(queue.size() == 1);
		queue.enqueue("b");
		assertTrue(queue.size() == 2);
		queue.enqueue("c");
		assertTrue(queue.size() == 3);
		queue.enqueue("d");
		assertTrue(queue.size() == 4);
		queue.enqueue("e");
		assertTrue(queue.size() == 5);
	}

	/**
	 * Check that enqueueing is successful when the initial capacity is filled.
	 */
	@Test
	public void testEnqueueFullCapacity() {
		queue.enqueue("a");
		queue.enqueue("b");
		queue.enqueue("c");
		queue.enqueue("d");
		queue.enqueue("e");

		// Assert the initial capacity is filled.
		assertEquals(initCapacity, queue.size());

		// Assert enqueueing another item is successful.
		queue.enqueue("f");
		assertEquals(6, queue.size());
	}

	/**
	 * Check that dequeue() decrements the size by 1. Check that dequeue returns
	 * the item at the front of the queue. Check that dequeueing an empty queue
	 * throws a NoSuchElementException.
	 */
	@Test
	public void testDequeue() {
		// Enqueue an item
		queue.enqueue("a");
		assertEquals("a", queue.dequeue());
		assertEquals(0, queue.size());

		// Dequeueing after one dequeue has already been performed
		queue.enqueue("b");
		queue.enqueue("c");
		assertEquals("b", queue.dequeue());
		assertEquals("c", queue.dequeue());
		assertTrue(this.queue.isEmpty());
		assertEquals(0, queue.size());

		// Check that enqueueing beyond the initial capacity then dequeueing
		// each item is successful.
		queue.enqueue("a");
		queue.enqueue("b");
		queue.enqueue("c");
		queue.enqueue("d");
		queue.enqueue("e");
		queue.enqueue("f");
		// The queue has indeed been enqueued beyond its initial capacity.
		assertEquals((initCapacity + 1), queue.size());

		assertEquals("a", queue.dequeue());
		assertEquals("b", queue.dequeue());
		assertEquals("c", queue.dequeue());
		assertEquals("d", queue.dequeue());
		assertEquals("e", queue.dequeue());
		assertEquals("f", queue.dequeue());
		assertTrue(queue.isEmpty());

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
	 * Check that head() returns the item at the head of the queue, but does not
	 * modify the size of the queue
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
