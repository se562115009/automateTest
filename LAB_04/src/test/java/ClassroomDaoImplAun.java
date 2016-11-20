import java.util.Arrays;
import java.util.List;

/**
 * Created by mac on 11/21/2016 AD.
 */
public class ClassroomDaoImplAun implements ClassroomDao {

    // three objects
    public List<Student> getStudents(){
        return Arrays.asList(new Student("Bom",3.25),
                new Student("Ex",3),
                new Student("Jo",4));
    }
}
