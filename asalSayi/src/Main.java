import java.util.Scanner;

public class Main {
    //girilen sayi asal mı degil mi
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //kullanicidan sayi girisi alma
        System.out.print("Sayi Girin: ");
        int number = input.nextInt(); //girilen sayiyi number degiskenine atama
        int isPrime = 0;

        if (number == 1) {
            System.out.println(number + " Asal bir sayi degildir.");
            return;
        }
        if (number < 1) {
            System.out.println(number + " Gecersiz sayi.");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime++;
            }
        }

        if (isPrime == 0) {
            System.out.println(number + " Asal bir sayidir.");
        } else {
            System.out.println(number + " Asal bir sayi degildir.");
        }
    }
}
