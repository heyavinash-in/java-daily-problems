public class armstrong {
    public static void main(String[] args) {
        int n = 153;
        int original=n;
        int sum =0;

        while(n!=0){
            int digit= n%10;
            sum+=digit*digit*digit;
            n /=10;
        }
        if(original==sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
