import java.util.List;

/**
 * Created by mac on 11/12/2016 AD.
 */
public interface ClassroomService {

    // call method in ClassroomServiceImpl

    double getTotalGPA();
    double getTotalGPA(List<Student> student);
    Student getStudent(String studentId);
    List<Student> getStudentByName(String name);
    double getAverageGPA ();

    List<Student> getTotalGPALowerThan (double gpa);
    List<Student> getTotalGPAInBetween (double startGpa, double stopGpa);
}
