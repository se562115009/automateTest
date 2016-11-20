import java.util.Arrays;
import java.util.List;


/**
 * Created by mac on 11/21/2016 AD.
 */
public class ClassroomDaoImplEx implements ClassroomDao {

    public List<Student> getStudents() {
        return Arrays.asList(new Student("Trump", 4),
                new Student("Klinton", 4),
                new Student("Aoi-sala", 4),
                new Student("Nicky", 4));
    }
}
