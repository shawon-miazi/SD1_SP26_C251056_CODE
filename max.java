package SD1_SP26_C251056_CODE;
import java.util.*;

public class max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = Math.max(a, Math.max(b, c));

        System.out.println("Max: " + max);

        input.close();
    }
}