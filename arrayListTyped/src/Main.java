import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cities= new ArrayList<String>(); //string koleksiyonu
        cities.add("ankara");
        cities.add("istanbul");

        Collections.sort(cities);//sehirleri sırala

        for (String city:cities){
            System.out.println(city);
        }
    }
}
