

import java.util.*;

public class VectorClass {

	public static void main(String[] args) throws InterruptedException {

		int size = 1000000;

		List<Integer> arrayList = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			arrayList.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken to add " + size + " values : " + (end - start));

		List<Integer> vectorList = new Vector<>();
		start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			vectorList.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken to add " + size + " values in vector : " + (end - start));

		// Multi threaded approach
		List<Integer> multiThreadedList = Collections.synchronizedList(new ArrayList<>());

		start = System.currentTimeMillis();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadedList.add(i);
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadedList.add(i);
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		end = System.currentTimeMillis();

		System.out.println(multiThreadedList.size());
		System.out.println("Time taken in multithread to add " + size + " values : " + (end - start));

		start = System.currentTimeMillis();

		Thread t3 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadedList.add(i);
			}
		});

		Thread t4 = new Thread(() -> {
			for (int i = 0; i < size; i++) {
				multiThreadedList.add(i);
			}
		});

		t3.start();
		t4.start();
		t3.join();
		t4.join();

		end = System.currentTimeMillis();

		System.out.println(multiThreadedList.size());
		System.out.println("Time taken in multithread to add " + size + " values : " + (end - start));

	}

}