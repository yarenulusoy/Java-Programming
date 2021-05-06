public class Main {

    public static void main(String[] args) {
	    AccountManager manager=new AccountManager();
	    manager.deposit(20);
	    System.out.println(manager.getBalance());
	    try {
			manager.withdraw(90);
		}
	    catch (BalanceInsufficientException e){
	    	System.out.println(e.getMessage());
		}

	    System.out.println(manager.getBalance());
    }
}
