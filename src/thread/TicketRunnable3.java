package thread;

/**
 * 使用接口的方法，每次只创建了一个共享对象，所有的线程能够实现资源共享
 *      1.数据不一致问题
 *         解决方法（使用线程同步）
 */
public class TicketRunnable2 implements Runnable {
    private int ticket=5;
    @Override
    public void run() {

        for (int i=0;i<100;i++){
            try {   Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this){

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出第" + (ticket--) + "票");
                }
            }


        }

    }

    public static void main(String[] args) {
        TicketRunnable2 ticketRunnable=new TicketRunnable2();
        Thread t1=new Thread(ticketRunnable,"A");
        Thread t2=new Thread(ticketRunnable,"B");
        Thread t3=new Thread(ticketRunnable,"C");
        Thread t4=new Thread(ticketRunnable,"D");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
