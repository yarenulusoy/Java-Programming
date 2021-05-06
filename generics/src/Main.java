import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList <String>cities=new ArrayList<String>(); //tip verince generic class,tip güvenli calisma
//        cities.add("Ankara");
//        cities.add("Istanbul");

//        MyList<String> cities=new MyList<String>();
//        cities.add("Ankara");
//        cities.add("Istanbul");

        MyList<Customer> cities = new MyList<Customer>();
        cities.add(new Customer());
        cities.add(new Customer());

    }
}
