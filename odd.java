package SD1_SP26_C251056_CODE;
import java.util.*;

public class odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        input.close();
    }
}
