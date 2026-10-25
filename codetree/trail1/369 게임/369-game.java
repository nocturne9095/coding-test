import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            boolean has369 = false;
            int num = i;

            while(num > 0) {
                int digit = num % 10;
                if(digit == 3 || digit == 6 || digit == 9) {
                    has369 = true;
                }
                num /= 10;
            }
            if (i % 3 == 0 || has369) {
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}