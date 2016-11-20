import java.util.Arrays;
import java.util.List;

/**
 * Created by mac on 11/21/2016 AD.
 */
public class ClassroomDaoImplNurse implements ClassroomDao {

    public List<Student> getStudents() {
        return Arrays.asList(new Student("A", 3.124),
                new Student("B", 2.588),
                new Student("C", 3.00));
    }
}
