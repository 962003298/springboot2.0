package com.springboot2.itmq.text;

/**
 * 2.创建一个类，实现Runnable 类，重写run（）方法，设置线程任务
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
