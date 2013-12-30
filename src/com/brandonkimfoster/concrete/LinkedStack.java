package com.brandonkimfoster.concrete;

import java.util.EmptyStackException;

import com.brandonkimfoster.api.Stack;
import com.brandonkimfoster.Node;

/**
 * A concrete implementation of the Stack interface in com.brandonkimfoster.api
 * using and underlying chain of linked nodes.
 * 
 * @author Brandon Foster
 * @version 2013.12.29
 * 
 * @param <T>
 *            the type of elements stored in the stack
 */
public class LinkedStack<T> implements Stack<T> {

	private Node<T> top;
	private int size;

	/**
	 * Constructor
	 */
	public LinkedStack() {
		this.top = null;
		this.size = 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void push(T item) {
		if (item == null) {
			throw new NullPointerException();
		}
		Node<T> newNode = new Node<T>(item);
		newNode.setLink(this.top);
		this.top = newNode;
		this.size++;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T pop() throws EmptyStackException {
		if (this.isEmpty()) {
			throw new EmptyStackException();
		}
		T theData = top.data();
		this.top = top.getLink();
		this.size--;
		return theData;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T peek() {

		return this.top.data();
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
		return (this.size == 0) ? true : false;
	}
}
