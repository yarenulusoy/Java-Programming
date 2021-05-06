public class Main {

    public static void main(String[] args) {
       /* try {
            int[] numbers = new int[]{1, 2, 3};
            System.out.println(numbers[5]);
        } catch (Exception e) {//kodda bir hata varsa uygulama calısır fakat hata ciktisi verir
            System.out.println("Hata olustu");
        } finally { //finally her türlü calisir.hata olsa da olmasa da yapmak istedigimiz olay
            System.out.println("finally");
        }*/

        try {
            int[] numbers = new int[]{1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {//kodda bir hata varsa uygulama calısır fakat hata ciktisi verir
            System.out.println("Dizi hatasi olustu");
        } catch (StringIndexOutOfBoundsException e) {//kodda bir hata varsa uygulama calısır fakat hata ciktisi verir
            System.out.println("String hatasi olustu");
        } catch (Exception e) {//kodda bir hata varsa uygulama calısır fakat hata ciktisi verir hangi tür hata olursa olsun
            System.out.println("Bunlarin disinda hata olustu");
        } finally { //finally her türlü calisir.hata olsa da olmasa da yapmak istedigimiz olay
            System.out.println("finally");
        }
    }
}
/**
 * EXCEPTION
 * Butun exceptionlar inheritance yapisina sahiptir
 * -RuntimeException
 * -IOException
 * -SqlException
 * -AWTException
 * -InterruptedException
 */
