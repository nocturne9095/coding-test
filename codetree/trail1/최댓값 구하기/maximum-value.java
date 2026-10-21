import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer;
        if(a >= b && a >= c) {
            answer = a;
        } else if (b >= c) {
            answer = b;
        } else {
            answer = c;
        }

        System.out.println(answer);
    }
}