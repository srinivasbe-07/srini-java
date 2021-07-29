package playWithThreads.basic;

public class Thread2 {
	private static int ticketsAvaliable=2;
	public static void main(String[] args) {
		new Thread(()->{if(ticketsAvaliable >0) {
			bookTickets();
			ticketsAvaliable--;
		}}).start();
		
		new Thread(()->{if(ticketsAvaliable >0) {
			bookTickets();
			ticketsAvaliable--;

		}}).start();
		
	}
	public static void bookTickets() {
		System.out.println("Booked Ticket");
	}
}
