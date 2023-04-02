package CompetetiveContest;

import java.util.*;
public class Main {

    public static String EquationCheck(int a, int b, int c){
        if(a+b==c)
            return "+";
        return "-";
    }

    public static String benefit(int arr[], int n){
        int bihan=0;
        int minha=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                minha +=arr[i];
            }
            else {
                bihan+=arr[i];
            }
        }
        return minha> bihan ? "yes": "no";
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(Main.benefit(arr,n));
        }


    }
}
