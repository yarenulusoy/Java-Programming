public class TeacherCreditManager extends BaseCreditManager{
    public double hesapla(double tutar){ //override
        return tutar * 1.10;
    }
}
