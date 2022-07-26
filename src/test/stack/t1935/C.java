package test.stack.t1935;
/*
백준 1935  - 후위 표기식
Stack 을 활용한 문제
 */
import java.util.Scanner;
import java.util.Stack;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        double[] arr = new double[n];

        Stack<Double> st = new Stack<>();


        for(int i=0; i<n; i++){
            arr[i] = scanner.nextDouble();
        }

        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                st.push(arr[str.charAt(i) - 'A']);//알파벳에 해당하는 아스키코드 - 65를하여 배열 arr[인덱스]번호를 확인할 수 있다
            }else if(str.charAt(i)=='+'){
                double temp1 = st.pop();//마지막 앞전에 넣은 숫자를 끄내온다
                double temp2 = st.pop();//마지막에 넣은 숫자를 끄내온다
                double temp3 = temp2 + temp1; //계산한다
                st.push(temp3);//결과 값을 스택어 넣어준다 반복한다
            }else if(str.charAt(i)=='-'){
                double temp1 = st.pop();
                double temp2 = st.pop();
                double temp3 = temp2 - temp1;
                st.push(temp3);
            }else if(str.charAt(i)=='/'){
                double temp1 = st.pop();
                double temp2 = st.pop();
                double temp3 = temp2 / temp1;
                st.push(temp3);
            }else if(str.charAt(i)=='*'){
                double temp1 = st.pop();
                double temp2 = st.pop();
                double temp3 = temp2 * temp1;
                st.push(temp3);
            }
        }
        System.out.printf("%.2f",st.pop());
    }
}
