import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String []args){
    int sayi=sinirsizTopla(0,2,3,4,5);
    System.out.println(sayi);

    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Guncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static int sinirsizTopla(int... sayilar){ //variable arguments
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;

    }
}