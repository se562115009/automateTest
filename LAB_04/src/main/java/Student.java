import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by mac on 11/12/2016 AD.
 */

// @Data --> is lombok, it already create by lombok

    @Setter
    @Getter


@Builder
public class Student {

    // select generate >> equal() amd hashcode()
    String name;
    String studentId;
    double gpa;

    // constructor
    public Student(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Double.compare(student.gpa, gpa) != 0) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return studentId != null ? studentId.equals(student.studentId) : student.studentId == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (studentId != null ? getStudentId().hashCode() : 0);
        temp = Double.doubleToLongBits(gpa);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
