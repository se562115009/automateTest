import java.util.Arrays;
import java.util.List;

/**
 * Created by mac on 11/21/2016 AD.
 */
public class ClassroomDaoImplToey implements ClassroomDao {

    public List<Student> getStudents() {
        return Arrays.asList(new Student("Toey01", 2.57),
                new Student("Toey02", 3.10));
    }
}
