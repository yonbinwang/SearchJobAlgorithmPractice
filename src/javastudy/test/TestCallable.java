package javastudy.test;

import java.util.concurrent.*;

public class TestCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        wait();
        return  "我是call线程";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> ft = new FutureTask<>(new TestCallable());
        Thread thread = new Thread(ft);
        thread.start();
        thread.join();
        System.out.println(ft.get());
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            try {

                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Executors.newCachedThreadPool().execute(()-> System.out.println("xx"));

    }
}
