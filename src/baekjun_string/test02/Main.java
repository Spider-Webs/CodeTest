package baekjun_string.test02;
/*
Q. OX퀴즈 

"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> solution(int n, String[] str){
        List<Integer> answer = new ArrayList<>();

        int count=0, sum=0; //count 변수 연속된 o의 갯수 , sum 누적 점수

        for(int i =0; i<n; i++){
            //매개변수 str[] 배열의 인덱스를 각 문자배열로 변경
            char[] c = str[i].toCharArray();

            for(int j=0; j<c.length; j++){
                //c[] index가 O인지 판단하여, O일경우 COUNT +1 증가, SUM+= 누적
                if(c[j]=='O'){
                    count++;
                    sum += count;
                }else{
                    //X가 나오면 초기화
                    count=0;
                }
            }
            answer.add(sum);
            
            //다음 STR[]배열을 위해 초기화
            count=0; 
            sum=0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] str = new String[n];

        for(int i =0; i<n; i++){
            str[i] = scanner.next();
        }

        for(int i : solution(n,str)){
            System.out.println(i);
        }


    }
}
