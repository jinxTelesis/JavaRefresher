import java.util.concurrent.CountDownLatch;

class FileReader implements Runnable{

    private String threadName;
    private String fileName;
    private CountDownLatch cdl;
    FileReader(String threadName, String fileName, CountDownLatch cdl){
        this.threadName = threadName;
        this.fileName = fileName;
        this.cdl = cdl;
    }

    @Override
    public void run(){
        System.out.println("Reading file" + fileName + " thread " + threadName);
        cdl.countDown();
    }
}
