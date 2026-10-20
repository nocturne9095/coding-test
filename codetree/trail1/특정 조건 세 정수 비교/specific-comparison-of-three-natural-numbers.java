import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int min = Math.min(a, Math.min(b, c));

    int first = (a == min) ? 1 : 0;
    int second = (a == b && b == c) ? 1 : 0;

    System.out.println(first + " " + second);
 
    }
}