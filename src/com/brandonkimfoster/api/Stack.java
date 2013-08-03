package com.brandonkimfoster.api;

import java.util.EmptyStackException;

/**
 * An interface for a stack data structure.
 * 
 * @author Brandon Foster
 * @version 2012.08.03
 * 
 * @param <T>
 *            the type of elements stored in the stack
 */
public interface Stack<T> {

	/**
	 * Pushes a new item on the stack.
	 * 
	 * @param the
	 *            item to push on the top of the stack
	 */
	public void push(T item);

	/**
	 * Removes and returns the next item, if the stack is not null. If the
	 * stack is null, it throws an exception.
	 * 
	 * @return the item on the top of the stack
	 */
	public T pop() throws EmptyStackException;

	/**
	 * Returns the next item, but does not remove it.
	 * 
	 * @return the item on the top of the stack
	 */
	public T peek();

	/**
	 * Returns the size of the stack.
	 * 
	 * @return the number of items in the stack
	 */
	public int size();
}
