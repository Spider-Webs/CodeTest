package study.TEST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B {
    public static int[] solution(int[] array, int[][] commands){
        int[] answer = {};
        answer = new int[commands.length];


        for(int i=0; i<commands.length; i++){
            List<Integer> list = new ArrayList<>();
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];
            for(int j=a; j<=b; j++){
                list.add(array[j-1]);
            }
            Collections.sort(list);
            answer[i]=list.get(c-1);
        }


        return answer;
    }
    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2,5,3},
                {4,4,1},
                {1,7,3}
        };

        for(int i : solution(arr,commands)){
            System.out.print(i+" ");
        }
    }

}
