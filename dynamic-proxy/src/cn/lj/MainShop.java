package cn.lj;

import cn.lj.factory.UsbKingFactory;
import cn.lj.handler.MysellHandler;
import cn.lj.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author llj
 * @date 2021年06月18日 15:21
 */
public class MainShop {
    public static void main(String[] args) {
        //创建代理对象，使用proxy
        //1.创建目标对象
//        UsbKingFactory factory = new UsbKingFactory();
        UsbSell factory = new UsbKingFactory();
        //2.创建InvocationHandler对象
        InvocationHandler handler = new MysellHandler(factory);

        //3.创建代理对象
        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(
                factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler);
        //4.通过代理执行方法
        float price = proxy.sell(1);
        System.out.println("通过动态代理对象，调用方法："+price);
    }
}
