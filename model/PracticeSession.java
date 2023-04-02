package CompetetiveContest.model;

import java.util.List;
import java.util.function.Consumer;

public class PracticeSession {
    public static void main(String[] args) {
        List<Student> list=StudentService.GetAllStudents();


        System.out.println("Initial condition for the presenting it ");
        Consumer<Student> consumer= student -> System.out.println(student.getName());

        Consumer<Student> consumer1= student-> System.out.println(student.getActivities());

        list.forEach(consumer.andThen(consumer1));


    }
}
