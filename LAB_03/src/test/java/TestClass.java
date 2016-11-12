import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mac on 11/9/2016 AD.
 */

public class TestClass {

    @Test
    // test doAdd method with int a + int b, if a, b <0 the expected is 0
    public void testDoAdd(){
        ClassUnderTest classUnderTest = new ClassUnderTest();
        assertThat(classUnderTest.doAdd(10,10), is(20));
        assertThat(classUnderTest.doAdd(0,100), is(0));
        assertThat(classUnderTest.doAdd(0,-10), is(0));
        assertThat(classUnderTest.doAdd(-10,-10), is(0));
    }

    @Test
    // test doAdd *Array method with int a + int b, if a, b <0 the expected is 0
    public void testDoAddArray(){
        ClassUnderTest classUnderTest = new ClassUnderTest();
        assertThat(classUnderTest.doAdd(1,2,3,4,5), is(15));
        assertThat(classUnderTest.doAdd(10,100,1000), is(1110));
        assertThat(classUnderTest.doAdd(0,1,2,3,4), is(0));
        assertThat(classUnderTest.doAdd(-1,-2,-3,-4), is(0));
    }

    @Test
    // test cal grade
    public void testCalGrade(){
        ClassUnderTest classUnderTest = new ClassUnderTest();
        assertThat(classUnderTest.calGrade(85), is("A"));
        assertThat(classUnderTest.calGrade(80), is("A"));
        assertThat(classUnderTest.calGrade(79), is("B"));
        assertThat(classUnderTest.calGrade(70.001), is("B"));
        assertThat(classUnderTest.calGrade(69.9), is("C"));
        assertThat(classUnderTest.calGrade(60), is("C"));
        assertThat(classUnderTest.calGrade(58), is("D"));
        assertThat(classUnderTest.calGrade(50), is("D"));
        assertThat(classUnderTest.calGrade(45), is("F"));
    }

    @Test
    // test cal grade Array
    public void testCalGradeArray(){
        ClassUnderTest classUnderTest = new ClassUnderTest();

        assertThat(classUnderTest.calGrade(45,35,10), is("A"));
        assertThat(classUnderTest.calGrade(30,20,10,5,5,7), is("B"));
        assertThat(classUnderTest.calGrade(10.3345,10.243,10.132,10.001,10.000001,10.2), is("C"));
        assertThat(classUnderTest.calGrade(49,1.99999999975), is("D"));
        assertThat(classUnderTest.calGrade(1,2,3), is("F"));
    }

    @Test
    // test cal grade by score item
    public void testCalGradeScoreItem(){
        ClassUnderTest classUnderTest = new ClassUnderTest();
        ScoreItem scoreItem = new ScoreItem();

      //  Type 1
        scoreItem = new ScoreItem("AAA", 85,90);
        assertThat(classUnderTest.calGrade(scoreItem), is("A"));

        scoreItem = new ScoreItem("BBB", 75, 100);
        assertThat(classUnderTest.calGrade(scoreItem), is("B"));

        scoreItem = new ScoreItem("CCC", 60, 95);
        assertThat(classUnderTest.calGrade(scoreItem), is("C"));

        // Type 2
        ScoreItem scoreItem1 = new ScoreItem();
        scoreItem1.setName("DDD");
        scoreItem1.setScore(45);
        scoreItem1.setMaxScore(80);
        assertThat(classUnderTest.calGrade(scoreItem1), is("D"));

        ScoreItem scoreItem2 = new ScoreItem();
        scoreItem2.setName("FFF");
        scoreItem2.setScore(25);
        scoreItem2.setMaxScore(80);
        assertThat(classUnderTest.calGrade(scoreItem2), is("F"));
    }

    @Test
    // test cal grade by score item array
    public void testCalGradeScoreItemArray(){
        ClassUnderTest classUnderTest = new ClassUnderTest();
        ScoreItem scoreItem = new ScoreItem();
        ScoreItem scoreItem1 = new ScoreItem();
        ScoreItem scoreItem2 = new ScoreItem();
        ScoreItem scoreItem3 = new ScoreItem();

        scoreItem = new ScoreItem("AAA", 89.9, 90);
        scoreItem1 = new ScoreItem("AA", 58.5, 60);
        scoreItem2 = new ScoreItem("A", 99, 100);
        assertThat(classUnderTest.calGrade(scoreItem,scoreItem1,scoreItem2), is("A"));

        scoreItem = new ScoreItem("BBB", 79, 100);
        assertThat(classUnderTest.calGrade(scoreItem), is("B"));

        scoreItem2 = new ScoreItem("CCC", 69, 100);
        scoreItem3 = new ScoreItem("CC", 30, 50);
        assertThat(classUnderTest.calGrade(scoreItem2,scoreItem3), is("C"));

        scoreItem = new ScoreItem("D1", 20, 50);
        scoreItem1 = new ScoreItem("D2", 30, 60);
        scoreItem2 = new ScoreItem("D3", 45, 75);
        scoreItem3 = new ScoreItem("D4", 55, 85);
        assertThat(classUnderTest.calGrade(scoreItem,scoreItem1,scoreItem2,scoreItem3), is("D"));

        // Or another way
        scoreItem.setName("F1");
        scoreItem.setScore(40);
        scoreItem.setMaxScore(100);

        scoreItem1.setName("F2");
        scoreItem1.setScore(50);
        scoreItem1.setMaxScore(110);

        assertThat(classUnderTest.calGrade(scoreItem,scoreItem1), is("F"));
    }

    @Test
    // test cal grade by score item with Weight
    public void  testCalGradeByWeightScoreItems(){
        ClassUnderTest classUnderTest = new ClassUnderTest();
        ScoreItem scoreItem = new ScoreItem();

        scoreItem = new ScoreItem("AAA", 99, 101, 2);
        assertThat(classUnderTest.calGradeByWeight(scoreItem), is("A"));
        scoreItem = new ScoreItem("BBB", 83, 105, 1);
        assertThat(classUnderTest.calGradeByWeight(scoreItem), is("B"));
        scoreItem = new ScoreItem("CCC", 19, 30, 5);
        assertThat(classUnderTest.calGradeByWeight(scoreItem), is("C"));
        scoreItem = new ScoreItem("DDD", 27, 50, 3);
        assertThat(classUnderTest.calGradeByWeight(scoreItem), is("D"));
        scoreItem = new ScoreItem("FFF", 20, 89, 4);
        assertThat(classUnderTest.calGradeByWeight(scoreItem), is("F"));
    }

    @Test
    // test cal grade Array by score item with Weight
    public void testCalGradeByWeightScoreItemsArray(){
        ClassUnderTest classUnderTest = new ClassUnderTest();
        ScoreItem scoreItem = new ScoreItem();
        ScoreItem scoreItem1 = new ScoreItem();
        ScoreItem scoreItem2 = new ScoreItem();

        scoreItem = new ScoreItem("AAA", 81, 100, 3);
        scoreItem1 = new ScoreItem("AA", 91, 100, 2);
        assertThat(classUnderTest.calGradeByWeight(scoreItem,scoreItem1), is("A"));

        scoreItem1 = new ScoreItem("BB", 75, 102, 1);
        scoreItem2 = new ScoreItem("B", 65, 92, 2);
        assertThat(classUnderTest.calGradeByWeight(scoreItem1,scoreItem2), is("B"));

        scoreItem = new ScoreItem("C1", 6, 10, 1);
        scoreItem2 = new ScoreItem("C2", 18, 30, 2);
        assertThat(classUnderTest.calGradeByWeight(scoreItem,scoreItem2), is("C"));

        scoreItem2 = new ScoreItem("DDD", 53, 91, 4);
        scoreItem1 = new ScoreItem("DD", 34, 60, 2);
        assertThat(classUnderTest.calGradeByWeight(scoreItem2,scoreItem1), is("D"));

        scoreItem = new ScoreItem("F1", 1, 5, 1);
        scoreItem1 = new ScoreItem("F2", 10, 45, 3);
        scoreItem2 = new ScoreItem("F3", 45, 111, 5);
        assertThat(classUnderTest.calGradeByWeight(scoreItem,scoreItem1,scoreItem2), is("F"));
    }

    @Test
    // test cal grade Array by sum Propotional = 100
    public void testCalGradeByPropotionArray(){
        ClassUnderTest classUnderTest = new ClassUnderTest();
        assertThat(classUnderTest.calGradeByPropotion(
                new PropotionalScoreItem(new ScoreItem("AAA", 85, 100), 30),
                new PropotionalScoreItem(new ScoreItem("AA", 71, 80), 40),
                new PropotionalScoreItem(new ScoreItem("A", 55, 62), 30))
        , is("A"));

        assertThat(classUnderTest.calGradeByPropotion(
                new PropotionalScoreItem(new ScoreItem("B1", 77, 101), 30),
                new PropotionalScoreItem(new ScoreItem("B2", 17, 25), 60),
                new PropotionalScoreItem(new ScoreItem("B3", 27, 35), 10))
        , is("B"));

        assertThat(classUnderTest.calGradeByPropotion(
                new PropotionalScoreItem(new ScoreItem("C1", 30, 50), 50),
                new PropotionalScoreItem(new ScoreItem("C2", 65, 100), 50))
        , is("C"));

        assertThat(classUnderTest.calGradeByPropotion(
                new PropotionalScoreItem(new ScoreItem("D1", 40, 70), 40),
                new PropotionalScoreItem(new ScoreItem("D2", 50, 110),60))
        , is("D"));

        assertThat(classUnderTest.calGradeByPropotion(
                new PropotionalScoreItem(new ScoreItem("F1", 40, 100),25),
                new PropotionalScoreItem(new ScoreItem("F2", 10, 50), 25),
                new PropotionalScoreItem(new ScoreItem("F3", 15, 65), 25),
                new PropotionalScoreItem(new ScoreItem("F4", 80, 170), 25))
        , is("F"));

    }

    @Test(expected = CalGradeError.class)
    // test cal grade Array by sum Propotional != 100 MUST Throw error
    public void testCalGradeByPropotionArrayThrowError(){

        ClassUnderTest classUnderTest = new ClassUnderTest();
        assertThat(classUnderTest.calGradeByPropotion(
                new PropotionalScoreItem(new ScoreItem("AAA", 85, 100), 35),
                new PropotionalScoreItem(new ScoreItem("AA", 71, 80), 45),
                new PropotionalScoreItem(new ScoreItem("A", 55, 62), 35))
                , is("A"));

        assertThat(classUnderTest.calGradeByPropotion(
                new PropotionalScoreItem(new ScoreItem("B1", 77, 101), 31),
                new PropotionalScoreItem(new ScoreItem("B2", 17, 25), 61),
                new PropotionalScoreItem(new ScoreItem("B3", 27, 35), 11))
                , is("B"));

        assertThat(classUnderTest.calGradeByPropotion(
                new PropotionalScoreItem(new ScoreItem("C1", 30, 50), 60),
                new PropotionalScoreItem(new ScoreItem("C2", 65, 100), 51))
                , is("C"));

        assertThat(classUnderTest.calGradeByPropotion(
                new PropotionalScoreItem(new ScoreItem("D1", 40, 70), 41),
                new PropotionalScoreItem(new ScoreItem("D2", 50, 110),63))
                , is("D"));

        assertThat(classUnderTest.calGradeByPropotion(
                new PropotionalScoreItem(new ScoreItem("F1", 40, 100),25),
                new PropotionalScoreItem(new ScoreItem("F2", 10, 50), 26),
                new PropotionalScoreItem(new ScoreItem("F3", 15, 65), 27),
                new PropotionalScoreItem(new ScoreItem("F4", 80, 170), 28))
                , is("F"));


    }

}
