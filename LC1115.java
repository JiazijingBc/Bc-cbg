public class LC1115 {
    private int n;
    private boolean flag;
    private Object lock = new Object();
//    public FooBar(int n) {
//        this.n = n;
//    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized(lock){
                if(flag){
                    lock.wait();
                }
                printFoo.run();
                flag=true;
                lock.notifyAll();
            }
        }


    }
    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized(lock){
                if(!flag){
                    lock.wait();

                }
                printBar.run();
                flag=false;
                lock.notifyAll();
            }
        }
    }
}
