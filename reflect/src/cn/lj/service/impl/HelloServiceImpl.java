package cn.lj.service.impl;

import cn.lj.service.HelloService;

/**
 * @author llj
 * @date 2021年06月17日 15:57
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("你好，"+name);
    }
}
