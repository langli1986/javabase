package net.wanho;

public class Father {
    public void test(){
        System.out.println("Father.test()");
    }

    public void test(int age)
    {
        System.out.println("Father.test(int age)");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.test();


        Son son = new Son();
        son.test();
        son.test(1);
        //把子类的对象付给父类的引用，用这个引用去调用方法，真正执行的事子类中重写的方法--》对象的上转型
        Father f1 = new Son();
        f1.test();
        f1.test(10);
    }
}
