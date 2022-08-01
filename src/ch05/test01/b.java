package ch05.test01;

import java.util.Scanner;
import java.util.Stack;

public class b {

    public static String solution(String str){
        String answer = "YES";

        Stack<Character> st = new Stack<>();

        for(char c : str.toCharArray()){
            if(c=='('){
                st.push(c);
            }else if(st.isEmpty()){

                st.push(c);
                break;
            }else{
                st.pop();
            }

        }
        if(!st.isEmpty()){
            answer= "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }
}
