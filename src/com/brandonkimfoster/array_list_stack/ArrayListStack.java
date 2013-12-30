package com.brandonkimfoster.array_list_stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

import com.brandonkimfoster.api.Stack;

/**
 * A concrete implementation of the Stack interface in com.brandonkimfoster.api
 * that uses the adapter pattern, having an ArrayList store its items.
 * 
 * @author Brandon Foster
 * @version 2013.08.03
 * 
 * @param <T>
 *            the type of elements stored in the stack
 */
public class ArrayListStack<T> implements Stack<T> {


	private ArrayList<T> list;

	/**
	 * Constructor
	 */
	public ArrayListStack() {

		list = new ArrayList<T>();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void push(T item) {

		if (item == null) {
			throw new NullPointerException();
		}

		this.list.add(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T pop() throws EmptyStackException {

		if (this.isEmpty()) {
			throw new EmptyStackException();
		}

		// Gets the item at the top of the stack.
		int topIndex = this.list.size() - 1;
		T item = this.list.get(topIndex);

		// Removes the item at the top of the stack.
		this.list.remove(topIndex);
		return item;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T peek() {

		int topIndex = this.list.size() - 1;
		return this.list.get(topIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int size() {

		return this.list.size();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEmpty() {
				
		if (this.list.size() == 0) {
			return true;
		}
		return false;
	}

}
