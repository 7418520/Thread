package thread;

/**
 * 第一种实现方式：
 * 1.继承Thread类
 * 2.实现多线程必须要实现run方法，指的是核心执行逻辑
 * 3.线程在启动时，不要直接调用run方法，而是通过start()方法来调用
 * 4.每次运行相同的代码，出来的结果可能不一样，原因在于多线程谁先抢占资源无法进行人为控制
 * 第二种实现方式：使用了代理模式
 *      1.实现Runnable结构
 *      2.重写run方法
 *      3.创建Thread对象，将刚刚创建好的Runnable的子类作为thread的构造参数
 *      4.通过thread.start()启动
 * 两种实现模式哪种好：
 *      1.推荐第二种模式，java是单继承，将继承留给最需要的类
 *      2.使用runnable接口后，不需要给共享变量加static关键字，每次创建一个对象，作为共享对象即可
 * 线程的生命周期
 *      1.新生状态
 *          当创建好当前线程对象之后，没有启动之前（调用start之前）
 *      2.就绪状态：准备开始执行，并没有执行，表示调用start方法之后
 *          当对应的线程创建完毕，且调用start方法之后，所有的线程会添加到就绪队列中，所有的线程同时去抢占CPU的资源
 *      3. 运行状态：当当前进程获取到CPU资源之后，就绪队列的进程就去抢占cpu的资源，谁先抢到谁先执行，在执行的过程中就叫运行过程
 *                  抢到CPU资源，就开始执行代码逻辑
 *      4. 死亡状态：当运行中的线程正常执行完所有的代码后或者异常导致程序结束交死亡状态
 *      进入方式：1.正常运行完成并结束2.人为中断执行如stop3.程序抛出未捕获的异常
 *      5.阻塞状态：在运行过程中，发生某种异常情况，导致当前线程无法顺利执行，此时会进入阻塞状态，进入阻塞状态的原因消除以后，所有的阻塞
 *                队列会再次进入到就绪状态中，随机抢占CPU资源等待执行
 *        进入的两种方法1.sleep方法2.等待IO资源
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
