package com.springboot2.itmq.text;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 线程池
 * java.util.concurrent.Executors :线程池的工厂类，用来生产线程池；
 * static ExecutorService newFixedThreadPool(int nThreads, ThreadFactory threadFactory)
 *   创建一个线程池，重用固定数量的线程，从共享无界队列中运行，使用提供的ThreadFactory在需要时创建新线程。
 *   参数：
 *      int nThreads 创建线程池中线程的数量；
 *   返回值：
 *      ExecutorService：接口，返回的是ExecutorService接口的实现类对象，我们可以使用ExecutorService接口接收（面向接口编程）
 *      java.util.concurrent.ExecutorService.ExecutorService：就是一个线程池的接口；
 *         用来从线程池中获取线程，调用start方法，执行线程；
 *          submit(Runnable task) 提交一个Runnable任务用于执行
 *         关闭和销毁线程池的方法：
 *              viod shutdown();
 *      线程池的使用步骤：
 *            1.使用线程池的工厂类Executors里面提供了一个静态方法newFixedThreadPool来生产一个指定数量线程数量的线程池；
 *            2.创建一个类，实现Runnable 类，重写run（）方法，设置线程任务
 *            3.调用ExecutorService中的方法submit，传递线程任务（实现类），开启线程，执行run方法；
 *            4.调用ExecutorService中的方法shutdown，去销毁线程池（不建议使用）
 */
public class ThreadPool {

    public static void main(String[] args) {
        //1.使用线程池的工厂类Executors里面提供了一个静态方法newFixedThreadPool来生产一个指定数量线程数量的线程池；
        ExecutorService executorService = Executors.newCachedThreadPool();
        //3.调用ExecutorService中的方法submit，传递线程任务（实现类），开启线程，执行run方法；
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());



    }
}
