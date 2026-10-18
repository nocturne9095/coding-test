import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if ("S".equals(a)) {
            System.out.println("Superior");
        } else if ("A".equals(a)) {
            System.out.println("Excellent");
        } else if ("B".equals(a)) {
            System.out.println("Good");
        } else if ("C".equals(a)) {
            System.out.println("Usually");
        } else if ("D".equals(a)) {
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }
    }
}