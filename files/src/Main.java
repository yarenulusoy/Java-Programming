import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //createFile();
        //getFileInfo();
        readFile();
        writeFile();
        readFile();


    }

    public static void createFile() {
        File file = new File("C:\\Users\\HP\\IdeaProjects\\file\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu");
            } else {
                System.out.println("Dosya zaten mevcut");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() { //dosya bilgileri okuma
        File file = new File("C:\\Users\\HP\\IdeaProjects\\file\\students.txt");
        if (file.exists()) {
            System.out.println("Dosya adi: " + file.getName());
            System.out.println("Dosya yolu: " + file.getAbsolutePath());
            System.out.println("Dosya yazilabilir mi:  " + file.canWrite());
            System.out.println("Dosya okuabilir mi: " + file.canRead());
            System.out.println("Dosya boyutu: " + file.length());
        }
    }

    public static void readFile() {//dosya okuma
        File file = new File("C:\\Users\\HP\\IdeaProjects\\file\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) { //okunan satır sayısı
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close(); //dosyayı bellekten kapa
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile() { //dosyaya yazma
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\IdeaProjects\\file\\students.txt", true));//uzerine ekle
            writer.newLine();
            writer.write("Ayse");
            System.out.println("Dosyaya yazildi");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
