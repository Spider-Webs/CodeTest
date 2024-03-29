package baekjun_string.test10;


/*
백준 4999번
문제
의사는 재환이에게 "aaah"를 말해보라고 시켰다.

각각의 의사는 재환이에게 특정한 길이의 "aah"를 말해보라고 요청한다..

모든 의사는 자신이 원하는 길이의 "aah"를 듣지 못하면 진단을 내릴 수 없다.

따라서, 재환이는 집에서 자신이 얼마나 길게 "aah"를 낼 수 있는지 알아냈고, 자기가 소리낼 수 있는 길이의 "aah"를 요구하는 의사를 방문하려고 한다.

재환이가 낼 수 있는 "aah"의 길이와 의사가 요구하는 길이가 주어진다. 이때, 그 병원에 가야하는지 말아야하는지를 알아내는 프로그램을 작성하시오.

입력
입력은 두 줄로 이루어져 있다. 첫째 줄은 재환이가 가장 길게 낼 수 있는 "aaah"이다. 둘째 줄은 의사가 듣기를 원하는 "aah"이다.
두 문자열은 모두 a와 h로만 이루어져 있다. a의 개수는 0보다 크거나 같고, 999보다 작거나 같으며, 항상 h는 마지막에 하나만 주어진다.

출력
재환이가 그 병원에 가야하면 "go"를, 아니면 "no"를 출력한다.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        String answer = "";
        if(a.length()<b.length()){
            answer = "no";
        }else {
            answer = "go";
        }

        System.out.println(answer);


    }
}
