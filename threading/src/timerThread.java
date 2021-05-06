public class timerThread implements Runnable {

    private Thread t;
    private String threadName;

    public timerThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Olusturuluyor " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Calistiriliyor " + threadName);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName + ":" + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Hata");
        }
        System.out.println("Thread bitti " + threadName);


    }
    public void start(){
        System.out.println("Olusuyor");
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
        else{

        }
    }
}
