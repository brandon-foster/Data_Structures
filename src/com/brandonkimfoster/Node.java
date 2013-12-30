package com.brandonkimfoster;

/**
 * A node wraps a data item and a reference (called a "link" here) to another
 * node. If there is no other node to be linked to, the reference is null.
 * 
 * @author Brandon Foster
 */
public class Node<T> {
	// The item the node holds
	private T data;

	// Reference to another node
	private Node<T> link;

	// Constructor
	/**
	 * Creates a new Node with the passed in data
	 * 
	 * @param data
	 *            the data for the node
	 */
	public Node(T data) {
		this.data = data;
		this.link = null;
	}

	/**
	 * Gets the data in the node.
	 * 
	 * @return the data in the node
	 */
	public T data() {
		return this.data;
	}

	/**
	 * Gets the node that this node links to
	 * 
	 * @return the node that is linked to by this node
	 */
	public Node<T> getLink() {
		return this.link;
	}

	/**
	 * Sets the node's reference to link to the specified node
	 */
	public void setLink(Node<T> node) {
		this.link = node;
	}

}
