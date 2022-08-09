package study.TEST;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class A {

    public static List<Integer> solution(int []arr) {
        // int[] answer = {};
        List<Integer> answer = new ArrayList<>();

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){//2 3 4

            if(!st.isEmpty()&&st.peek()==arr[i]){ //t t

                    st.pop();
            }else{
                st.push(arr[i]);  //st:1 x /3 x 1
                answer.add(st.peek());
            }

        }


        return answer;
    }
    public static void main(String[] args) {
//        int[] arr = {1, 1, 3, 3, 0, 1, 1,};
        int[] arr = {4, 4, 4, 3, 3};
        for(int i : solution(arr)){
            System.out.print(i+" ");
        }
    }
}
