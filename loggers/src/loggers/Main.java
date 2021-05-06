package loggers;

public class Main {

	public static void main(String[] args) {
//		CustomerManager customerManager=new CustomerManager(new SmsLogger());
		
		Logger[] loggers= {new SmsLogger(),new FileLogger(),new DatabaseLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);

		Customer yaren=new Customer(1,"Yaren","Ulusoy");
		customerManager.add(yaren);
		 
	}

}
