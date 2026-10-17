import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] w = new int[n];
        int[] v = new int[n];
        for(int k = 0; k < n; k++) {
            st = new StringTokenizer(br.readLine());
            w[k] = Integer.parseInt(st.nextToken());
            v[k] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[m + 1];

        for(int j = 1; j <= m; j++) {
            for(int k = 0; k < n; k++) {
                if(w[k] <= j) {
                    dp[j] = Math.max(dp[j], dp[j - w[k]] + v[k]);
                }
            }
        }
        System.out.println(dp[m]);


    }
}