import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
/**
 * Created by mac on 11/12/2016 AD.
 */
public class TestClassroomServiceImpl {

    @Test
    // test cal total GPA from Pai data
    public void testGetTotalGPAPai() {
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        ClassroomDaoImplPai classroomDaoImplPai = new ClassroomDaoImplPai();
        classroomService.setClassroomDao(new ClassroomDaoImplPai());
        assertThat(classroomService.getTotalGPA(classroomDaoImplPai.getStudents()), is(closeTo(3.57, 0.001)));
    }
    // end test cal total GPA from Pai

    @Test
    // test cal total GPA from Aun data
    public void testGetTotalGPAAun() {
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        ClassroomDaoImplAun classroomDaoImplAun = new ClassroomDaoImplAun();
        classroomService.setClassroomDao(new ClassroomDaoImplAun());
        assertThat(classroomService.getTotalGPA(classroomDaoImplAun.getStudents()), is(closeTo(3.42, 0.001)));
    }
    // end test cal total GPA from Aun data

    @Test
    // test cal total GPA from Bright data --> 3.24
    public void testGetTotalGPABright(){
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        ClassroomDaoImplBright classroomDaoImplBright = new ClassroomDaoImplBright();
        classroomService.setClassroomDao(new ClassroomDaoImplBright());
        assertThat(classroomService.getTotalGPA(classroomDaoImplBright.getStudents()), is(closeTo(3.24, 0.001)));
    }
    // end test cal total GPA from Bright data

    @Test
    // test cal total GPA from Ex data --> 4.0
    public void testGetTotalGPAEx(){
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        ClassroomDaoImplEx classroomDaoImplEx = new ClassroomDaoImplEx();
        classroomService.setClassroomDao(new ClassroomDaoImplEx());
        assertThat(classroomService.getTotalGPA(classroomDaoImplEx.getStudents()), is(closeTo(4.0, 0.001)));

    }
    // end test cal total GPA from Ex data

    @Test
    // test cal total GPA from Fluke data --> 2.49
    public void testGetTotalGPAFluke(){
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        ClassroomDaoImplFluke classroomDaoImplFluke = new ClassroomDaoImplFluke();
        classroomService.setClassroomDao(new ClassroomDaoImplFluke());
        assertThat(classroomService.getTotalGPA(classroomDaoImplFluke.getStudents()), is(closeTo(2.49, 0.001)));

    }
    // end test cal total GPA from Fluke data

    @Test
    // test cal total GPA from Jom data --> 3.31
    public void testGetTotalGPAJom(){
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        ClassroomDaoImplJom classroomDaoImplJom = new ClassroomDaoImplJom();
        classroomService.setClassroomDao(new ClassroomDaoImplJom());
        assertThat(classroomService.getTotalGPA(classroomDaoImplJom.getStudents()), is(closeTo(3.31, 0.001)));

    }
    // end test cal total GPA from Jom data

    @Test
    // test cal total GPA from Nep data --> 3.74
    public void testGetTotalGPANep(){
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        ClassroomDaoImplNep classroomDaoImplNep = new ClassroomDaoImplNep();
        classroomService.setClassroomDao(new ClassroomDaoImplNep());
        assertThat(classroomService.getTotalGPA(classroomDaoImplNep.getStudents()), is(closeTo(3.74, 0.001)));

    }
    // end test cal total GPA from Nep data

    @Test
    // test cal total GPA from Nong data --> ???
    public void testGetTotalGPANong(){
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        ClassroomDaoImplNong classroomDaoImplNong = new ClassroomDaoImplNong();
        classroomService.setClassroomDao(new ClassroomDaoImplNong());
        assertThat(classroomService.getTotalGPA(classroomDaoImplNong.getStudents()), is(closeTo(2.45, 0.001)));

    }
    // end test cal total GPA from Nong data

    @Test
    // test cal total GPA from Nurse data --> 2.90
    public void testGetTotalGPANurse(){
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        ClassroomDaoImplNurse classroomDaoImplNurse = new ClassroomDaoImplNurse();
        classroomService.setClassroomDao(new ClassroomDaoImplNurse());
        assertThat(classroomService.getTotalGPA(classroomDaoImplNurse.getStudents()), is(closeTo(2.90, 0.001)));

    }
    // end test cal total GPA from Nurse data

    @Test
    // test cal total GPA from Oil data -->3.03
    public void testGetTotalGPAOil(){
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        ClassroomDaoImplOil classroomDaoImplOil = new ClassroomDaoImplOil();
        classroomService.setClassroomDao(new ClassroomDaoImplOil());
        assertThat(classroomService.getTotalGPA(classroomDaoImplOil.getStudents()), is(closeTo(3.03, 0.001)));

    }
    // end test cal total GPA from Oil data

    @Test
    // test cal total GPA from Toey data --> 2.84
    public void testGetTotalGPAToey(){
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        ClassroomDaoImplToey classroomDaoImplToey = new ClassroomDaoImplToey();
        classroomService.setClassroomDao(new ClassroomDaoImplToey());
        assertThat(classroomService.getTotalGPA(classroomDaoImplToey.getStudents()), is(closeTo(2.84, 0.001)));

    }
    // end test cal total GPA from Toey data
}
