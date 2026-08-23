public class primenumber{
    public static void main(String[] args) {
        int n = 54;
        boolean prime = true;
        for(int i = 2; i <=n; i++){
            if(n%i==0){
                prime = false;
                break;
            }
           
            }
             if(prime){
                System.out.println("it is a prime number" );

            }else{
                System.out.println("it is not prime ");
        }
    }
}