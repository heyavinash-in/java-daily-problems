public class seclargest {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;

        int largest;
        int second;

        if (a >= b && a >= c) {
            largest = a;
            second = Math.max(b, c);
        } else if (b >= a && b >= c) {
            largest = b;
            second = Math.max(a, c);
        } else {
            largest = c;
            second = Math.max(a, b);
        }

        System.out.println("Second largest = " + second);
    }
}