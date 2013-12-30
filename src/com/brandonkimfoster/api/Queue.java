package com.brandonkimfoster.api;

/**
 * An interface for the queue ADT.
 * 
 * @author Brandon Foster
 * @version 2013.12.30
 * 
 * @param <T>
 *            the type of elements stored in the stack
 */
public interface Queue<T> {
	
	/**
	 * Places an element at the end of the queue
	 * 
	 * @param item
	 * 			the element to place at the end of the queue
	 */
	public void enqueue(T item);
	
	/**
	 * Returns and removes the element at the front of the queue
	 */
	public T dequeue();
	
	/**
	 * Returns the element at the front of the queue without removing it from
	 * the queue.
	 * 
	 * @return the element at the front of the queue
	 */
	public T front();
	
	/**
	 * Returns the number of elements in the queue
	 * 
	 * @return the size of the queue
	 */
	public int size();
	
	/**
	 * Returns whether the queue is empty or not
	 * 
	 * @return true if the queues is empty, false otherwise
	 */
	public boolean isEmpty();
}
