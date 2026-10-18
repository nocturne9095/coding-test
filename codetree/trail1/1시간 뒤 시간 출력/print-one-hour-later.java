import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int idx = s.indexOf(":");
        int h = Integer.parseInt(s.substring(0, idx));
        String m = s.substring(idx + 1);

        System.out.println((h + 1) + ":" + m);


    }
}