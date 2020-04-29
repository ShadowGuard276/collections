package sets;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

	

	public class queueRunner {
	public static void main(String[] args) {
		Queue <String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Dog","Donkey","Cow","Cat","Monkey","milk"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());	
		System.out.println(queue.poll());	
		System.out.println(queue.poll());	
		System.out.println(queue.poll());	
		System.out.println(queue.poll());	
		System.out.println(queue.poll());
	}

}
