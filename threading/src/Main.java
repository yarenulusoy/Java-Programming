public class Main {

    public static void main(String[] args) {
        timerThread thread = new timerThread("thread");
        timerThread thread2 = new timerThread("thread2");
        timerThread thread3 = new timerThread("thread3");

        thread.start();
        thread2.start();
        thread3.start();
    }
}
