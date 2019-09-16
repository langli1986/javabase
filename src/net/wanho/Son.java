package net.wanho;

public class Son extends Father{//当这个类被修饰为public时，文件名与该类名相同

    //父子类之间，方法名称相同，参数列表也相同，就是重写，重写是方法的更新
    public void test() {
        System.out.println("Son.test()");
    }

    public void test(int age)
    {
        System.out.println("Son.test(int age)");
    }
}
