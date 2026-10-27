import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i <= a; i++) {
            if(isLeapYear(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    static boolean isLeapYear(int year) {
        if(year % 100 == 0 && year % 400 != 0) {
            return false;
        } 
        return year % 4 == 0;
    }

}