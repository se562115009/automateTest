/**
 * Created by mac on 11/9/2016 AD.
 */
public class ClassUnderTest {

    public int doAdd (int a, int b){
        if (a == 0 || b == 0 || a<0 || b<0 ){
            return 0;
        }
        else { return  a+b;}
    }

    public int doAdd (int ...a){
        int size = a.length;
        int sum = 0;
        for (int i=0; i < size; i++){
            if (a[i] == 0 || a[i] < 0){
                return 0;
            }
            else {sum = sum + a[i];
            }

        } return sum;
    }

    public String calGrade (double score){
        if (score >= 80) { return "A"; }
        else if (score >= 70) { return "B";}
        else if (score >= 60) { return "C";}
        else if (score >= 50) { return "D";}
        else { return "F";}
    }

    public String calGrade (double ...score){
        int size = score.length;
        double sum = 0;
        for (int i=0; i<score.length; i++){

            sum = sum+score[i];
        }

        // call method calGrade compare grade with score instead it
        String a = calGrade(sum);
        return a;
    }

    // Homework
    public String calGrade (ScoreItem scoreItem){
        double score = scoreItem.getScore();
        double maxScore = scoreItem.getMaxScore();
        double sumScore = (score/maxScore)*100;

        String a = calGrade(sumScore);
        return a;
    }

    //Homework
    public String calGrade (ScoreItem ...scoreItem){
        double sum = 0;
        double totalSum =0;
        int size = scoreItem.length;

        for (int i=0; i< scoreItem.length; i++){
            double score = scoreItem[i].getScore();
            double maxScore = scoreItem[i].getMaxScore();

            sum = sum + ((score / maxScore)*100);
        }
        totalSum = sum / size;

        String a = calGrade(totalSum);
        return a;
    }

    public String calGradeByWeight (ScoreItem scoreItem){
        double sum = 0;
        double total = 0;
        double score = scoreItem.getScore();
        double maxScore = scoreItem.getMaxScore();
        double weight = scoreItem.getWeight();

        sum = sum+(((score / maxScore) * 100)* weight);
        total = sum / weight;

        String a = calGrade(total);
        return a;
    }

    public String calGradeByWeight (ScoreItem ...scoreItem){
        double sum = 0;
        double total =0;
        double sumWeight =0;
        int size = scoreItem.length;

        for (int i=0; i< size; i++){
            double score = scoreItem[i].getScore();
            double maxScore = scoreItem[i].getMaxScore();
            double weight = scoreItem[i].getWeight();

            sum = sum+(((score/maxScore)*100)*weight);
            sumWeight = sumWeight+weight;
        }
        total = sum/sumWeight;

        String a = calGrade(total);
        return a;
    }

    public String calGradeByPropotion (PropotionalScoreItem ...scoreItem){

        double sum =0;
        double total =0;
        double w =0;
        int size = scoreItem.length;
        double sumPropotion =0;

        for (int i=0; i < size; i++){
            double score = scoreItem[i].getScoreItem().getScore();
            double maxScore = scoreItem[i].getScoreItem().getMaxScore();

            sum = sum+((score/maxScore) * scoreItem[i].getPropotion());
            sumPropotion += scoreItem[i].getPropotion();
        }

        if (sumPropotion == 100){

            String a = calGrade(sum);
            return a;
        }
        else {
            throw new CalGradeError();
        }

    }
}
