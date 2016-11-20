import java.util.Arrays;
import java.util.List;

/**
 * Created by mac on 11/21/2016 AD.
 */
public class ClassroomDaoImplNep implements ClassroomDao {

    public List<Student> getStudents() {
        return Arrays.asList(new Student("Nep", 3.88),
                new Student("Khim", 3.596));
    }
}
