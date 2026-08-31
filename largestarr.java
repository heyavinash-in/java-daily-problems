public class largestarr {
    public static void main(String[] args) {
        int a [] = {12, 34, 56, 78, 13, 45, 56};
        int largest = a[0];
        for(int i = 1; i<a.length-1; i++){
            if(a[i]>largest){
                largest = a[i];

            }
            
        }System.out.println(largest);
    }
}
