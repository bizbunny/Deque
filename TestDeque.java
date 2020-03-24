package assignment6;
import algs4.StdIn;
import algs4.StdOut;
import java.util.Queue;
import java.util.Random;
public class TestDeque {

	public static void main(String[] args) {
		Deque<Object> testing = new Deque<Object>();
		StdOut.println("deque size: "+testing.size());
		testing.enqueueBack(111);
		testing.enqueueFront(8);
		testing.enqueueBack(833);
		testing.enqueueFront(45);
		testing.enqueueBack(12);
		testing.enqueueFront(92);
		testing.enqueueBack(6);
		testing.enqueueFront(53);
		testing.enqueueBack(37);
		testing.enqueueFront(119);
		
		StdOut.println("deque size updated: "+testing.size());
		
		for(int i = 0; i<10;i++) {
			Object testD = testing.dequeue(); 
			StdOut.println("dequeued item: "+testD);
		}
		StdOut.println("deque size updated after dequeue: "+testing.size());
	}
}
