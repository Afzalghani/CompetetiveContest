package CompetetiveContest;
import java.util.*;
public class primetest {
    public  static boolean isPrime(long n){

        if(n==0 || n==1)
            return false;
        if(n==2)
             return true;

        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;

    }

    public static void sum(long a, long b){
        long total=0;
        long even=0;
        long odd=0;

        for(long i=Math.min(a,b); i<=Math.max(a,b); i++){
             total=total+i;
             if(i%2==0)
                 even+=i;
             else{
                 odd+=i;
             }

        }
        System.out.println(total);
        System.out.println(even);
        System.out.println(odd);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       long a=input.nextLong();
       long b=input.nextLong();
        sum(a,b);
    }

}
