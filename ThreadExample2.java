//java code for thread creation by implementing the thread class
public class ThreadExample2 implements Runnable {  
   
    @Override  
    public void run() {  
        System.out.println("Thread has ended");  
    }  
   
    public static void main(String[] args) {  
        ThreadExample2 ex = new ThreadExample2();  
        Thread t1= new Thread(ex);  
        t1.start();  
        System.out.println("Hi");  
    }  
}  