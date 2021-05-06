import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String > dictionary=new HashMap<String,String>();
        dictionary.put("book","kitap");
        dictionary.put("computer","bilgisayar");
        System.out.println(dictionary);
        //System.out.println(dictionary.get("book"));

        for (String item:dictionary.keySet()){
            System.out.println(item);
            System.out.println("Eleman-"+item+" Deger-"+dictionary.get(item));
        }
    }
}
