package CompetetiveContest;

import java.util.*;
public class division {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);

         int t=input.nextInt();
         while(t-- >0){
             int n=input.nextInt();
             int arr[]=new int[n];
             for(int i=0;i<n;i++){
                 arr[i]=input.nextInt();
             }

             for(int i=0;i<n;i++){
                 if(arr[i]==1)
                 {
                     arr[i]++;
                 }

             }

             for(int i=1;i<n;i++){
                 if(arr[i]%arr[i-1]==0)
                 {
                     arr[i]++;
                 }
             }

             for(int i:arr){
                 System.out.print(i+" ");
             }
             System.out.println();
         }

    }
}
