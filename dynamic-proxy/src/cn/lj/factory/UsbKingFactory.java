package cn.lj.factory;

import cn.lj.service.UsbSell;

/**
 * @author llj
 * @date 2021年06月18日 15:05
 * @Target 目标类
 */
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        //目标方法
        System.out.println("目标类中，执行sell目标方法");
        return 85.0f;
    }
}
