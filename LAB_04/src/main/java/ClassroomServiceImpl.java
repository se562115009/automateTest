import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 11/12/2016 AD.
 */
@SuppressWarnings("ALL")
public class ClassroomServiceImpl implements  ClassroomService{

    private ClassroomDao classroomDao;
    // dependency injection


    public void setClassroomDao(ClassroomDao classroomDao)
    {this.classroomDao = classroomDao;}


    // 22/11/2016 edit return getTotalGPA(classroomDao.getStudents());
    // getTotalGPA

    @Override

    //call getTotalGPA() which not has parameter from ClassroomService
    public double getTotalGPA() {

        //return to "public double getTotalGPA(List<Student> student)" class
        return getTotalGPA(classroomDao.getStudents());
    }

    // case null GPA not finish yet
    public double getTotalGPA(List<Student> student) {

        double totalGPA =0;

        for (int i=0;i<student.size();i++){

            totalGPA +=student.get(i).getGpa();

        }
        totalGPA= totalGPA/student.size();

        /*DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        sum = Double.valueOf(df.format(sum));*/

        DecimalFormat df = new DecimalFormat("0.0#");
        double GPA=(totalGPA*1000)%10;

        if(GPA==5) {
            df.setRoundingMode(RoundingMode.UP);
        }
        totalGPA = Double.valueOf(df.format(totalGPA));
        // System.out.println("Total GPA is: "+totalGPA);


        return totalGPA;
    } // end getTotalGPA list


    // getStudent By id
    public Student getStudent(String studentId ) {

      List<Student> students = classroomDao.getStudents();

        for (int i=0; i< students.size(); i++){
            if (students.get(i).getStudentId().equals(studentId)){

                return students.get(i);
            }
        }

        return null;
    } //end getStudent By id

    // getStudent By name
    public List<Student> getStudentByName(String name){

        List<Student> students = classroomDao.getStudents();
        List<Student> search = new ArrayList<Student>();

        for (int i=0; i < students.size(); i++){
            if (students.get(i).getName().contains(name)){
                search.add(students.get(i));
            }

        }
        if (search.size() == 0)

        { return  null;}

    return search;
     } // end getStudent By name

    // getAverage
   public double getAverageGPA () {

        List<Student> students = classroomDao.getStudents();
        double gpa=0;

        for (int i=0; i < students.size(); i++){
          gpa += students.get(i).getGpa();
        }
        double average = gpa/students.size();
        return average;}

    // 1. hw
    //create test data
    // create test code
    // submit Friday
    // 2. hw
    public List<Student> getTotalGPALowerThan (double gpa) {

        List<Student> students = classroomDao.getStudents();
        List<Student> lower = new ArrayList<Student>();

        for (int i=0; i < students.size(); i++){
            if (students.get(i).getGpa() < gpa){
                lower.add(students.get(i));
            }
        }

        if (lower.size() == 0)
        { return null; }

        else
        return lower;
     }

     // 3. hw
    public List<Student> getTotalGPAInBetween (double startGpa, double stopGpa){

        List<Student> students = classroomDao.getStudents();
        List<Student> between = new ArrayList<Student>();

        for (int i=0; i < students.size(); i++){
            if (startGpa < students.get(i).getGpa() && students.get(i).getGpa() < stopGpa){
                between.add(students.get(i));
            }
        }
        if (between.size() == 0)
        { return null; }

        else
            return between;
    }

}
