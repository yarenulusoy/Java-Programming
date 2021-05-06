import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer>customers=new ArrayList<Customer>();
        customers.add(new Customer(1,"yaren","ulusoy"));
        customers.add(new Customer(2,"zehra","ulusoy"));
        Customer yaren=new Customer(1,"yaren2","ulusoy");
        customers.add(yaren);
        customers.remove(yaren);

        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }

    }
}
