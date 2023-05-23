public class MyThread extends Thread{
    
    @Override
    public void run() {
        if(this.isDaemon()){
            System.out.println("This a Daemon thread that is running");
        }
        System.out.println("This is a User thread that is running");
    }
}
