package CompetetiveContest;

import java.util.*;
public class Sequence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();

        int x=n/2;

        if(n%2==0){
            if(m>x){
                long ans= 2+ (m-x-1)*2;
                System.out.println(ans);
                return;
            }
            else{
                long ans= 1+ (m-1)*2;
                System.out.println(ans);
                return;
            }
        }
        else{
            if(m>x){
                long ans= 2+ (m-x-1)*2;
                System.out.println(ans);
                return;
            }
            else{
                long ans= 1+ (m-1)*2;

                System.out.println(ans);
                return;
            }
        }
    }
}
