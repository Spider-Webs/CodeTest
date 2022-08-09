package study;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String regex = "(02|010)-\\d{3,4}-\\d{4}";

        String phone = "010-1234-12346";

        boolean match = Pattern.matches(regex, phone);
        System.out.println(match);
    }
}
