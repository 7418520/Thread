package com.pc2;

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
goods.get("娃哈哈","矿泉水");

        }else{
            goods.get("旺仔","小馒头");

        }

    }
    }
}
