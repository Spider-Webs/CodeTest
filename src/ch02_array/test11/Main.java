package ch02_array.test11;
/*
11. 임시반장 정하기
자기반 학생 중에서 1학년부터 5학년까지 지내오면서
한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.

 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] arr = new int[n+1][5];

        for(int i=1; i<=n; i++){
            for(int j=0; j<5; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int max=0;
        int flag=0;
        for(int i=1; i<=n; i++){
            int count =0;
            for(int j=1; j<=n; j++){
                for(int k=0; k<5; k++){
                    if(arr[i][k]==arr[j][k]){
                            count++;
                            break;
                    }
                }
            }
            if(count>max){
                max=count;
                flag = i;
            }
        }
        System.out.println(flag);
    }
}
