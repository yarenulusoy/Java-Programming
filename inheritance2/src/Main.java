public class Main {

    public static void main(String[] args) {
    //degisim yapıldıgında
        TeacherCreditManager teacherCreditManager=new TeacherCreditManager();
        teacherCreditManager.Hesapla();

        CreditUI creditUI=new CreditUI();
        creditUI.CreditCalculator(new TeacherCreditManager()); //istedigimiz parametreyi yollarız //polimorfizm
    }
}
