package CompetetiveContest;
import java.util.*;

public class conveyer {
    public static int find(int x, int y, int n){
        x--;
        y--;
        x=Math.min(x,n-x-1);
        y=Math.min(y,n-y-1);

        return Math.min(x,y);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int x1=input.nextInt();
            int y1=input.nextInt();
            int x2=input.nextInt();
            int y2=input.nextInt();

            System.out.println(Math.abs(find(x1,y1,n)-find(x2,y2,n)));
            

        }

    }
}
