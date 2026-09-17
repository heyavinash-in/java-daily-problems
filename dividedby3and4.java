public class dividedby3and4 {
    
    public static void main(String[] args) {
        int n = 30;

        if (n % 3 == 0 && n % 5 == 0)
            System.out.println("Divisible by both");
        else
            System.out.println("Not divisible by both");
    }
}

