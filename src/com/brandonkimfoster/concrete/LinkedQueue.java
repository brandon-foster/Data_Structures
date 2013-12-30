package com.brandonkimfoster.concrete;

import com.brandonkimfoster.Node;
import com.brandonkimfoster.api.Queue;

/**
 * A concrete implementation of the Queue interface in com.brandonkimfoster.api
 * that uses an underlying chain of linked nodes.
 * 
 * @author Brandon Foster
 * @version 2013.12.29
 * 
 * @param <T>
 *            the type of elements stored in the stack
 */
public class LinkedQueue<T> implements Queue<T> {

	private Node<T> front;
	private Node<T> rear;

	/**
	 * Constructor
	 */
	public LinkedQueue() {
		this.front = null;
		this.rear = null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void enqueue(T item) {
		Node<T> newNode = new Node<T>(item);
		// when queue is empty to begin with, rear is null
		if (this.rear == null) {
			// front and rear point to the same node when there is only one item
			// in the queue
			this.front = newNode;
		} else {
			// make the node at rear point to the newNode
			this.rear.setLink(newNode);
		}
		// update rear to point to the newly added newNode
		this.rear = newNode;
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
