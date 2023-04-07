//package CompetetiveContest;

import java.util.*;
public class possible {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextLong();
            long k=input.nextLong();

           long first=n%k;

           long res= n%k;

           if(res%2==0 || (res+k)%2==0 ){

               System.out.println("YES");
           }
           else {
               System.out.println("NO");
           }


        }
    }
}
