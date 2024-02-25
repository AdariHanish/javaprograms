class DisplayMessage extends Thread {
    private String message;
    private int delay;

    public DisplayMessage(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    public void run() {
        try {
            int i = 0;
            while (i != 5) {
                System.out.println(message);
                Thread.sleep(delay);
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Creating and starting threads by extending Thread class
        DisplayMessage thread1 = new DisplayMessage("Good morning", 1000);
        DisplayMessage thread2 = new DisplayMessage("Hello", 2000);
        DisplayMessage thread3 = new DisplayMessage("Welcome", 3000);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
