package net.wanho;

import java.util.concurrent.*;

public class CallableTest {
    /**
     * Runnableû�з������ͣ�Callable�з�������
     * @param args
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //��ʵ����Ķ��󸶸��ӿڵ�����
        Callable callable = new MyCallable();

        //ͨ��Executors������һ���������̳߳�
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //��callable�����̳߳ع���ִ��
        Future<String> future = executorService.submit(callable);
        //���ִ�н�� call
        String ret = future.get();
        //��ӡ���
        System.out.println(ret);


    }
}


class MyCallable implements Callable<String>{


    @Override
    public String call() throws Exception {
        return new String("zhangli");
    }
}
