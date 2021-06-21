package cn.lj.shop;

import cn.lj.factory.UsbKingFactory;
import cn.lj.factory.UsbSandiFactory;
import cn.lj.service.UsbSell;

/**
 * @author llj
 * @date 2021年06月17日 13:27
 * @Target 代理闪迪U盘的销售
 */
public class AmazonSandiShop implements UsbSell {

    //声明 商家代理的厂家具体是谁
    private UsbSandiFactory factory = new UsbSandiFactory();

    //实现销售U盘的功能
    @Override
    public float sell(int amount) {

        float price = factory.sell(amount);
        price += 25;
        return price;
    }
}
