package CompetetiveContest.model;

import java.util.List;

public class Student {
    String name;
    String address;

    int cgpa;

    public int getCgpa() {
        return cgpa;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    List<String> activities;

   public Student(){}

    public Student(String name, String address,int cgpa,  List<String> activities)
   {
       this.name=name;
       this.address=address;
       this.cgpa=cgpa;
       this.activities=activities;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cgpa=" + cgpa +
                ", activities=" + activities +
                '}';
    }
}
