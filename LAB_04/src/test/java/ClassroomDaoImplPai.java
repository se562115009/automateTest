import java.util.Arrays;
import java.util.List;

/**
 * Created by mac on 11/12/2016 AD.
 */
public class ClassroomDaoImplPai implements ClassroomDao {


    // check again
    public List<Student> getStudents() {
        return Arrays.asList(new Student("Pai", 3.5678));
    }
}
