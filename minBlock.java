package CompetetiveContest;
import java.util.*;
public class minBlock {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int m=input.nextInt();
            int x1=input.nextInt();
            int y1=input.nextInt();
            int x2=input.nextInt();
            int y2=input.nextInt();

            int count=0;
            int count1=0;

          if(x1+1<=n) {
              count++;
            }
          if(x1-1>=1){
              count++;
          }
          if(y1+1<=m)
          {
              count++;
          }
          if(y1-1>=1)
              count++;

            if(x2+1<=n) {
                count1++;
            }
            if(x2-1>=1){
                count1++;
            }
            if(y2+1<=m)
            {
                count1++;
            }
            if(y2-1>=1)
                count1++;

            System.out.println(Math.min(count,count1));

        }
    }
}
