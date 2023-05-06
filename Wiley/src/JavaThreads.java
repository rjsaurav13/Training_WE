
class tpriority extends Thread{
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
			
		}
	}
}
public class JavaThreads {
	public static void main(String[] args) throws InterruptedException {
		tpriority t1=new tpriority();
		tpriority t2=new tpriority();
		t1.start();
		t1.join(10);
		t2.start();
		tpriority t3 =new tpriority();
		t2.join();
		t3.start();

		
	}
	

}
