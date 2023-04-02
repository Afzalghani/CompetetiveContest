package CompetetiveContest.model;

import java.util.Arrays;
import java.util.List;

public class StudentService {

    public static List<Student> GetAllStudents(){

        Student student1=new Student("Afzal","Ghani",12, Arrays.asList("cricket", "hockey"));
        Student student2=new Student("Akbar","Ghani",10, Arrays.asList("Gambling", "DataAnalytics"));
        Student student3=new Student("Suresh","Singh",3, Arrays.asList("Table Tennis", "Kabbaddi"));
       Student student4=new Student("Rames","jonani",23, Arrays.asList("Rames", "John"));
        Student student5=new Student("Perter","Pitbull",42, Arrays.asList("cricket","Nothing", "hockey"));
        Student student6=new Student("john","Carter",133, Arrays.asList("cricket", "hockey"));

        return Arrays.asList(student1,student2,student3,student4,student5,student6);



    }
}
