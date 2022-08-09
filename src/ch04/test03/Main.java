package ch04.test03;

import java.util.*;

public class Main {

    public static List<Integer> solution(int n, int m, int[] arr){
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();


        for(int i=0; i<m-1; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        int lt=0;
        for(int rt=m-1; rt<n; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt],map.get(arr[lt])-1);
            if(map.get(arr[lt])==0){
                map.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer> solution = solution(n, m, arr);
        for (Integer integer : solution) {
            System.out.println(integer);
        }
    }
}
