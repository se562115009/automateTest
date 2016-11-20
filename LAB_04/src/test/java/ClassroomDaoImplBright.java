import java.util.Arrays;
import java.util.List;

/**
 * Created by mac on 11/21/2016 AD.
 */
public class ClassroomDaoImplBright implements ClassroomDao {

    public List<Student> getStudents() {
        return Arrays.asList(new Student("dlkasld", 2.69),
                new Student("asd", 3.78));
    }
}
