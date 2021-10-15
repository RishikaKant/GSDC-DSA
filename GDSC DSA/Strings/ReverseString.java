public class ReverseString {
    public static void main(String[] args) {
    }

    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;

        for (l = 0; l < r; l++, r--) {
            char temp = s[r];
            s[r] = s[l];
            s[l] = temp;
        }

        System.out.println(Arrays.toString(s));

    }

}
