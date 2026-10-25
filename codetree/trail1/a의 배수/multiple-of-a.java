import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int i = 1;
        while (i <= a) {
            if(i % b == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            i++;
        }

    }
}