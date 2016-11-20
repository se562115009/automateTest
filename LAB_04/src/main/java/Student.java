/**
 * Created by mac on 11/12/2016 AD.
 */
public class Student {

    String name;
    double gpa;

    // constructor
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
