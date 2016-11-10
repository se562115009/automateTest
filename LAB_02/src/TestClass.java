import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat; //ต้องใช้ตัวนี้เพื่อเรียก assertThat (Hamcertเวลาเลือก **)

/**
 * Created by TheNurse on 13/9/2559.
 */
public class TestClass {

    @Test
    //Method adder
    public void testDoAdd(){
        ClassUnderTest classUnderTest=new ClassUnderTest(); //ต้องประกาศคลาสที่จะใช้
        assertThat(classUnderTest.doAdd(1,1),is(2));
        assertThat(classUnderTest.doAdd(0,1),is(0));
        assertThat(classUnderTest.doAdd(-1,0),is(0));
        assertThat(classUnderTest.doAdd(-1,5),is(0));
    }
    //varag >> รับค่าได้มากๆ เป็น array

    @Test
    //array adder
    public void testDoAddArray(){
        ClassUnderTest classUnderTest=new ClassUnderTest();
        assertThat(classUnderTest.doAdd(1,2,3,4,5),is(15));
        assertThat(classUnderTest.doAdd(1,2,3,4),is(10));
        assertThat(classUnderTest.doAdd(1,2,3),is(6));
        assertThat(classUnderTest.doAdd(0,1,2),is(0));
        assertThat(classUnderTest.doAdd(-1,2,3),is(0));

    }
    @Test
    //cal_grade
    public void testCalGrade() {
        ClassUnderTest classUnderTest=new ClassUnderTest();
        assertThat(classUnderTest.calGrade(81),is("A"));
        assertThat(classUnderTest.calGrade(71),is("B"));
        assertThat(classUnderTest.calGrade(61),is("C"));
        assertThat(classUnderTest.calGrade(51),is("D"));
        assertThat(classUnderTest.calGrade(50),is("F"));
        assertThat(classUnderTest.calGrade(20.5),is("F"));
        assertThat(classUnderTest.calGrade(70.12),is("B"));
    }
    @Test
    //grade
    public void testCalGradeArray() {
        ClassUnderTest classUnderTest = new ClassUnderTest();
        assertThat(classUnderTest.calGrade(40,20,20),is("A"));
        assertThat(classUnderTest.calGrade(50,21),is("B"));
        assertThat(classUnderTest.calGrade(20,21,10,10),is("C"));
        assertThat(classUnderTest.calGrade(30,21),is("D"));
        assertThat(classUnderTest.calGrade(5,5,5),is("F"));
    //insert case
    }

    @Test
    //grade_cal
    public void testCalGradeScoreItem() {
        ClassUnderTest classUnderTest = new ClassUnderTest();
        ScoreItem scoreItem=new ScoreItem();
        /*scoreItem.setMaxScore(100);
        scoreItem.setScore(75);
        scoreItem.setName("SE495");
        assertThat(classUnderTest.calGrade(scoreItem),is("B"));*/

        scoreItem=new ScoreItem("SE101",80,100);
        assertThat(classUnderTest.calGrade(scoreItem),is("A"));
        scoreItem=new ScoreItem("SE102",60,80);
        assertThat(classUnderTest.calGrade(scoreItem),is("B"));
        scoreItem=new ScoreItem("SE201",40,60);
        assertThat(classUnderTest.calGrade(scoreItem),is("C"));
        scoreItem=new ScoreItem("SE202",25,45);
        assertThat(classUnderTest.calGrade(scoreItem),is("D"));
        scoreItem=new ScoreItem("SE301",20,50);
        assertThat(classUnderTest.calGrade(scoreItem),is("F"));


    }

    @Test
    //grade_cal
    public void testCalGradeScoreItemArray() {
        ClassUnderTest classUnderTest = new ClassUnderTest();
        ScoreItem scoreItem=new ScoreItem();
        ScoreItem scoreItem2=new ScoreItem();
        ScoreItem scoreItem3=new ScoreItem();

       /* scoreItem.setScore(55);
        scoreItem.setMaxScore(90);
        scoreItem.setName("SE495");


        scoreItem2.setScore(20);
        scoreItem2.setMaxScore(40);
        scoreItem2.setName("SE494");


        scoreItem3.setScore(80);
        scoreItem3.setMaxScore(100);
        scoreItem3.setName("SE493");*/

       // assertThat(classUnderTest.calGradeAr(scoreItem,scoreItem2),is("D"));

        //TC
        scoreItem=new ScoreItem("SE101",80,100);
        scoreItem2=new ScoreItem("SE102",60,80);
        assertThat(classUnderTest.calGrade(scoreItem,scoreItem2),is("B"));

        scoreItem=new ScoreItem("SE201",40,60);
        scoreItem2=new ScoreItem("SE202",25,45);
        scoreItem3=new ScoreItem("SE301",20,50);
        assertThat(classUnderTest.calGrade(scoreItem,scoreItem2,scoreItem3),is("D"));
    }

    @Test
    public void testCalGradeScoreItemW() {
        ClassUnderTest classUnderTest = new ClassUnderTest();
        ScoreItem scoreItem = new ScoreItem();
        ScoreItem scoreItem2 = new ScoreItem();
        scoreItem = new ScoreItem("SE101", 10, 10, 10);
        assertThat(classUnderTest.calGradeW(scoreItem), is("A"));
    }

    @Test
    public void testCalGradeScoreItemWArray() {
        ClassUnderTest classUnderTest = new ClassUnderTest();
        ScoreItem scoreItem = new ScoreItem();
        ScoreItem scoreItem2 = new ScoreItem();
        scoreItem = new ScoreItem("SE101", 10, 10, 10);
        scoreItem2 = new ScoreItem("SE102", 20, 40, 20);
        assertThat(classUnderTest.calGradeW(scoreItem, scoreItem2), is("C"));
    }
}
