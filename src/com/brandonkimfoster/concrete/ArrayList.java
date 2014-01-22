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

	private T[] array; // the underlying array to hold the items
	private static final int defaultSize = 10; // the default value used in the
												// no-argument constructor
	private int maxSize; // the capacity of the list
	private int listSize; // the number of items in the list
	private int current; // the index of the current item in the list

	/**
	 * Create an ArrayList with the specified size for the maximum size.
	 * 
	 * Suppress "unchecked" warnings because it is certain the underlying array
	 * will only hold type T items
	 * 
	 * @param capacity
	 *            the number of elements the list can hold
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int size) {

		maxSize = size;
		listSize = current = 0;
		array = (T[]) new Object[size];
	}

	/**
	 * No-argument constructor with the default size as the capacity.
	 */
	public ArrayList() {

		this(defaultSize);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void clear() {

		// clearing the list is the same as setting the size and current
		// position to 0
		listSize = current = 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean insert(T item) {
		
		// ensure there is enough room to insert an item
		if (listSize < maxSize) {
			// shift the elements after the current item back one position to
			// make room for the item to be inserted
			for (int i = listSize; i > current; i--) {
				array[i] = array[i - 1];
			}
			array[current] = item; // insert the item at the position "current"
			listSize++; // increment the size of the list
			return true;
		}
		// return false if the list does not have enough room to insert an item
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean append(T item) {
		
		// ensure there is enough room to insert an item
		if (listSize < maxSize) {
			array[listSize] = item; // set the current position to the item
			listSize++; // increment the size of the list
			return true;
		}
		// return false if the list does not have enough room to insert an item		
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
