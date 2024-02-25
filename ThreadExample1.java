//java code for thread creation by extending the thread class
class ThreadExample1 extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
ThreadExample1 t1=new ThreadExample1();  
t1.start();  
 }  
} 