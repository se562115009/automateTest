import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by mac on 11/23/2016 AD.
 */
public class TestClassroomServiceImplLap051 {

    ClassroomServiceImpl classroomService;
    @Before
    public void setup(){
        ClassroomDao classroomDao = mock(ClassroomDao.class);
        classroomService = new ClassroomServiceImpl();
        classroomService.setClassroomDao(classroomDao);
        when(classroomDao.getStudents())
                .thenReturn(Arrays.asList(
                        Student.builder().name("Punjasin Punya").studentId("552155039").gpa(4.0).build(),
                        Student.builder().name("Phongsatorn Paewsoongnern").studentId("552155045").gpa(4.0).build(),
                        Student.builder().name("Visava Chumnuam").studentId("552155068").gpa(4.0).build(),

                        Student.builder().name("Pichet okok").studentId("55555555").gpa(4.0).build(),
                        Student.builder().name(" Victor notokay").studentId("55588899").gpa(4.0).build(),
                        Student.builder().name("Wilson J. ok").studentId("99999999").gpa(0.44).build(),
                        Student.builder().name("Captain Fantastic Faster Than Superman Spiderman Batman Wolverine Hulk And The Flash Combined").studentId("44444444").gpa(4.01).build(),

                        //Nurse
                        Student.builder().name("Nurse").studentId("562115028").gpa(2.90).build(),
                        Student.builder().name("N").studentId("562115000").gpa(3.20).build(),
                        Student.builder().name("Toey").studentId("562115555").gpa(2.50).build(),

                        Student.builder().name("Aun").studentId("542115020").gpa(3.53).build(),
                        Student.builder().name("Max").studentId("542115017").gpa(3.75).build(),
                        Student.builder().name("Tee").studentId("542115015").gpa(4.00).build(),
                        Student.builder().name("Ex").studentId("542115041").gpa(4.00).build(),

                        //Film
                        Student.builder().name("Film").studentId("562115062").gpa(3.00).build(),
                        Student.builder().name("Fufu").studentId("562115063").gpa(2.78).build(),
                        Student.builder().name("Fofo").studentId("562115064").gpa(3.75).build(),

                        Student.builder().name("TA").studentId("562115038").gpa(2.50).build(),
                        Student.builder().name("TB").studentId("552115038").gpa(3.50).build(),
                        Student.builder().name("TC").studentId("542115038").gpa(3.55).build(),

                        //Bitee
                        Student.builder().name("Hello").studentId("562115999").gpa(3.55).build(),
                        Student.builder().name("It's me").studentId("562115998").gpa(4.00).build(),
                        Student.builder().name("Bla bla").studentId("562115997").gpa(2.98).build(),

                        Student.builder().name("Nep").studentId("562115036").gpa(3.88).build(),
                        Student.builder().name("A").studentId("562115150").gpa(2.69).build(),
                        Student.builder().name("B").studentId("52115126").gpa(2.69).build(),

                        //Jom
                        Student.builder().name("Jom").studentId("562115006").gpa(2.03).build(),
                        Student.builder().name("Nong").studentId("562115047").gpa(2.15).build(),
                        Student.builder().name("Bite").studentId("562115155").gpa(3.00).build(),

                        Student.builder().name("Gig").studentId("562115555").gpa(1.04).build(),
                        Student.builder().name("Gok").studentId("562116666").gpa(1.94).build(),
                        Student.builder().name("Jung").studentId("562117777").gpa(0.56).build(),

                        //Oil
                        Student.builder().name("Oil").studentId("522115043").gpa(3.33).build(),
                        Student.builder().name("Wa").studentId("522115044").gpa(2.22).build(),
                        Student.builder().name("Bom").studentId("522115045").gpa(1.11).build(),

                        //Pai
                        Student.builder().name("Pai").studentId("562115009").gpa(3.24).build(),
                        Student.builder().name("TokTak").studentId("562115010").gpa(3.89).build()

                ));
    }

    @Test

    public void testGetgetTotalGPALowerThan(){

        List<Student> students = classroomService.getTotalGPALowerThan(1.00);
        assertThat(students.size(), is(2));
        assertThat(students,hasSize(2));

        assertThat(students, hasItems(Student.builder().name("Wilson J. ok").studentId("99999999").gpa(0.44).build(),
                Student.builder().name("Jung").studentId("562117777").gpa(0.56).build() ));

        assertThat(classroomService.getTotalGPALowerThan(0.1), is(nullValue()));
    }

@Test
    public void testgetTotalGPAInBetween(){

        List<Student> students = classroomService.getTotalGPAInBetween(2.99, 3.25);
        assertThat(students.size(), is(4));
        assertThat(students,hasSize(4));

        assertThat(students, hasItems(Student.builder().name("Film").studentId("562115062").gpa(3.00).build(),
                Student.builder().name("Bite").studentId("562115155").gpa(3.00).build(),
                Student.builder().name("N").studentId("562115000").gpa(3.20).build(),
                Student.builder().name("Pai").studentId("562115009").gpa(3.24).build() ));

        assertThat(classroomService.getTotalGPAInBetween(3.60, 3.70), is(nullValue()));
}


}
