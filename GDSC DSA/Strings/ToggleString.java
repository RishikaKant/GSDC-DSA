import java.util.Scanner;
import java.util.StringJoiner;

public class ToggleString {

    public static void main(String[] args) {
        String string = "ckdAAm";
        String s = toggleString(string);
        System.out.println(s);
    }

    public static String toggleString(String st) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < st.length(); i++) {
            char s = st.charAt(i);
            if ('a' <= s && s <= 'z') {
                string.append((char) (s - 'a' + 'A'));
            }
            if ('A' <= s && s <= 'Z') {
                string.append((char) (s - 'A' + 'a'));
            }
        }

        return string.toString();
    }

}
