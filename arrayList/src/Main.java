import java.util.ArrayList;

public class Main {
//koleksiyonlar
    public static void main(String[] args) {
        ArrayList numbers=new ArrayList();
        numbers.add(1);
        numbers.add(10);
        numbers.add("ankara");
        //System.out.println(numbers.get(1)); //1.indeksi getir
        //numbers.set(0,5); //0.indeksi 5 ile degistir
        //numbers.remove(0); //0.indeksi sil
        //numbers.clear(); //listeyi sil

        for (Object number:numbers){ //hemstring hem int varsa farklı değişkenler icin object
            System.out.println(number);
        }
    }
}
