public class elementchecker {
   
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int search = 40;

        boolean exists = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {
                exists = true;
                break;
            }
        }

        System.out.println(exists);
    }
}

