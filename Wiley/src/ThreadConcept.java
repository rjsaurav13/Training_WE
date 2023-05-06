class Demo implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadConcept {
	public static void main(String[] args) {
		ThreadGroup tgparent= new ThreadGroup("parent group");
		ThreadGroup tgchild= new ThreadGroup(tgparent, "child");
		Thread t1 = new Thread(tgparent,new Demo(),"First");
		Thread t2 = new Thread(tgparent,new Demo(),"Second");
		Thread t3 = new Thread(tgchild,new Demo(),"Third");
		t1.start();
		t2.start();
		t3.start();
		System.out.println(tgparent.activeCount());
		System.out.println(tgchild.activeCount());
		
		
	}

}
