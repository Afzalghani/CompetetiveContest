//package CompetetiveContest;
import java.util.*;
public class restore {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int arr[]=new int[n-1];
            for(int i=0;i<n-1;i++){
                arr[i]=input.nextInt();

            }

            int ans[]=new int[n];

            ans[0]=arr[0];
            ans[n-1]=arr[n-2];

            for(int i=0;i<n-2;i++){
                ans[i+1]=Math.min(arr[i],arr[i+1]);
            }


            for(int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();



        }
        
    }
    
}
