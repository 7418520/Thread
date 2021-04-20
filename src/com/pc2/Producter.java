package com.pc;

public class Producter implements Runnable {
    private Goods goods;
    public Producter() {

    }
    public Producter(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
    for (int i=0;i<10;i++)
    {
        if(i%2==0){
          goods.setBrand("娃哈哈");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            goods.setName("矿泉水");

        }else{
            goods.setBrand("旺仔");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            goods.setName("小馒头");

        }
        System.out.println("生产了"+this.goods.getBrand()+"----"+this.goods.getName());
    }
    }
}
