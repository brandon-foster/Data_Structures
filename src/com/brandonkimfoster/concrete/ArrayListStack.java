package com.brandonkimfoster.concrete;

import java.util.ArrayList;
import java.util.EmptyStackException;

import com.brandonkimfoster.api.Stack;

/**
 * A concrete implementation of the Stack interface in com.brandonkimfoster.api
 * that uses the adapter pattern, having an ArrayList store its items.
 * 
 * @author Brandon Foster
 * @version 2012.08.03
 * 
 * @param <T>
 *            the type of elements stored in the stack
 */
public class ArrayListStack<T> implements Stack<T> {

	/**
	 * Constructor
	 */
	private ArrayList<T> list;
	
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
		
		if (this.list.size() == 0) {
			throw new EmptyStackException();
		}
		
		// Gets the item at the top of the stack.
		int index = this.list.size() - 1;
		T item = this.list.get(index);
		
		// Removes the item at the top of the stack.
		this.list.remove(index);
		return item;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int size() {
		
		return this.list.size();
	}

}
