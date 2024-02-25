class SharedResource {
    private int sharedVariable = 0;
    public void incrementSharedVariable() {
        synchronized (this) {
            for (int i = 0; i < 100000; i++) {
                sharedVariable++;
            }
        }
    }
    public synchronized int getSharedVariable() {
        return sharedVariable;
    }
}
class IncrementThread extends Thread {
    private SharedResource sharedResource;
        public IncrementThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }
    public void run() {
        sharedResource.incrementSharedVariable();
    }
}
public class ThreadSynchronizationExample{
    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();
        IncrementThread thread1 = new IncrementThread(sharedResource);
        IncrementThread thread2 = new IncrementThread(sharedResource);
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
        System.out.println("Final Shared Variable Value: " + sharedResource.getSharedVariable());
    }
}
