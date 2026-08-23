public class palindrome {
    public static void main(String[] args) {
        int n = 121;
        int orginal=n;
        int rev = 0;
        while(n!=0){
            int digit = n%10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        if(orginal==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
