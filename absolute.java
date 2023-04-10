package CompetetiveContest;
import javax.sound.midi.SysexMessage;
import java.util.*;
public class absolute {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

            int n=input.nextInt();


            long sum=0;

            for(int i=0;i<n;i++)
            {
                sum+=input.nextInt();


            }
            System.out.println(sum>=0? sum:-sum);

    }
}
