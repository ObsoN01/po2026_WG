import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < 6; i++) {
            arr[i] = (r.nextInt(49-1 +1) + 1);
            System.out.println(arr[i]);
        }
    }
}
