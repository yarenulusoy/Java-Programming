public class Main {

    public static void main(String[] args) {
        BaseCreditManager[] baseCreditManagers=new BaseCreditManager[]{new TeacherCreditManager(),new AgricultureCreditManager()};
        for (BaseCreditManager baseCreditManager:baseCreditManagers){
            System.out.println(baseCreditManager.hesapla(1000));
        }

    }
}
