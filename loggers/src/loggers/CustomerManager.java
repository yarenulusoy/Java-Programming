package loggers;

public class CustomerManager {
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Musteri eklendi " + customer.getFirstName());
		
//		for(Logger logger:loggers) {
//			logger.log(customer.getFirstName());
//		}
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		
	}
	public void delete(Customer customer) {
		System.out.println("Musteri silindi "+ customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());

	}
	
}



/*
 * public class CustomerManager { private Logger logger;
 * 
 * public CustomerManager(Logger logger) { this.logger = logger; }
 * 
 * public void add(Customer customer) { System.out.println("Musteri eklendi " +
 * customer.getFirstName()); this.logger.log(customer.getFirstName());
 * 
 * 
 * } public void delete(Customer customer) {
 * System.out.println("Musteri silindi "+ customer.getFirstName());
 * this.logger.log(customer.getFirstName());
 * 
 * }
 * 
 * 
 * }
 */
