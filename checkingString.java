package CompetetiveContest;

import java.util.*;
public class checkingString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.next();
            if(arr[i].equals("and") || arr[i].equals("that") || arr[i].equals("not") || arr[i].equals("you") || arr[i].equals("the"))
            {
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
        return;

    }
}
