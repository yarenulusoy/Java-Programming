public class Main {
//polimorfizm cok bicimlilik
    public static void main(String[] args) {
//      BaseLogger[] loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger()};
//      for(BaseLogger logger:loggers){
//          logger.Log("Log mesajı");
//      }
//        CustomerManager customerManager=new CustomerManager(new FileLogger());
        CustomerManager customerManager=new CustomerManager(new DatabaseLogger()); //polimorfizm
        customerManager.add();

    }
}
