package ch05.test01;
/*
설명
괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

입력
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.

출력
첫 번째 줄에 YES, NO를 출력한다.

예시 입력 1
(()(()))(()

예시 출력 1
NO
 */
import java.util.Scanner;
import java.util.Stack;

public class a {

    public static String solution(String str){
        //Stack을 이용한 문제 괄호 문제가나온다면 stack을 고민해보자
        String answer = "NO";

        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){ //열린괄호일 경우 stack에 값을 넣어준다
                st.push(str.charAt(i));
            } else if (st.isEmpty()) {//문자열의 처음이 ')' 닫힌 괄호일 수도 있으므로, 해당 문자를 넣어주고 for문을 빠져나온다
                    st.push(str.charAt(i));// 문자를 넣어주는이유는 열린괄호만 스택에 쌓이게되고 닫힌 괄호일경우 스택에서 빼내어
                                            // 그 수가 동일한경우(스택의 사이즈가==0) answer =YES가 되므로 스택에 PUSH하여
                                            // 빈스택이 되지않도록 한다
                    break;
            }else {
                st.pop();
            }
        }

        if(st.isEmpty()){
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
