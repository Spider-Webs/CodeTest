package ch04.test03;

import java.util.*;

public class b {

    public static List<Integer> solution(int n, int m, int[] arr){
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<m-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int lt =0;
        for(int i=m-1; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            list.add(map.size());
            map.put(arr[lt],map.get(arr[lt])-1);
            if(map.get(arr[lt])==0){
                map.remove(arr[lt]);
            }
            lt++;
        }


        return list;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        for (int i : solution(n, m, arr)) {
            System.out.print(i + " ");
        }


    }
}
