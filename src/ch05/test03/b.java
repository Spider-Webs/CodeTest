package ch05.test03;
/*
3. 크레인 문제
Stack과 나름의 나는 이차원배열을 활용한 문제라고생각한다
 */
import java.util.Scanner;
import java.util.Stack;

public class b {

    public static int solution(int n, int[][] a, int m, int[] b){
        int answer = 0;
        Stack<Integer> st = new Stack<>();

        for(int x : b){//b의 요소의 값을 가져온다
            int j = x-1; //이차원 배열의 열의 해당하는 부분에 사용할것이므로 가져온 값의 -1을해준다
            for(int i=0; i<a.length; i++){
                if(a[i][j]!=0){ //문제에서 빈칸을 제외하므로 0이 아닌요소의 경우에만 해당한다
                    if(!st.isEmpty()&&st.peek()==a[i][j]) { // 스택의 요소가 있다면, 맨위의 요소와 현재 이차원 배열의 인덱스 같으면
                        st.pop();//스택의 요소에서 빼준다
                        answer+=2;//동일한 인형을 만났으므로 +2
                    }else{
                        st.push(a[i][j]); // 다른경우 스택의 넣어준다
                    }
                    a[i][j] = 0; //스택의 넣어주거나, 인형이 터졌으므로 해당인덱스는 0으로 변경해주어야한다
                    break;//계속반복되는것을 막기위해 break 문을 작성해준다
                }
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = scanner.nextInt();
        }
        System.out.println(solution(n,a,m,b));
    }
}
