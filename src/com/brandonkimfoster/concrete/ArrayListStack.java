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

	@Override
	public void push(T item) {
		// TODO Auto-generated method stub

	}

	@Override
	public T pop() throws EmptyStackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
