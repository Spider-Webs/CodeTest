package study.chap03;
/*
선형 검색
 */
import java.util.Scanner;

public class Test3_1 {

    public static int solution(int num, int[] arr, int key){
        int answer =-1;

        for(int i=0; i<num; i++){
            if(arr[i]==key){
                answer=i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 길이 : ");
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            System.out.print("arr["+i+"] : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("검색 값 : ");
        int key = scanner.nextInt();

        int idx = solution(num, arr, key);
        if(idx==-1){
            System.out.println("검색 값이 없습니다");
        }else{
            System.out.println(idx+" 번째 위치에 있습니다");
        }

    }

}
