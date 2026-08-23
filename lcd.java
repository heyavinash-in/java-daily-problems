public class lcd {
    public static void main(String[] args) {
        int a = 24, b= 36;
        int lcm = 1;
        for(int i= 1; ; i++){
            if(i % a == 0 && i %b == 0){
                lcm = i;
                break;
            }
        }
        System.out.println("LCM= " + lcm);
    }
}
