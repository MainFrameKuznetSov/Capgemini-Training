package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Object> pq=new ArrayDeque<>();
		pq.offerFirst(11);
		pq.offer(1);
		pq.offer(94);
		pq.offer(23);
		pq.offer(81);
		pq.offer(14);
		pq.offer(14);
		pq.offerFirst(113);
		pq.offer(-11);
		pq.offer(190);
		pq.offer(924);
		pq.offer(713);
		pq.offer(null);
		System.out.println(pq);
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
			System.out.println(pq);
		}
	}

}
