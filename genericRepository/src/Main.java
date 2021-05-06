public class Main {

    public static void main(String[] args) {
	//repository design patter
        Validator validator=new Validator();
        Customer customer=new Customer();
        validator.validate(customer);
    }
}
