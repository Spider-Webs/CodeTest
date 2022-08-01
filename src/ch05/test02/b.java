package ch05.test02;

        import java.util.Scanner;
        import java.util.Stack;

public class b {

    public static String solution(String str){
        String answer = "";

        Stack<Character> st = new Stack<>();

        for (char c : str.toCharArray()) {
            if(c==')'){
                while (!st.isEmpty()&&st.pop()!='('){

                }
            }else {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<st.size(); i++){
            sb.append(st.get(i));
        }
        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));

    }
}