import java.util.Arrays;
import java.util.List;


/**
 * Created by mac on 11/21/2016 AD.
 */
public class ClassroomDaoImplJom implements ClassroomDao {

    public List<Student> getStudents() {
        return Arrays.asList(new Student("Jom", 3.749),
                new Student("Nong", 1.994),
                new Student("Bite", 3.496),
                new Student("Steven", 4.00));
    }
}
