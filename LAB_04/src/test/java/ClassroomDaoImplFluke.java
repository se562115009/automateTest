import java.util.Arrays;
import java.util.List;


/**
 * Created by mac on 11/21/2016 AD.
 */
public class ClassroomDaoImplFluke implements ClassroomDao {

    public List<Student> getStudents() {
        return Arrays.asList(new Student("Nai A", 2.34),
                new Student("Nai B", 3.43),
                new Student("Nai C", 1.7));
    }
}
