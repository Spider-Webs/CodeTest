package ch05.test01;

import java.util.*;

public class Main {

    public static String solution(String str){
        String answer = "NO";

        Stack<Character> st = new Stack();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                st.push(str.charAt(i));
            }else{
                if(st.isEmpty()){
                    return "NO";

                }
                st.pop();
            }
        }
        if (st.isEmpty()){
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }

}
