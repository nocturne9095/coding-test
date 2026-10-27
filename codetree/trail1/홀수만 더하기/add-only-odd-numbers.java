import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a % 3 == 0 && a % 2 != 0) {
                sum += a;
            }
        } System.out.print(sum);
    }
}