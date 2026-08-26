public class arrcounter {
    public static void main(String[] args) {
        int a[]={22, 34, 54, 67, 78 ,99 , 55, 77};
        int oddcounter =0;
        int evencounter =0;
        for(int x: a){
            if(x%2==0){
                evencounter++;
            }else{
                oddcounter++;
            }
           
        } System.out.println("the number of Even in the array is: " +evencounter);
            System.out.println("the number of odd in the array is : " +oddcounter);
    }
}
