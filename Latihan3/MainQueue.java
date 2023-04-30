package Praktikum.Latihan3;
import java.util.LinkedList;
import java.util.Queue;
public class MainQueue {

	public void queueExample() {
		Queue queue = new LinkedList();
		queue.add("java");
		queue.add("DotNet");
		System.out.println(queue);
		queue.offer("php");
		queue.offer("HTML");
		System.out.println(queue);
		System.out.println("remove: " + queue.remove());
		System.out.println(queue);
		System.out.println("element: " + queue.element());
		System.out.println(queue);
		System.out.println("poll: " + queue.poll());
		System.out.println(queue);
		System.out.println("peek: " + queue.peek());
		System.out.println(queue);
	}
	
	public static void main(String[] args) {
		new MainQueue().queueExample();
	}

}
