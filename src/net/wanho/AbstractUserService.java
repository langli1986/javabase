package net.wanho;

/**
 * 抽象类是介于类和接口之间的东西；里面的方法全是abstract，则就是接口；里面的方法都不是abstract,则就是普通类
 * 抽象类中只要有一个方法是abstract,则该类一定要备abstract修饰；该类被abstract修饰，不一定非得有abstract方法
 */
public abstract class AbstractUserService {


    public abstract   void f();

    public void f1()
    {

    }

}
