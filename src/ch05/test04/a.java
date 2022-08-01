package ch05.test04;

import java.util.Scanner;
import java.util.Stack;

public class a {
    public static int solution(String str){
        int answer = 0;

        Stack<Integer> st = new Stack<>();
        for(char c : str.toCharArray()){
            if(c=='+'){
                int tmp1= st.pop();
                int tmp2 = st.pop();
                int tmp3 = tmp2 + tmp1;
                st.push(tmp3);
            }else if(c=='-'){
                int tmp1= st.pop();
                int tmp2 = st.pop();
                int tmp3 = tmp2 - tmp1;
                st.push(tmp3);
            }else if(c=='*'){
                int tmp1= st.pop();
                int tmp2 = st.pop();
                int tmp3 = tmp2 * tmp1;
                st.push(tmp3);
            }else if(c=='/'){
                int tmp1= st.pop();
                int tmp2 = st.pop();
                int tmp3 = tmp2 / tmp1;
                st.push(tmp3);
            }else{
                int x= Integer.parseInt(String.valueOf(c));
                st.push(x);
            }
        }

        answer = st.pop();

        return answer;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(solution(str));
    }
}
