package cn.lj.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author llj
 * @date 2021年06月18日 15:07
 */

//必须实现InvocationHandler接口，完成代理类要做的功能（1.调用目标方法；2.增强功能）
public class MysellHandler implements InvocationHandler {

    private Object target = null;

    //动态代理：目标对象是活动的，不是固定的，需要传进来
    //传进来是谁，就给谁创建代理
    public MysellHandler(Object target){
        //给目标对象赋值
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //向厂家发送订单，告诉厂家，我买了U盘，厂家发货
//        float price = factory.sell(amount); //厂家的价格
        Object result = null;
        result = method.invoke(target, args);//执行目标方法

        //商家 需要加价，也就是代理需要增加价格。
//        price += 25;  //增强功能，代理类在完成目标类方法调用后，增强了功能
        if(result != null ){
            float price = (float) result;
            price += 25;
            result = price;
        }

        //在目标类的方法调用后，你做的其他功能，都是增强的意思
        System.out.println("亚马逊商家，给你返一个优惠券，或者红包");

        return result;
    }
}
