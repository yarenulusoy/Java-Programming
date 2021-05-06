public class AccountManager {
    private double balance;

    public void deposit(double amount){ //para ekle
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsufficientException{ //para cek
        if(balance>=amount){
            balance = getBalance() - amount;
        }
        else{
//            System.out.println("Bakiye yetersiz");
            throw new BalanceInsufficientException("Bakiye yetersiz");
        }

    }

    public double getBalance() {
        return balance;
    }
}
