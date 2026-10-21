import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int answer = 0;

        for (int i = 1; i < 6; i++) {
            answer = a * i;
            System.out.print(answer + " ");

        }
    }
}