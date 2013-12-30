package com.brandonkimfoster;

/**
 * A node stores a data item and a reference to the node that came before it.
 * If there is no node that precedes the reference contains a null value.
 * 
 * @author Brandon Foster
 */
public class Node<T>
{
	// The item the node holds
    private T data;
    
    // Reference to the previous node
    private Node<T> previous;


    // Constructor
    /**
     * Creates a new Node with the passed in data.
     *
     * @param data the data for the node
     */
    public Node(T data)
    {
        this.data = data;
        this.previous = null;
    }

    // ----------------------------------------------------------
    /**
     * Gets the data in the node.
     *
     * @return the data in the node
     */
    public T data()
    {
        return this.data;
    }

    // ----------------------------------------------------------
    /**
     * Gets the node that precedes this one in the sequence.
     *
     * @return the node that precedes this one in the sequence
     */
    public Node<T> previous()
    {
        return this.previous;
    }
    
    /**
     * Sets the reference to the previous node
     */
    public void setPrevious(Node<T> node)
    {
    	this.previous = node;
    }
    
}
