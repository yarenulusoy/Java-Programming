package nLayered.core;

import nLayered.jLogger.JLoggerManager;

//baskas�n�n s�n�f�n� adapte etme
public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager=new JLoggerManager();
		manager.log(message);
		
	}

}
