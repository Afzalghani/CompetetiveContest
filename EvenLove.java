package CompetetiveContest;

import java.util.*;
public class EvenLove {
    static int solve(String str){
        int first=(str.charAt(0)-'0');
        int last= (str.charAt(str.length()-1)-'0');

        if(last%2==0)
            return 0;
        if(first%2==0)
             return 1;

        boolean flag=false;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)%2==0){
                flag=true;
                break;
            }
        }
        return flag?2:-1;

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-- >0){
            String n=input.next();
            System.out.println(solve(n));
        }

    }
}

