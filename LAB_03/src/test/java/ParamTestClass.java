import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class ParamTestClass {

    @Test
    @Parameters({"1,1|2", "0,1|0", "-1,0|0", "-1,5|0"})

    public void testDoAdd(int a, int b, int result) {
        ClassUnderTest classUnderTest = new ClassUnderTest();
        assertThat(classUnderTest.doAdd(a, b), is(result));
    }

    @Test
    @Parameters(method = "doAddItem")


    public void testDoAddArray(int[] list, int result) {
        ClassUnderTest classUnderTest = new ClassUnderTest();
        assertThat(classUnderTest.doAdd(list), is(result));
    }

    private Object[][] doAddItem() {
        return new Object[][]{
                // list of items and result
                {new int[]{1, 2, 3, 4, 5}, 15},
                {new int[]{1, 2, 3, 4}, 10},
                {new int[]{1, 2, 3}, 6},
                {new int[]{0, 1, 2}, 0},
                {new int[]{-1, 2, 3}, 0}
        };
    }

    @Test
    @Parameters({"81|A", "75|B", "67|C", "55|D", "49|F"})

    public void testCalGrade(double score, String grade) {
        ClassUnderTest classUnderTest = new ClassUnderTest();
        assertThat(classUnderTest.calGrade(score), is(grade));
    }

    @Test
    @TestCaseName("[{index}] {method} : {params}")
    @Parameters(method = "propotionalScoreItemsParameter")

    public void testCalGradeWithPropotionScoreItems(Object[] listScore, String grade) {
        ClassUnderTest classUnderTest = new ClassUnderTest();
        assertThat(classUnderTest.calGradeByPropotion((PropotionalScoreItem[]) listScore), is(grade));
    }

    // data for test --> "testCalGradeWithPropotionScoreItems"
    private Object[][] propotionalScoreItemsParameter() {
        return new Object[][]{
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE202", 20, 100), 50),
                        new PropotionalScoreItem(new ScoreItem("SE495", 40, 200), 30),
                        new PropotionalScoreItem(new ScoreItem("SE499", 10, 50), 20)
                }, "F"},
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE494", 55, 100), 40),
                        new PropotionalScoreItem(new ScoreItem("SE495", 30, 60), 40),
                        new PropotionalScoreItem(new ScoreItem("SE496", 27, 40), 20)
                }, "D"},
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE321", 65, 105), 20),
                        new PropotionalScoreItem(new ScoreItem("SE322", 68, 100), 60),
                        new PropotionalScoreItem(new ScoreItem("SE323", 66, 95), 20)
                }, "C"},
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE101", 75, 100), 40),
                        new PropotionalScoreItem(new ScoreItem("SE102", 81, 110), 40),
                        new PropotionalScoreItem(new ScoreItem("SE103", 30, 40), 20)
                }, "B"},
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE303", 30, 35), 30),
                        new PropotionalScoreItem(new ScoreItem("SE304", 85, 100), 40),
                        new PropotionalScoreItem(new ScoreItem("SE305", 45, 50), 30),

                }, "A"}
        };
    } // end data for test --> "testCalGradeWithPropotionScoreItems"


    @Test (expected = CalGradeError.class) // use to check error if propotional > 100 it will error
    @TestCaseName("[{index}] {method} : {params}")
    @Parameters(method = "propotionalScoreItemsParameterError")

    public void testCalGradeWithPropotionScoreItemsError(Object[] listScore, String grade) {
        ClassUnderTest classUnderTest = new ClassUnderTest();
        assertThat(classUnderTest.calGradeByPropotion((PropotionalScoreItem[]) listScore), is(grade));
    }

    // data for test --> "testCalGradeWithPropotionScoreItemsError"
    private Object[][] propotionalScoreItemsParameterError() {
        return new Object[][]{
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE202", 20, 100), 500),
                        new PropotionalScoreItem(new ScoreItem("SE495", 40, 200), 30),
                        new PropotionalScoreItem(new ScoreItem("SE499", 10, 50), 30)
                }, "F"},
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE494", 55, 100), 400),
                        new PropotionalScoreItem(new ScoreItem("SE495", 30, 60), 400),
                        new PropotionalScoreItem(new ScoreItem("SE496", 27, 40), 200)
                }, "D"},
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE321", 65, 105), 200),
                        new PropotionalScoreItem(new ScoreItem("SE322", 68, 100), 600),
                        new PropotionalScoreItem(new ScoreItem("SE323", 66, 95), 200)
                }, "C"},
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE101", 75, 100), 400),
                        new PropotionalScoreItem(new ScoreItem("SE102", 81, 110), 400),
                        new PropotionalScoreItem(new ScoreItem("SE103", 30, 40), 200)
                }, "B"},
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE303", 30, 35), 300),
                        new PropotionalScoreItem(new ScoreItem("SE304", 85, 100), 400),
                        new PropotionalScoreItem(new ScoreItem("SE305", 45, 50), 300),

                }, "A"}
        };
    } // end data for test --> "testCalGradeWithPropotionScoreItemsError"


    // use "parameterFor"....(Class which need to test).....
    // also can test
    @Test
    @TestCaseName("[{index}] {method} : {params}")
    @Parameters

    public void testCalGradeWithPropotionScoreItemsWithParamFor(Object[] listScore, String grade) {
        ClassUnderTest classUnderTest = new ClassUnderTest();
        assertThat(classUnderTest.calGradeByPropotion((PropotionalScoreItem[]) listScore), is(grade));
    }
    // data for test --> "testCalGradeWithPropotionScoreItemsWithParamFor"
    private Object[][] parameterForTestCalGradeWithPropotionScoreItemsWithParamFor() {
        return new Object[][]{
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE202", 20, 100), 50),
                        new PropotionalScoreItem(new ScoreItem("SE495", 40, 200), 30),
                        new PropotionalScoreItem(new ScoreItem("SE499", 10, 50), 20)
                }, "F"},
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE494", 55, 100), 40),
                        new PropotionalScoreItem(new ScoreItem("SE495", 30, 60), 40),
                        new PropotionalScoreItem(new ScoreItem("SE496", 27, 40), 20)
                }, "D"},
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE321", 65, 105), 20),
                        new PropotionalScoreItem(new ScoreItem("SE322", 68, 100), 60),
                        new PropotionalScoreItem(new ScoreItem("SE323", 66, 95), 20)
                }, "C"},
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE101", 75, 100), 40),
                        new PropotionalScoreItem(new ScoreItem("SE102", 81, 110), 40),
                        new PropotionalScoreItem(new ScoreItem("SE103", 30, 40), 20)
                }, "B"},
                {new PropotionalScoreItem[]{
                        new PropotionalScoreItem(new ScoreItem("SE303", 30, 35), 30),
                        new PropotionalScoreItem(new ScoreItem("SE304", 85, 100), 40),
                        new PropotionalScoreItem(new ScoreItem("SE305", 45, 50), 30),

                }, "A"}
        };
    } // end data for test --> "testCalGradeWithPropotionScoreItemsWithParamFor"


} // end param test