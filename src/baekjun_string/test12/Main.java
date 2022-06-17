package baekjun_string.test12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int m = scanner.nextInt();
            String s = scanner.next();
            char[] chars = s.toCharArray();
            String answer = "";
            for(int j=0; j<s.length(); j++){
                for(int k=0; k<m; k++){
                    answer += chars[j];

                }
            }
            list.add(answer);
        }
        for (String s : list) {
            System.out.println(s);

        }
    }
}
