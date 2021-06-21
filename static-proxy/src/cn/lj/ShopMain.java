package cn.lj;

import cn.lj.shop.Amazon;
import cn.lj.shop.Tmall;

/**
 * @author llj
 * @date 2021年06月17日 13:31
 */
public class ShopMain {
    public static void main(String[] args) {
        //创建代理的商家Amazon对象
//        Amazon amazon = new Amazon();
//        float price = amazon.sell(1);
//        System.out.println("通过亚马逊，购买U盘的单价："+price);

        //天猫商家的销售价格
        Tmall tmall = new Tmall();
        float price2 = tmall.sell(1);
        System.out.println("通过天猫购买的价格："+price2);


    }
}
