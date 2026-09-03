public class replaceelement {
    
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        arr[2] = 100;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

