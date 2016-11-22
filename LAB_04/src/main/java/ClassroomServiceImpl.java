import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by mac on 11/12/2016 AD.
 */
@SuppressWarnings("ALL")
public class ClassroomServiceImpl implements ClassroomService{
    private ClassroomDao classroomDao;
    // dependency injection


    public void setClassroomDao(ClassroomDao classroomDao)
    {this.classroomDao = classroomDao;}


    // 22/11/2016 edit return getTotalGPA(classroomDao.getStudents());
    public double getTotalGPA(){
        return getTotalGPA(classroomDao.getStudents());
    }

    public double getTotalGPA(List<Student> student) {
        double sum=0;
        for (int i=0;i<student.size();i++){
            sum+=student.get(i).getGpa();
            //System.out.println(student.get(i).getGpa());
        }
        sum=sum/student.size();

        /*DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        sum = Double.valueOf(df.format(sum));*/

        DecimalFormat df = new DecimalFormat("0.0#");
        double ans=(sum*1000)%10;
        if(ans==5) {
            df.setRoundingMode(RoundingMode.UP);
        }
        sum = Double.valueOf(df.format(sum));

        System.out.println("Total GPA is: "+sum);
        return sum;
    } // end getTotalGPA list
}
