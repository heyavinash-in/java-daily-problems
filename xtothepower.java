public class xtothepower {
    

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        System.out.println("Result = " + result);
    }
}