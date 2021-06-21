package cn.lj;

import cn.lj.service.HelloService;
import cn.lj.service.impl.HelloServiceImpl;
import cn.lj.service.impl.HelloServiceImpl2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author llj
 * @date 2021年06月17日 15:57
 */
public class TestApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        HelloServiceImpl helloService = new HelloServiceImpl();
//        helloService.sayHello("李四");
        //使用反射机制执行sayHello方法，核心Method(类中的方法)
        HelloService target = new HelloServiceImpl();
        //获取sayHello名称对于Method类对象
        Method method = HelloService.class.getMethod("sayHello", String.class);
        //通过Method可以执行sayHello方法调用
        /*
            invoke是Method类中的一个方法，表示执行方法的调用
            参数：
                1.Object,表示对象，要执行的这个对象的方法
                2.Object...args,方法执行时的参数值
            返回值：
                Object:方法执行后的返回值
         */
        //表达的意思就是，执行target对象的sayHello,参数是张三
        Object ret = method.invoke(target, "张三");

        //如果要修改代理对像，只需要这样
        HelloService target2 = new HelloServiceImpl2();
        Object ret2 = method.invoke(target2, "李四");

    }
}
