package com.brandonkimfoster.api;

/**
 * An interface for the list ADT.
 * 
 * @author Brandon Foster
 * @version 2014.01.21
 * 
 * @param <T>
 *            the type of elements stored in the list
 */
public interface List<T> {

	/**
	 * remove contents from the list, so it will be empty
	 */
	void clear();

	/**
	 * 
	 * Insert the item at the current position of the list. The programmer is
	 * responsible for not exceeding the list's capacity.
	 * 
	 * @param item
	 * @return true if the insertion was successful, false otherwise
	 */
	boolean insert(T item);

	/**
	 * Append the item at the current position of the list. The programmer is
	 * responsible for not exceeding the list's capacity.
	 * 
	 * @param item
	 * @return true if the insertion was successful, false otherwise
	 */
	boolean append(T item);

	/**
	 * Remove and return the current element from the list.
	 *
	 * @return the current element if there is one, null otherwise
	 */
	T remove();

	/**
	 * Set the current position to the start of the list.
	 */
	void moveToStart();

	/**
	 * Set the current position to the end of the list.
	 */
	void moveToEnd();

	/**
	 * Move the current position to the item before the current item in the
	 * list. Does not move the current position if it is at the beginning of the
	 * list.
	 */
	void prev();

	/**
	 * Move the current position to the item after the current item of the list.
	 * Does not move the current position if it is at the end of the list.
	 */
	void next();

	/**
	 * Return the number of elements in the list.
	 * 
	 * @return the number of elements in the list.
	 */
	int length();

	/**
	 * Return the position of the current element of the list.
	 * 
	 * @return the position of the current element of the list
	 */
	int currPos();

	/**
	 * Set the current position of the list to the specified value.
	 * 
	 * @param pos
	 *            The new current position of the list
	 * @return true if the operation is successful
	 */
	boolean moveToPos(int pos);

	/**
	 * Return true if the current position is at the end of the list, false
	 * otherwise.
	 * 
	 * @return true if the current position is at the end of the list, false
	 *         otherwise
	 */
	boolean isAtEnd();

	/**
	 * Return the current element.
	 * 
	 * @return the current element
	 */
	T getValule();
}
