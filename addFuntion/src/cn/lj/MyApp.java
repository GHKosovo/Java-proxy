package cn.lj;

import cn.lj.handler.MyInvocationHandler;
import cn.lj.service.GoNeng;
import cn.lj.service.HelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author llj
 * @date 2021年06月18日 17:10
 */
public class MyApp {
    public static void main(String[] args) {

//        GoNeng gn = new GoNeng();
//        int num = gn.print("销售");
//        System.out.println("num="+num);
        GoNeng goNeng = new GoNeng();
        InvocationHandler handler = new MyInvocationHandler(goNeng);

        HelloService helloService = (HelloService) Proxy.newProxyInstance(goNeng.getClass().getClassLoader(),
                goNeng.getClass().getInterfaces(),
                handler);

        int num = helloService.print("销售");
        System.out.println("我们期望的num="+num);


    }
}
