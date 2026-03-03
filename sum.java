package SD1_SP26_C251056_CODE;

import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        int sum = 0;
        sum=((n+1)*n)/2;

        System.out.println("Sum: " + sum);

        input.close();
    }
}