import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int n = 145;
        sc.close();
        factorian(n);
    }

    static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static void factorian(int n) {
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += fact(rem);
            n /= 10;
        }

        if (temp == sum) {
            System.out.println("Factorian");
        } else {
            System.out.println("Not Factorian");
        }
    }
}
