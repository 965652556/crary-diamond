
public class TestTicket {

	public static void main(String[] args) {

		TicketThread t1 = new TicketThread();
		TicketThread t2 = new TicketThread();

		t1.start();
		t2.start();

	}

}
