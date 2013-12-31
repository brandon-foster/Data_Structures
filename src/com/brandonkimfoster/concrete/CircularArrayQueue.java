package com.brandonkimfoster.concrete;

import java.util.NoSuchElementException;

import com.brandonkimfoster.api.Queue;

/**
 * A concrete implementation of the Queue interface found in
 * com.brandonkimfoster.api that uses an underlying array to store items.
 * 
 * This queue is unbounded, creating more space for newly added items when
 * needed.
 * 
 * @author Brandon Foster
 * @version 2013.12.30
 * 
 * @param <T>
 *            the type of elements stored in the queue
 */
public class CircularArrayQueue<T> implements Queue<T> {

	private T[] array;
	private int size = 0; // size of the queue
	private int capacity = 0; // capacity of the queue (size of the array)
	private int head = 0; // index of the item at the front of the queue
	private int tail = 0; // index of the next item to be placed onto the queue

	/**
	 * Constructor
	 * 
	 * Suppress "unchecked" warnings because it is certain the underlying array
	 * will only hold type T items
	 * 
	 * @param capacity
	 *            the number of elements the queue can hold
	 */
	@SuppressWarnings("unchecked")
	public CircularArrayQueue(int capacity) {
		this.array = (T[]) new Object[capacity];
		this.capacity = capacity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void enqueue(T item) {

		// Create more space if the queue is full
		if (this.size() == this.capacity) {
			this.expandCapacity();
		}

		// place the item at index <tail>
		array[this.tail] = item;
		
		// increment tail in a circular fashion
		// tail will be the index of the enqueued item
		this.tail = (this.tail + 1) % this.capacity;

		// increment the size of the queue
		size++;
	}

	/**
	 * Create a new array twice the size of the original underlying array and
	 * update the array field to point to the new, larger array
	 */
	private void expandCapacity() {
		// Suppress "unchecked" warnings because it is certain newArray will
		// hold
		// type T items
		@SuppressWarnings("unchecked")
		T[] newArray = (T[]) new Object[this.capacity * 2];

		for (int i = 0; i < this.size; i++) {
			newArray[i] = this.array[this.head];
			this.head = (this.head + 1) % this.capacity;
		}

		this.head = 0;
		this.tail = this.size;
		this.capacity = newArray.length;
		this.array = newArray;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T dequeue() throws NoSuchElementException {
		if (this.isEmpty()) {
			throw new NoSuchElementException();
		}

		// store the item being dequeued
		T item = array[this.head];

		// clear the item at index <head>
		array[this.head] = null;

		// increment head to be the index of the next item (the item after the
		// item being dequeued)
		this.head = (this.head + 1) % this.capacity;

		// decrement the size of the queue
		this.size--;

		return item;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T head() {
		if (this.isEmpty()) {
			throw new NoSuchElementException();
		}

		return this.array[this.head];
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int size() {
		return this.size;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEmpty() {
		return (this.size == 0);
	}

}
