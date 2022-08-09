package ch05.test05;

import java.util.Scanner;
import java.util.Stack;

public class a {

    public static int solution(String str){
        int answer = 0;

        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                st.push(str.charAt(i));
            }else{
                if(str.charAt(i-1)=='('){
                    st.pop();
                    answer += st.size();
                }else{
                    st.pop();
                    answer+=1;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }
}
