package net.wanho;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {//�洢����������ִ�У��洢����������+������=���봦��ԪCPU, �����豸������豸->��ŵ������ϵ�ṹ


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
