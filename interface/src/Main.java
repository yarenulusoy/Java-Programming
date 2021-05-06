public class Main {

    public static void main(String[] args) {
//        ICustomerDal iCustomerDal = new MySqlCustomerDal(); //polimorfizm
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
