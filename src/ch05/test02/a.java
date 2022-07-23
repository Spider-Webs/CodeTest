package ch05.test02;
//괄호 문자 제거
/*
괄호문제가 나오면 stack을 고려해보자

설명
입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력
남은 문자만 출력한다.

예시 입력 1
(A(BC)D)EF(G(H)(IJ)K)LM(N)

예시 출력 1
EFLM
 */
import java.util.*;

public class a {
    public static String solution(String str){
        String answer = "";

        Stack<Character> st = new Stack<>();

        for(char c : str.toCharArray()){
            if(c==')'){ //괄호사이에 들어간 문자가 아닌 경우에대해 출력하는 문제이므로, 닫는 괄호일경우 열린괄호전까지 제거한다
                while(st.pop()!='('){
                }
            }else{//닫힌 괄호가 아닌경우 스택에 쌓아준다
                st.push(c);
            }
        }

        for(int i=0; i<st.size(); i++){
            answer += st.get(i);
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        System.out.println(solution(str));
    }
}
