public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0 || n == 0) {
            return false;
        }

        boolean ans = isPowerOfTwo(n / 2);
        return ans;

    }
}