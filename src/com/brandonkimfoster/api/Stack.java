package com.brandonkimfoster.api;

public interface Stack<T> {

	/**
	 * Pushes a new item on the stack.
	 * 
	 * @param the item to push on the top of the stack
	 */
	public void push(T item);
	
	/**
	 * Removes and returns the next item.
	 * 
	 * @return the item on the top of the stack
	 */
	public T pop();
	
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
