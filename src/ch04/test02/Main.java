package ch04.test02;

import java.util.*;

public class Main {

    public static String solution(String a, String b){
        String answer = "YES";

        Map<Character, Integer> map = new HashMap<>();


        for(char x : a.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(char x: b.toCharArray()){
            if(!map.containsKey(x)||map.get(x)==0){
                return "NO";
            }
            map.put(x, map.get(x) - 1);
        }


        return answer;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        System.out.println(solution(a,b));
    }
}
