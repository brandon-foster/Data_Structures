package com.brandonkimfoster.concrete;

import com.brandonkimfoster.Node;
import com.brandonkimfoster.api.Queue;

public class LinkedQueue<T> implements Queue<T> {

	private Node<T> front;
	private Node<T> rear;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void enqueue(T item) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T front() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
