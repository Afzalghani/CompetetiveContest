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
           int choose=-1;
           int min=27;

           for(int i=1;i<str.length();i++)
           {
              if(min>=(str.charAt(i)-'a')){
                  min=str.charAt(i)-'a';
                  choose=i;

              }
           }



           if(str.charAt(0)-'a'<min){
               System.out.println(str);
           }
           else {
               System.out.print(str.charAt(choose));
               for(int i=0;i<str.length();i++){
                   if(i!=choose){
                       System.out.print(str.charAt(i));
                   }
               }
               System.out.println();
           }







        }
    }
}
