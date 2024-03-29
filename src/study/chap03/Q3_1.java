package study.chap03;

import java.util.Scanner;

public class Q3_1 {

    static int binSearchEx(int[] a, int n, int key) {
        //key==4; a[]={1,2,3,4,5,6}, n==6;
        int pl=0;
        int pr=n-1; //5

        for(int i=0; i<n/2; i++){
            int pc=(pl+pr)/2;  //pc==2;
            if(a[pc]==key){
                return pc;
            }else if(a[pc]<key){
                pl=pc+1;
            }else{
                pr=pc-1;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수：");
        int num = stdIn.nextInt();
        int[] x = new int[num]; // 요솟수 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]："); // 맨 앞 요소를 읽어 들임
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]：");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]); // 하나 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("찾는 값："); // 키 값을 입력 받음
        int ky = stdIn.nextInt();

        int idx = binSearchEx(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
    }
}
