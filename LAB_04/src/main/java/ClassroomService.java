import java.util.List;

/**
 * Created by mac on 11/12/2016 AD.
 */
public interface ClassroomService {

    // call method in ClassroomServiceImpl
    double getTotalGPA();
    double getTotalGPA(List<Student> student);

}
