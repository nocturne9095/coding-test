import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        if(3<= M && M <= 5) {
            System.out.println("Spring");
        } else if (6 <= M && M <= 8) {
            System.out.println("Summer");
        } else if (9 <= M && M <= 11) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }


    }
}