public class Main {
    public static void main(String []args){
//        Product product=new Product(1,"name","desc",15,1);
        Product product=new Product();
        product.setId(1);
        product.setName("Laptop");

        ProductManager productManager=new ProductManager();
        productManager.Add(product);

        System.out.println(product.getName());

        //Hesapmakinesi
        System.out.println("---------------------");
        Calculator calculator=new Calculator();
        System.out.println(calculator.topla(5,2));
        System.out.println(calculator.topla(5,2,1));
    }
}
