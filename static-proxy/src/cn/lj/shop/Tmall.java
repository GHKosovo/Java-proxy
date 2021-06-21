package cn.lj.shop;

import cn.lj.factory.UsbKingFactory;
import cn.lj.service.UsbSell;

/**
 * @author llj
 * @date 2021年06月17日 13:55
 */
public class Tmall implements UsbSell {
    // 代理的是金士顿，定义目标厂家类
    private UsbKingFactory factory = new UsbKingFactory();

    @Override
    public float sell(int amount) {
        //调用目标方法
        float price = factory.sell(amount);
        //只增加1元
        price = price +1;
        return price;
    }
}
