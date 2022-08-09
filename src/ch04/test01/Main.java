package ch04.test01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static char solution(int n, String str){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if(map.get(key)>max){
                max = map.get(key);
                answer = key;
                Collection<Integer> values = map.values();
                
                for (Integer value : values) {

                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String str = scanner.next();

        System.out.println(solution(n,str));
    }
}
