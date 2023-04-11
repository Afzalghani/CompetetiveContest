package CompetetiveContest.functionalProgramming;

import  java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumofNUmber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        //Sum of first n numbers
        System.out.println(IntStream.rangeClosed(1,n)
                        .parallel()
                        .sum());

        //Find the distinct numbers in a given list of the array

        ArrayList<Integer> list=new ArrayList(Arrays.asList(1,2,3,1,2,4,5,4,2,3,3,3,32,1));
        System.out.println(
                list.stream()
                        .distinct()
                        .collect(Collectors.toList())
        );
    }
}
