class Test {
    public static void main(String args[]) {
        int a = 10;
        long b = 100000000;
        double x = 10.12;
        b=a; // b = 10; -> narowing
        // int y = (int)x;
        System.out.println(b); // b = 10
        System.out.println(a); // a = 10
        System.out.println((int)x); // x = 10 -> expanding
    }
}