package abc178.b;

// 제목 : Product Max

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        long max = Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d));

        if ((a <= 0 && b >= 0) || (c <= 0 && d >= 0)) {
            max = Math.max(max, 0);
        }

        System.out.println(max);
    }
}
