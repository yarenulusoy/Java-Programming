import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        BufferedReader reader = null;
        int total =0;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\HP\\IdeaProjects\\readingFile\\src\\numbers.txt"));
            String line =null;
            while((line =reader.readLine())!=null){ //satir sayisi döndür
                total += Integer.valueOf(line); //integer cevirme
            }
            System.out.println("Toplam = " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception exception) {

            }

        }
    }
}

