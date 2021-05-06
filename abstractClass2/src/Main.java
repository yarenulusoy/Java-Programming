public class Main {

    public static void main(String[] args) {
    	//bir sisteme yeni özelik getirildiğinde kod degistirilmez
	    CustomerManager customerManager=new CustomerManager();
	    customerManager.databaseManager=new OracleDatabaseManager();
	    customerManager.getCustomers();
    }
}
