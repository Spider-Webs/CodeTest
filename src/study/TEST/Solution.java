package study.TEST;
import java.util.*;
public class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Doc> q = new LinkedList<>();
        for(int i=0; i<priorities.length; i++){
            q.offer(new Doc(i,priorities[i]));
        }
        int count =1;
        while(!q.isEmpty()){
            q.poll();
           Doc poll = q.poll();
            Iterator<Doc> iter=q.iterator();
            boolean flag = true;
            while(iter.hasNext()){
                Doc p =iter.next();
                if(poll.pri<p.pri){
                    flag = false;
                    break;
                }
            }
            if(flag==false){
                q.offer(poll);
            }else{
                if(location==poll.doc){
                    answer = count;
                    break;
                }else{
                    count++;
                }
            }
        }



        return answer;
    }
}
class Doc {
    int doc;
    int pri;

    Doc(int doc, int pri){
        this.doc =doc;
        this.pri=pri;
    }


}