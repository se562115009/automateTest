import lombok.Builder;
import lombok.Data;

/**
 * Created by mac on 11/12/2016 AD.
 */

@Data
@Builder
public class Student {

    String name;
    double gpa;

    // constructor
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }


}
