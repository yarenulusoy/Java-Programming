package nLayered.core;

import nLayered.jLogger.JLoggerManager;

//baskasýnýn sýnýfýný adapte etme
public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager=new JLoggerManager();
		manager.log(message);
		
	}

}
