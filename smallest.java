public class smallest {
    public static void main(String[] args) {
        int a [] ={12, 23, 45, 56, 78, 89,22};
        int smallest = a[0];
        for(int i =1; i<a.length-1; i++){
            if(a[i]<smallest){
                smallest = a[i];

            }
        }System.out.println(smallest);
    }
}
