package ch05.test06;
/*
6. 공주구하기
큐를 이용한 문제
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++){  //1번부터 n번까지의 왕자가있어 큐에 넣어준다
            q.offer(i);
        }

        int count =1; //특정숫자와 비교하기위한 변수 count
        while(q.size()>1){
            q.offer(q.poll());//특정숫자까지는 맨앞에번호는 빠지고 다시 맨뒤에로 간다
            count++; // 위에 방법을 큐 특정숫자까지 반복
            if(count==k){//특정숫자가되면
                q.poll(); // 해당숫자는 제거
                count=1; //다시 count 변수는 초기화
            }
        }
        int answer = q.peek();
        System.out.println(answer);
    }
}
