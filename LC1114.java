public class LC1114 {
    private int n;
    private boolean flag1;
    private boolean flag2;
    private Object lock = new Object();
//    public Foo() {
//
//    }

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized(lock){
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            flag1=true;
            lock.notifyAll();
        }

    }

    public void second(Runnable printSecond) throws InterruptedException {

        synchronized(lock){
            while(!flag1){
                // printSecond.run() outputs "first". Do not change or remove this line.
                lock.wait();
            }
            printSecond.run();
            flag2=true;
            lock.notifyAll();

        }

    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized(lock){
            while(!flag2){
                // printThird.run() outputs "first". Do not change or remove this line.
                lock.wait();
            }
            printThird.run();
        }

    }
}
