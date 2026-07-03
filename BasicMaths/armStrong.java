package BasicMaths;
import java.util.*;

public class armStrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (armstrong(n)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    public static boolean armstrong(int n) {
        int count = 0;
        int temp = n;


        while (temp > 0) {
            count++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        return sum == n;
    }
}