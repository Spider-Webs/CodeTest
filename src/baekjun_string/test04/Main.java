package baekjun_string.test04;
/*
Q.알파벳 찾기
알파벳 소문자로만 이루어진 단어 S가 주어진다.
각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치,
... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다.
단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

ex) baekjoon - >
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 */

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        //알파뱃의 갯수만큼 배열을 생성한다
        int[] arr = new int[26];

        //기본 초기화를 모든 배열의 값에 -1을 채운다
        for(int i=0; i<arr.length; i++){
            arr[i]=-1;
        }

        //입력받은 문자열 str을 for문으로 반복한다
        for(int i=0; i<str.length(); i++){
            //index의 값은 소문자 a가 0이되도록 초기화 한다
            int index = str.charAt(i) - 'a';

            //arr[index]==-1이면(아까 -1로 채웠기에 모든값은 -1이다)
            if(arr[index]==-1){
                //해당자리에 str의 인덱스값을 입력
                arr[index] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
