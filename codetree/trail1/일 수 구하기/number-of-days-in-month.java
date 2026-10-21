import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer;
        switch(n) {
            case 2:
                answer = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                answer = 30;
                break;
            default:
                answer = 31;
                break;
        }
        System.out.println(answer);
    }
}