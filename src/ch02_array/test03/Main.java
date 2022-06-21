package ch02_array.test03;
/*
A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고,
B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.

가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.

ex)
5               -> A, B, A, B, D
2 3 3 1 3
1 1 2 2 3
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<n; i++){
            a[i]=scanner.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = scanner.nextInt();
        }

        String answer="";

        List<String> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(a[i]==1&&b[i]==3||a[i]==2&&b[i]==1||a[i]==3&&b[i]==2){
                answer = "A";
            }else if(a[i]==b[i]){
                answer = "D";
            }else {
                answer = "B";
            }
            list.add(answer);
        }

        for(String s : list){
            System.out.println(s);
        }

    }
}
