
import java.util.*;



public class largestDigit {

    public static  String makeGreater(String str,int d){

        String ans="";

        if((str.charAt(0)-'0')<d){
            ans+=d;
            ans+=str;
            return ans;
        }

        for(int i=0;i<str.length();i++){
            if((str.charAt(i)-'0')<d){
                ans=str.substring(0,i)+d +str.substring(i,str.length());
                return ans;
            }
        }
        return str+d;


    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int d=input.nextInt();
            String str=input.next();
            System.out.println(makeGreater(str,d));

        }

    }
}
