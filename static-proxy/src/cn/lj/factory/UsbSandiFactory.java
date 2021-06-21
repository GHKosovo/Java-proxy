package cn.lj.factory;

import cn.lj.service.UsbSell;

/**
 * @author llj
 * @date 2021年06月17日 14:22
 */
public class UsbSandiFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        return 65.0f;
    }
}
