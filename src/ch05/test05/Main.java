package ch05.test05;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int solution(String str){
        int answer =0;

        Stack<Character> st = new Stack<>();

        char[] c = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            if(c[i]=='('){ //열린괄호를 만나면 push 해준다
                st.push(c[i]);
            }else {
               st.pop(); //레이져와 쇠막대기 상관없이  stack에서 끄내준다 닫힌괄호와 매핑되는
                        // 열린괄호를 stack에서 없애야 잘린막대기의 수를 구할수있다
               if(c[i-1]=='('){ //레이져인경우
                   answer+=st.size(); //레이져인경우 쇠막대기가 잘렸으모로 남은 스택의 사이즈만큼 더해주면된다
               }else {
                   answer++;
               }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }
}
