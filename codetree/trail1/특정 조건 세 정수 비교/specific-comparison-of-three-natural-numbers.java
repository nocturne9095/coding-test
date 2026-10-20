import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    
        if(a <= Math.min(a, Math.min(b, c))) {
            if(a == b && b == c) {
                System.out.println(1 + " " + 1);
            } else {
                System.out.println(1 + " " + 0);
            }
        } else {
            if(a ==b && b == c) {
                System.out.println(0 + " " + 1);
            } else {
                System.out.println(0 + " " + 0);
            }
        }

    }
}