package ch05.test08;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Client {
    int id;
    int priority;

    Client(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}


public class Main {
    public static int solution(int n, int m, int[] arr){
        int answer = 1;

        Queue<Client> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            q.offer(new Client(i, arr[i]));
        }

        while (!q.isEmpty()){
            Client first =q.poll();
            Iterator<Client> iterator = q.iterator();
            boolean flag = true;
            while (iterator.hasNext()){
                Client next = iterator.next();
                if(first.priority<next.priority){
                    flag=false;
                    break;
                }
            }
            if(flag==false){
                q.offer(first);
            }else{
                if(first.id==m){
                    return answer;
                }else{
                    answer++;
                }
            }
        }
        return 0;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(solution(n,m,arr));
    }
}
