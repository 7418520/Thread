package thread;

public class TheadapiDemo {
    public static void main(String[] args) {
//        获取当前线程的对象
        Thread thread = Thread.currentThread();
//        获取当前线程的名字
        thread.getName();
//        获取线程的Id
        thread.getId();
//        获取线程的优先级，在一般的系统中是0-10，如果没有设置的话是5，有的是0-100
        thread.getPriority();
//        设置优先级
        /*
        * 优先级越高越先执行吗？
        * 不一定，只是优先的概率较高
        *
        * */
                thread.setPriority(10);
    }
}
