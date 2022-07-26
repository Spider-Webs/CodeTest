package ch05.test02;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static String solution(String str){
        String answer = "";

        Stack<Character> st = new Stack();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==')'){
                while (st.pop() != '(') {

                }
            }else {
                st.push(str.charAt(i));
            }
        }

        for(int i=0; i<st.size(); i++){
            answer += st.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(solution(str));
    }
}
