package CompetetiveContest;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            int arr[][]=new int[n][n];
            int temp[][]=new int[n][n];

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=input.nextInt();
                }
            }
            int row=0;
            int col=n-1;
            for(int i=n-1;i>=0;i--){
                for(int j=0;j<n;j++)
                {
                  temp[row][col]=arr[i][j];
                  col--;
                }
                row++;
                col=n-1;
            }





            int unmatched=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++)
                {
                    if(arr[i][j]!=temp[i][j]){
                        unmatched++;
                    }
                }
            }

            int res=unmatched/2;

            int rem=k-res;
            if(res>k){
                System.out.println("NO");
            }
            else{
                if((n&1) > 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println(rem%2==0? "YES":"NO");
                }
            }


        }
    }
}
