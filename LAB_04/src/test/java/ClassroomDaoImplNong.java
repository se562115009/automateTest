import java.util.Arrays;
import java.util.List;

/**
 * Created by mac on 11/21/2016 AD.
 */
public class ClassroomDaoImplNong implements ClassroomDao {

    public List<Student> getStudents() {
        return Arrays.asList(new Student("Judie", 2.253),
                new Student("Juzy", 3.557),
                new Student("Pablo", 1.536));
    }
}
