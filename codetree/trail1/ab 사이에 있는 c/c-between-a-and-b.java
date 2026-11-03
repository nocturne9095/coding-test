import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean found = false;
        int i = a;
        while (i <= b) {
            if(i % c == 0) {
                found = true;
                break;
            }
            i++;
        }
        System.out.println(found ? "YES" : "NO");
    }
}