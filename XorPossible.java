package CompetetiveContest;

import java.util.*;
public class XorPossible {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int arr[]=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();

            }
            int res=0;


                for(int i=0;i<n;i++)
                    res^=arr[i];

         int loop=(int) Math.pow(2,8);


                if(n%2==0){
                    System.out.println(res==0?0:-1);
                }
                else{
                    System.out.println(res>=loop?-1:res);
                    }

                }


            }



    }


