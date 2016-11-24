import org.junit.Test;

import java.util.Arrays;
import java.util.List;


import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;


/**
 * Created by mac on 11/23/2016 AD.
 * LAB_05: mock object
 */

public class TestClassroomServiceLab05 {

    // create classroomService first
    // example from Aj.
    @Test
    public void testGetStudent(){
        ClassroomDao classroomDao = mock(ClassroomDao.class);


        when(classroomDao.getStudents())
                .thenReturn(Arrays.asList(
                        Student.builder().name("Pichet").studentId("542115041").gpa(4.00).build()
                ));

        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        classroomService.setClassroomDao(classroomDao);

        assertThat(classroomService.getStudent("542115041"),
                is( Student.builder().name("Pichet").studentId("542115041").gpa(4.00).build()
         ));
        assertThat(classroomService.getStudent("562115009"), is(nullValue()));
    }

    @Test
    // test GetStudent, my case
    public void testGetStudent1(){

        // build data same as in database, follow data for testing in document
        ClassroomDao classroomDao = mock(ClassroomDao.class);
        when(classroomDao.getStudents())
                .thenReturn(Arrays.asList(
                        Student.builder().name("Chanakan").studentId("562115009").gpa(3.24).build(),
                        Student.builder().name("Toktak").studentId("562115010").gpa(3.89).build()

                ));
        // end mock object

        // test case follow doc
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        //classroomSerivce --> classroomServiceImpl --call data-> classroomDao
        classroomService.setClassroomDao(classroomDao);

        // if input existed student id in db, it will return student object (all data in that object will be shown) follow design
        assertThat(classroomService.getStudent("562115009"),
                is( Student.builder().name("Chanakan").studentId("562115009").gpa(3.24).build()
        ));
        // if input not existed student id in db, it will return null
        assertThat(classroomService.getStudent("542115010"),
                is(nullValue()));
    } // end test GetStudent, my case


    @Test
    // test GetStudentByPartialName, example from Aj.
    public void testGetStudentName(){

        ClassroomDao classroomDao = mock(ClassroomDao.class);
        when(classroomDao.getStudents())
                .thenReturn(Arrays.asList(
                        //pai
                        Student.builder().name("Pai").studentId("562115009").gpa(3.24).build()
                        ,Student.builder().name("TokTak").studentId("562115010").gpa(3.89).build()

                        // fluke
                        ,Student.builder().name("Punjasin Punya").studentId("552155039").gpa(4.0).build()
                        ,Student.builder().name("Phongsatorn Paewsoongnern").studentId("552155045").gpa(4.0).build()
                        ,Student.builder().name("Visava Chumnuam").studentId("552155068").gpa(4.0).build()

                        // ex
                        ,Student.builder().name("Pichet okok").studentId("55555555").gpa(4.0).build()
                        ,Student.builder().name("Victor notokay").studentId("55588899").gpa(4.0).build()
                        ,Student.builder().name("Wilson J. ok").studentId("99999999").gpa(0.44).build()
                        ,Student.builder().name("Captain Fantastic Faster Than Superman Spiderman Batman Wolverine Hulk And The Flash Combined").studentId("44444444").gpa(4.01).build()

                        //nurse
                        ,Student.builder().name("Nurse").studentId("562115028").gpa(2.90).build()
                        ,Student.builder().name("N").studentId("562115000").gpa(3.20).build()
                        ,Student.builder().name("Toey").studentId("562115555").gpa(2.50).build()

                        //aun
                        ,Student.builder().name("Aun").studentId("542115020").gpa(3.53).build()
                        ,Student.builder().name("Max").studentId("542115017").gpa(3.75).build()
                        ,Student.builder().name("Tee").studentId("542115015").gpa(4.00).build()
                        ,Student.builder().name("Ex").studentId("542115041").gpa(4.00).build()

                        //flim
                        ,Student.builder().name("Film").studentId("562115062").gpa(3.00).build()
                        ,Student.builder().name("Fufu").studentId("562115063").gpa(2.78).build()
                        ,Student.builder().name("Fofo").studentId("562115064").gpa(3.75).build()

                        //toey
                        ,Student.builder().name("TA").studentId("562115038").gpa(2.50).build()
                        ,Student.builder().name("TB").studentId("552115038").gpa(3.50).build()
                        ,Student.builder().name("TC").studentId("542115038").gpa(3.55).build()

                        //bright
                        ,Student.builder().name("Hello").studentId("562115999").gpa(3.55).build()
                        ,Student.builder().name("It's me").studentId("562115998").gpa(4.00).build()
                        ,Student.builder().name("Bla bla").studentId("562115997").gpa(2.98).build()

                        //nep
                        ,Student.builder().name("Nep").studentId("562115036").gpa(3.88).build()
                        ,Student.builder().name("A").studentId("562115150").gpa(2.69).build()
                        ,Student.builder().name("B").studentId("52115126").gpa(2.69).build()

                        //jom
                        ,Student.builder().name("Jom").studentId("562115006").gpa(2.03).build()
                        ,Student.builder().name("Nong").studentId("562115047").gpa(2.15).build()
                        ,Student.builder().name("Bite").studentId("562115155").gpa(3.00).build()

                        //nong
                        ,Student.builder().name("Gig").studentId("562115555").gpa(1.04).build()
                        ,Student.builder().name("Gok").studentId("562116666").gpa(1.94).build()
                        ,Student.builder().name("Jung").studentId("562117777").gpa(0.56).build()

                        //oil
                        ,Student.builder().name("Oil").studentId("522115043").gpa(3.33).build()
                        ,Student.builder().name("Wa").studentId("522115044").gpa(2.22).build()
                        ,Student.builder().name("Bom").studentId("522115045").gpa(1.11).build()

                        ));

        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        classroomService.setClassroomDao(classroomDao);

        List<Student> students = classroomService.getStudentByName("W");

        assertThat(students.size(), is(3));
        assertThat(students,hasSize(3));
        // hasItem = check only this item
        assertThat(students,hasItem(Student.builder().name("Wa").studentId("522115044").gpa(2.22).build()
        ));
        // hasItems = more than one items
        assertThat(students,hasItems(
                Student.builder().name("Wilson J. ok").studentId("99999999").gpa(0.44).build(),
                Student.builder().name("Captain Fantastic Faster Than Superman Spiderman Batman Wolverine Hulk And The Flash Combined").studentId("44444444").gpa(4.01).build()
        ));


    } // end test GetStudentByPartialName, example from Aj.

    @Test
    // test GetStudentByPartialName, my case
    public void testGetStudentNameByPai(){

        ClassroomDao classroomDao = mock(ClassroomDao.class);
        when(classroomDao.getStudents())
                .thenReturn(Arrays.asList(
                        //pai
                        Student.builder().name("Pai").studentId("562115009").gpa(3.24).build()
                        ,Student.builder().name("TokTak").studentId("562115010").gpa(3.89).build()

                        // fluke
                        ,Student.builder().name("Punjasin Punya").studentId("552155039").gpa(4.0).build()
                        ,Student.builder().name("Phongsatorn Paewsoongnern").studentId("552155045").gpa(4.0).build()
                        ,Student.builder().name("Visava Chumnuam").studentId("552155068").gpa(4.0).build()

                        // ex
                        ,Student.builder().name("Pichet okok").studentId("55555555").gpa(4.0).build()
                        ,Student.builder().name("Victor notokay").studentId("55588899").gpa(4.0).build()
                        ,Student.builder().name("Wilson J. ok").studentId("99999999").gpa(0.44).build()
                        ,Student.builder().name("Captain Fantastic Faster Than Superman Spiderman Batman Wolverine Hulk And The Flash Combined").studentId("44444444").gpa(4.01).build()

                        //nurse
                        ,Student.builder().name("Nurse").studentId("562115028").gpa(2.90).build()
                        ,Student.builder().name("N").studentId("562115000").gpa(3.20).build()
                        ,Student.builder().name("Toey").studentId("562115555").gpa(2.50).build()

                        //aun
                        ,Student.builder().name("Aun").studentId("542115020").gpa(3.53).build()
                        ,Student.builder().name("Max").studentId("542115017").gpa(3.75).build()
                        ,Student.builder().name("Tee").studentId("542115015").gpa(4.00).build()
                        ,Student.builder().name("Ex").studentId("542115041").gpa(4.00).build()

                        //flim
                        ,Student.builder().name("Film").studentId("562115062").gpa(3.00).build()
                        ,Student.builder().name("Fufu").studentId("562115063").gpa(2.78).build()
                        ,Student.builder().name("Fofo").studentId("562115064").gpa(3.75).build()

                        //toey
                        ,Student.builder().name("TA").studentId("562115038").gpa(2.50).build()
                        ,Student.builder().name("TB").studentId("552115038").gpa(3.50).build()
                        ,Student.builder().name("TC").studentId("542115038").gpa(3.55).build()

                        //bright
                        ,Student.builder().name("Hello").studentId("562115999").gpa(3.55).build()
                        ,Student.builder().name("It's me").studentId("562115998").gpa(4.00).build()
                        ,Student.builder().name("Bla bla").studentId("562115997").gpa(2.98).build()

                        //nep
                        ,Student.builder().name("Nep").studentId("562115036").gpa(3.88).build()
                        ,Student.builder().name("A").studentId("562115150").gpa(2.69).build()
                        ,Student.builder().name("B").studentId("52115126").gpa(2.69).build()

                        //jom
                        ,Student.builder().name("Jom").studentId("562115006").gpa(2.03).build()
                        ,Student.builder().name("Nong").studentId("562115047").gpa(2.15).build()
                        ,Student.builder().name("Bite").studentId("562115155").gpa(3.00).build()

                        //nong
                        ,Student.builder().name("Gig").studentId("562115555").gpa(1.04).build()
                        ,Student.builder().name("Gok").studentId("562116666").gpa(1.94).build()
                        ,Student.builder().name("Jung").studentId("562117777").gpa(0.56).build()

                        //oil
                        ,Student.builder().name("Oil").studentId("522115043").gpa(3.33).build()
                        ,Student.builder().name("Wa").studentId("522115044").gpa(2.22).build()
                        ,Student.builder().name("Bom").studentId("522115045").gpa(1.11).build()

                ));

        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        classroomService.setClassroomDao(classroomDao);

        // case ที่มี item นั้นๆ
        List<Student> students = classroomService.getStudentByName("y");
        assertThat(students.size(), is(3));
        assertThat(students,hasSize(3));

        // hasItems = more than one items
        assertThat(students,hasItems(Student.builder().name("Victor notokay").studentId("55588899").gpa(4.0).build(),
                Student.builder().name("Toey").studentId("562115555").gpa(2.50).build(),
                Student.builder().name("Punjasin Punya").studentId("552155039").gpa(4.0).build()
        ));

        // case null
        // assertThat(student,isnullValue) --> for case null เพิ่มเคสที่ไม่มี ตัสนั้นๆๆ ให้ return null
      //  List<Student> students_null = classroomService.getStudentByName("z");
       // assertThat(students_null.size(), is(0));
      //  assertThat(students_null,hasSize(0));

       // assertThat(classroomService.getStudent("562115009"), is(nullValue()));
        assertThat(classroomService.getStudentByName("z"), is(nullValue()));
    }


    //@Test
    // mock can use for test other mock case
    // public void testGetTotalGPAPai(){

    //ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
    // classroomService.setClassroomDao(new ClassroomDaoImplPai());
    //   assertThat(classroomService.getTotalGPA(), is(closeTo(3.57, 0.001)));

   // }

   @Test

   // test GetTotalGPA
    public void testGetTotalGPAAll(){

       ClassroomDao classroomDao = mock(ClassroomDao.class);
       ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
       classroomService.setClassroomDao(classroomDao);

       when(classroomDao.getStudents())
               .thenReturn(
                       Arrays.asList(
                               Student.builder().name("Nep").gpa(3.88).build()
                               ,Student.builder().name("Khim").gpa(3.596).build()
                       )
               );
       assertThat(classroomService.getTotalGPA(),is(closeTo(3.74,0.001)));
       verify(classroomDao,times(1)).getStudents();
       when(classroomDao.getStudents())
               .thenReturn(
                       Arrays.asList(
                               Student.builder().name("Parun").gpa(3.03).build()
                       )
               );
       assertThat(classroomService.getTotalGPA(),is(closeTo(3.03,0.001)));
   } // end test GetTotalGPA

    @Test
    public void testGetAverageGPA(){
//        Student.builder().name("Oil").studentId("522115043").gpa(3.33).build(),
//                Student.builder().name("Wa").studentId("522115044").gpa(2.22).build(),
//                Student.builder().name("Bom").studentId("522115045").gpa(1.11).build(),
        ClassroomDao classroomDao = mock(ClassroomDao.class);
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl();
        classroomService.setClassroomDao(classroomDao);
        List<Student> students = mock(List.class);
        when(classroomDao.getStudents()).thenReturn(students);
        when(students.size()).thenReturn(3);
        when(students.get(0)).thenReturn(Student.builder().gpa(3.33).build());
        when(students.get(1)).thenReturn(Student.builder().gpa(2.22).build());
        when(students.get(2)).thenReturn(Student.builder().gpa(1.11).build());

        assertThat(classroomService.getAverageGPA(),is(closeTo(2.22,0.001)));


    }
    }



