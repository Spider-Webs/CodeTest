package ch05.test07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static String solution(String essential, String subject) {
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for(int i=0; i<essential.length(); i++){
            queue.offer(essential.charAt(i));
        }

        for(char c : subject.toCharArray()){
            if(queue.contains(c)){
                if(c!= queue.poll()){
                    return "NO";
                }
            }
        }
        if (!queue.isEmpty()){
            return "NO";
        }


        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String essential = scanner.next();
        String subject= scanner.next();
        System.out.println(solution(essential,subject));

    }
}
