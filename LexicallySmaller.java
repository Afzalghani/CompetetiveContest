package CompetetiveContest;
import java.util.*;
import java.util.Scanner;

public class LexicallySmaller {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0)
        {
            int n=input.nextInt();
           String str=input.next();
           char a=str.charAt(0);
           char prev=a;
           int choose=-1;
           int min=Integer.MAX_VALUE;
           char latest='a';
           for(int i=1;i<str.length();i++)
           {
               if(a>= str.charAt(i) && prev!=str.charAt(i)){

                   if(latest>=str.charAt(i)){
                       latest=str.charAt(i);
                       choose=i;
                   }
               }
               prev=str.charAt(i);
           }

           if(choose==-1)
           {
               System.out.println(str);
           }
           else{
               String ans=str.charAt(choose)+"";
               for(int i=0;i<str.length();i++){

                   if(i==choose)
                       continue;
                   else
                     ans+=str.charAt(i);


               }
               System.out.println(ans);
           }




        }
    }
}
