package net.wanho;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {//存储起来，依次执行：存储器，控制器+运算器=中央处理单元CPU, 输入设备，输出设备->冯诺依曼体系结构


        new MyThread().start();


        System.out.println(12345);

        System.out.println(67890);
    }
}

class MyThread extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
    }
}
