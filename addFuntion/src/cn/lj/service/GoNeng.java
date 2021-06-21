package cn.lj.service;

/**
 * @author llj
 * @date 2021年06月18日 17:04
 */
public class GoNeng implements HelloService {
    @Override
    public int print(String name) {
        System.out.println("其他人写好的功能方法");
        return 2;
    }
}
