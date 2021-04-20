package com.pc2;

/**
 * 多线程访问的时候出现了数据安全的问题
 *      1.生产者没有生产，消费者就取走了
 *      2.商品的名称和品牌不对应
 */

public class Test {
    public static void main(String[] args) {
        Goods goods=new Goods();
        Producter producter=new Producter(goods);

        Consumer consumer=new Consumer(goods);
        Thread t2=new Thread(consumer);   Thread t1=new Thread (producter);

        t1.start();
        t2.start();
    }
}
