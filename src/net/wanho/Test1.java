package net.wanho;

public class Test1 {
    public void test1()
    {
        //如果别的类中的方法是static，则直接使用类名调用
        Test.test();
        //如果别的类中的方式不是static修饰的，则必须实例化
        Test t = new Test();
        t.test1();
    }
}
