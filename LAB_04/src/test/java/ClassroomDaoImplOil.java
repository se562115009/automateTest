import java.util.Arrays;
import java.util.List;

/**
 * Created by mac on 11/21/2016 AD.
 */
public class ClassroomDaoImplOil implements ClassroomDao {

    public List<Student> getStudents() {

        return Arrays.asList(new Student("Parun", 3.03));
    }
}
