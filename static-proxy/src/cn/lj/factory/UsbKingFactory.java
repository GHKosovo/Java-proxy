package cn.lj.factory;

import cn.lj.service.UsbSell;

/**
 * @author llj
 * @date 2021年06月17日 13:14
 * @Target 金士顿厂家
 */
public class UsbKingFactory implements UsbSell {

    @Override
    public float sell(int amount) {
        System.out.println("目标类中的方法调用，UsbKingFactory中的sell");
        //一个128G的U盘的价格是85元
        //后期更具amount,可以实现不同的价格，例如10000个，单价是80，50000个是75；
        return 85.0f;
    }
}
