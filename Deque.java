package assignment6;

import algs4.StdIn;
import algs4.StdOut;
//import week4inclass.LinkedListQueue.Node;
import algs4.*;

//import java.util.LinkedList; // Do Not import linkedList class. * *  * * ***
// write Node class somewhere in here * *  * * ***
import java.util.Queue;

public class Deque<T> {
	private Node first;
	private Node last;
	private int count; //helps with size
	
	private class Node {
		public T data;
		public Node next;
		
		public Node() {
			data = null;
			next = null;
		}
	}
	
	public Deque() {
		first = null;
		last = null;
		count = 0; //Initialize count
	}
	public void enqueueFront(T item) {
		Node newNode = new Node();
		newNode.data = item;
		if(first==null) {
			first = newNode;
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
		count++; //Increases size
	}
	
	public T dequeue() {
		T temp = first.data;
		first = first.next;
		if (first == null) {
			last = null;
		}
		count--; //Decreases size
		return temp;
	}
	public void enqueueBack(T item) {
		Node newNode = new Node();
		newNode.data = item;
		if (first == null) {// check empty
			first = newNode;
			last = newNode;
		}
		else {
			last.next = newNode;
			last = newNode;
		}
		
		count++; //Increases size
	}
	public int size() {
		return count;
	}	
	public boolean isEmpty() {
		return first == null;
	}
}
