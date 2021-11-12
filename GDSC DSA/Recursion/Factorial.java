public class Factorial {
    static long factorial(int N) {
        long ans = 1L;
        if (N == 1 || N == 0) {
            return 1;
        }
        ans = N * factorial(N - 1);
        return ans;
        // code here
    }

}
