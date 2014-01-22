package com.brandonkimfoster.concrete;

import com.brandonkimfoster.api.List;

/**
 * A concrete implementation of the List interface found in
 * com.brandonkimfoster.api that uses an underlying array to store items.
 * 
 * This list is unbounded, creating more space for newly added items when
 * needed.
 * 
 * @author Brandon Foster
 * @version 2014.1.21
 * 
 * @param <T>
 *            the type of elements stored in the queue
 */
public class ArrayList<T> implements List<T> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean insert(T item) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean append(T item) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void moveToStart() {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void moveToEnd() {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void prev() {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void next() {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int currPos() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveToPos(int pos) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isAtEnd() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T getValule() {
		// TODO Auto-generated method stub
		return null;
	}

}
