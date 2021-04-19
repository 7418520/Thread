package thread;

public class TicketThreadDemo extends Thread{
    private int ticket=5;
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出第" + (ticket--) + "票");
            }
        }

    }

    public static void main(String[] args) {
        TicketThreadDemo t1=new TicketThreadDemo();
        TicketThreadDemo t2=new TicketThreadDemo();
        TicketThreadDemo t3=new TicketThreadDemo();
        TicketThreadDemo t4=new TicketThreadDemo();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
