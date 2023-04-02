package CompetetiveContest;

import  java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(1,3,4,2,1,1,3,5,1,1,34,2,334,42);

        System.out.println(list.
                stream()
                .distinct()
                .collect(Collectors.toList()));


        Consumer<String> consumer= (name)-> System.out.println(name.toUpperCase());

        consumer.accept("hello");

        System.out.println("This is the min point for the ");
        final List<Integer> numbers =Arrays.asList(1, 2, 3, 100, 23, 93, 99);
        int max= numbers.stream().min((number1, number2)-> number1<number2 ? 1:-1).get();

        int max2=numbers.stream().max(Comparator.naturalOrder()).get();

        System.out.println(max);
        System.out.println(max2);

    }
}
