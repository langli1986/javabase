package net.wanho;

import java.util.concurrent.*;

public class CallableTest {
    /**
     * Runnable没有返回类型，Callable有返回类型
     * @param args
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //把实现类的对象付给接口的引用
        Callable callable = new MyCallable();

        //通过Executors创建了一个单例的线程池
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //将callable交给线程池管理，执行
        Future<String> future = executorService.submit(callable);
        //获得执行结果 call
        String ret = future.get();
        //打印结果
        System.out.println(ret);


    }
}


class MyCallable implements Callable<String>{


    @Override
    public String call() throws Exception {
        return new String("zhangli");
    }
}
