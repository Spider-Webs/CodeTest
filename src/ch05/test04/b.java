package ch05.test04;

import java.util.Scanner;
import java.util.Stack;

public class b {
    public static int solution(String str){
        int answer = 0;

        Stack<Integer> st = new Stack<>();
        for(char c : str.toCharArray()){
            if(c=='+'){
                int tmp1 = st.pop();
                int tmp2 = st.pop();
                int tmp3 = tmp2+tmp1;
                st.push(tmp3);
            }else if(c=='-'){
                int tmp1 = st.pop();
                int tmp2 = st.pop();
                int tmp3 = tmp2-tmp1;
                st.push(tmp3);
            }else if(c=='*'){
                int tmp1 = st.pop();
                int tmp2 = st.pop();
                int tmp3 = tmp2*tmp1;
                st.push(tmp3);
            }else if(c=='/'){
                int tmp1 = st.pop();
                int tmp2 = st.pop();
                int tmp3 = tmp2/tmp1;
                st.push(tmp3);
            }else{
                st.push(Integer.parseInt(String.valueOf(c)));
            }
        }
        answer = st.pop();

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(solution(str));
    }
}
