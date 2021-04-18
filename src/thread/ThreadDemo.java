package thread;

/**
 * 1.继承Thread类
 * 2.实现多线程必须要实现run方法，指的是核心执行逻辑
 * 3.线程在启动时，不要直接调用run方法，而是通过start()方法来调用
 * 4.每次运行相同的代码，出来的结果可能不一样，原因在于多线程谁先抢占资源无法进行人为控制
 */
public class ThreadDemo  extends Thread{
    @Override
    public void run() {
       for(int i=0;i<10;i++)
       {
           System.out.println(Thread.currentThread().getName()+"--------"+i);
       }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo=new ThreadDemo();
        threadDemo.start();
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
