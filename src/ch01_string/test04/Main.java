package ch01_string.test04;
/*
Q. 단어 뒤집기

N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<String> solution(int n,String[] str){
        List<String> answer = new ArrayList<>();

        for(int i=0; i<n; i++){
            //StringBuffer 클래스의 reverse()메서드를 사용하여, 단어를 뒤집고 toString()으로 String 클래스로 전환
            String tmp = new StringBuffer(str[i]).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] str = new String[n];

        for (int i=0; i<str.length; i++){
            str[i] = scanner.next();
        }

        for(String s : solution(n,str)){
            System.out.println(s);
        }

    }
}
