package CompetetiveContest;
import java.util.*;
public class mihaniAndbihani {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-- >0)
        {
            int n=input.nextInt();


            int mihahi=0;
            int bihai=0;

            for(int i=0;i<n;i++)
            {
                int x=input.nextInt();
                if(x%2==0)
                    mihahi+=x;
                else{
                    bihai+=x;
                }
            }
            System.out.println(mihahi>bihai? "YES":"NO");
        }
    }
}
