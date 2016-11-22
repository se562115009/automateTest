import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.mockito.Mockito.*;

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
    // test cal total GPA from Aun data --> 3.42
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
    // test cal total GPA from Nong data --> 2.45
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


    // 22 Nov 2016
    @Test
    public void testGetTotalGPAAll(){
        // create mock object, this casre is classrommDao object
        // classrommService it will call method which has inside it to work


        ClassroomDao classroomDao = mock (ClassroomDao.class);
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        classroomService.setClassroomDao(classroomDao);

        //stub
        // when = static method

        // 1. case nep
        when(classroomDao.getStudents())
                .thenReturn(
                        Arrays.asList(
                                // lombok @Builder
                                // .buider() = try to build sth, it can swap the position of object
                                //read mock object more easier
                                Student.builder().name("Nep").gpa(3.88).build()
                                ,Student.builder().gpa(3.596).name("Khim").build()
                        )
                );
        // classroomService will call getTotalGPA() list
        assertThat(classroomService.getTotalGPA(),is(closeTo(3.74,0.001)));
        // to verfy that method called or not
        // verify the classroomDao at first time
        verify(classroomDao,times(1)).getStudents();


        // 2. case oil
        when(classroomDao.getStudents())
                .thenReturn(
                        Arrays.asList(
                                Student.builder().name("Parun").gpa(3.03).build()
                        )
                );
        assertThat(classroomService.getTotalGPA(),is(closeTo(3.03,0.001)));
        verify(classroomDao,times(2)).getStudents();

        //3. case aun
        when(classroomDao.getStudents())
                .thenReturn(
                        Arrays.asList(
                                Student.builder().name("Bom").gpa(3.25).build()
                                ,Student.builder().name("Ex").gpa(3).build()
                                ,Student.builder().name("Jo").gpa(4).build()
                        )
                );
        assertThat(classroomService.getTotalGPA(),is(closeTo(3.42,0.001)));
        verify(classroomDao,times(3)).getStudents();

        //4. case Bright
        when(classroomDao.getStudents())
                .thenReturn(
                        Arrays.asList(
                                Student.builder().name("dlkasld").gpa(2.69).build()
                                ,Student.builder().name("asd").gpa(3.78).build()
                        )
                );
        assertThat(classroomService.getTotalGPA(),is(closeTo(3.24,0.001)));
        verify(classroomDao,times(4)).getStudents();

        //5. case Ex
        when(classroomDao.getStudents())
                .thenReturn(
                        Arrays.asList(
                                Student.builder().name("Trump").gpa(4).build()
                                ,Student.builder().name("Klinton").gpa(4).build()
                                ,Student.builder().name("Aoi-sala").gpa(4).build()
                                ,Student.builder().name("Nicky").gpa(4).build()
                        )
                );
        assertThat(classroomService.getTotalGPA(),is(closeTo(4.0,0.001)));
        verify(classroomDao,times(5)).getStudents();


        //6. case fluke
        when(classroomDao.getStudents())
                .thenReturn(
                        Arrays.asList(
                                Student.builder().name("Nai A").gpa(2.34).build()
                                ,Student.builder().name("Nai B").gpa(3.43).build()
                                ,Student.builder().name("Nai C").gpa(1.7).build()
                        )
                );
        assertThat(classroomService.getTotalGPA(),is(closeTo(2.49,0.001)));
        verify(classroomDao,times(6)).getStudents();

        // 7. case Jom
        when(classroomDao.getStudents())
                .thenReturn(
                        Arrays.asList(
                                Student.builder().name("Jom").gpa(3.749).build()
                                ,Student.builder().name("Nong").gpa(1.994).build()
                                ,Student.builder().name("Bite").gpa(3.496).build()
                                ,Student.builder().name("Steven").gpa(4.00).build()
                        )
                );
        assertThat(classroomService.getTotalGPA(),is(closeTo(3.31,0.001)));
        verify(classroomDao,times(7)).getStudents();

        // 8. Nong
        when(classroomDao.getStudents())
                .thenReturn(
                        Arrays.asList(
                                Student.builder().name("Judies").gpa(2.253).build()
                                ,Student.builder().name("Juzy").gpa(3.557).build()
                                ,Student.builder().name("Pablo").gpa(1.536).build()
                        )
                );
        assertThat(classroomService.getTotalGPA(),is(closeTo(2.45,0.001)));
        verify(classroomDao,times(8)).getStudents();


        //9. case nurse
        when(classroomDao.getStudents())
                .thenReturn(
                        Arrays.asList(
                                Student.builder().name("A").gpa(3.124).build()
                                ,Student.builder().name("B").gpa(2.588).build()
                                ,Student.builder().name("C").gpa(3.00).build()
                        )
                );
        assertThat(classroomService.getTotalGPA(),is(closeTo(2.90,0.001)));
        verify(classroomDao,times(9)).getStudents();

        //10. case pai
        when(classroomDao.getStudents())
                .thenReturn(
                        Arrays.asList(
                                Student.builder().name("Pai").gpa(3.5678).build()

                        )
                );
        assertThat(classroomService.getTotalGPA(),is(closeTo(3.57,0.001)));
        verify(classroomDao,times(10)).getStudents();

        //11. toey
        when(classroomDao.getStudents())
                .thenReturn(
                        Arrays.asList(
                                Student.builder().name("Toey01").gpa(2.57).build()
                                ,Student.builder().name("Toey02").gpa(3.10).build()

                        )
                );
        assertThat(classroomService.getTotalGPA(),is(closeTo(2.84,0.001)));
        verify(classroomDao,times(11)).getStudents();
    }
}
