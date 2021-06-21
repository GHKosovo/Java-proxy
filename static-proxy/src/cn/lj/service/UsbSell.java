package cn.lj.service;

/**
 * @author llj
 * @date 2021年06月17日 13:17
 * @Funtion 厂家和商家都要完成的功能
 */
public interface UsbSell {

    //定义方法 参数amount表示一次购买的数量，暂时不用
    //返回值表示一个U盘的价格;
    float sell(int amount);
}
