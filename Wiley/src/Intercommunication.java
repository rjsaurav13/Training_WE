class BankAccount {
	int amount = 1000;

	public synchronized void withdrawnAmount(int amount) {
		System.out.println("Amount is less");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Amount withdrawn is successfull");

	}

	public synchronized void depositAmount(int amount) {
		this.amount += amount;
		System.out.println("Amount Deposited");
		notify();
	}
}

public class Intercommunication {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		Thread t1 = new Thread() {
			public void run() {
				ba.withdrawnAmount(1500);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				ba.withdrawnAmount(1000);
			}
		};
		t1.start();
		t2.start();
	}
}
