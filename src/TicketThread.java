
public class TicketThread extends Thread {

	private static int num = 50;

	public static synchronized void saleTicket() {
		if (num > 0) {
			System.out.println(Thread.currentThread().getName() + " NO." + num);
			num--;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		while (true) {
			if (num > 0) {
				TicketThread.saleTicket();
			} else {
				break;
			}
		}
	}

}
