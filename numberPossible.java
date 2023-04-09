package CompetetiveContest;
import java.util.*;
public class numberPossible {
    public static long solve(long n){
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        while(n>0){
            min=Math.min(min,n%10);
            max=Math.max(max,n%10);
            n=n/10;
        }
        return max-min;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long l=input.nextLong();
            long r=input.nextLong();
            long ans=Integer.MIN_VALUE;
            long digit=0;
            for(long i=l;i<=r;i++){
               if(ans<solve(i)){
                   digit=i;
                   ans=solve(i);
               }
            }
            System.out.println(digit);


        }

    }
}
