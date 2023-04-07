package CompetetiveContest;
import java.util.*;
public class minimumstep {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0)
        {
            long x=input.nextLong();
            long y=input.nextLong();

            long max=(long)Math.pow(10,5);
            long ans=Integer.MAX_VALUE;

            for(long i=1;i<max;i++){

                long xx=(long) ((x+i-1)/i); //ceil value of x/i

                long yy=(y+i-1)/i;

                ans=Math.min(ans,i-1+xx+yy);


            }
            System.out.println(ans);





        }

    }
}
