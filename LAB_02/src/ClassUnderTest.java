/**
 * Created by TheNurse on 13/9/2559.
 */
public class ClassUnderTest {

    public int doAdd (int a, int b){
        if(a==0 || b==0 || a<0 || b<0){
            return 0;
        }
        else {
        return a+b;
        }
    }
    public int doAdd (int ...a){
        int size=a.length;
        int sum=0;
        for(int i=0;i<size;i++){
            if (a[i]==0 || a[i]<0){
                return 0;
            }
            else{
            sum=sum+a[i];
            }
        }
        return sum;

    }
    public String calGrade(double score){
        if(score>=80){
            return "A";
        }
        else if(score>70){
            return "B";
        }
        else if(score>60){
            return "C";
        }
        else if(score>50){
            return "D";
        }
        else{
            return "F";
        }
    }
    public String calGrade(double ...score){
        int size=score.length;
        double sum=0;
        for(int i=0;i<size;i++){
            sum=sum+score[i];
        }
        String a=calGrade(sum);
        return a;
        /*if(sum>=80){
            return "A";
        }
        else if(sum>70){
            return "B";
        }
        else if(sum>60){
            return "C";
        }
        else if(sum>50){
            return "D";
        }
        else {
            return "F";
        }*/

    }
    public String calGrade(ScoreItem scoreItem){
        //HW
        double score=scoreItem.getScore();
        double maxScore=scoreItem.getMaxScore();
        double sumScore=(score/maxScore)*100;
        String a=calGrade(sumScore);
        return a;
        /*if(sumScore>=80){
            return "A";
        }
        else if(sumScore>70){
            return "B";
        }
        else if(sumScore>60){
            return "C";
        }
        else if(sumScore>50){
            return "D";
        }
        else {
            return "F";
        }*/
    }



    public String calGrade(ScoreItem ...scoreItem) {
        //HW
        double sum = 0;
        double average=0;
        int size = scoreItem.length;
        for (int i = 0; i < size; i++) {
            double score = scoreItem[i].getScore();
            double maxScore = scoreItem[i].getMaxScore();
            sum = sum+((score / maxScore) * 100);
        }

        average=sum/size;

        String a=calGrade(average);
        return a;
        /*if(average>=80){
            return "A";
        }
        else if(average>70){
            return "B";
        }
        else if(average>60){
            return "C";
        }
        else if(average>50){
            return "D";
        }
        else {
            return "F";
        }*/

    }

    public String calGradeW(ScoreItem scoreItem){
        double sum = 0;
        double average=0;
        double score = scoreItem.getScore();
        double maxScore = scoreItem.getMaxScore();
        double weight=scoreItem.getWeight();
        sum = sum+(((score / maxScore) * 100)* weight);
        average=sum/weight;

        String a=calGrade(average);
        return a;
    }

    public String calGradeW(ScoreItem ...scoreItem){
        double sum = 0;
        double average=0;
        double w=0;
        int size = scoreItem.length;
        for (int i = 0; i < size; i++) {
            double score = scoreItem[i].getScore();
            double maxScore = scoreItem[i].getMaxScore();
            double weight=scoreItem[i].getWeight();
            sum = sum+(((score / maxScore) * 100)* weight);
            w=w+weight;
        }

        average=sum/w;

        String a=calGrade(average);
        return a;

        /*if(average>=80){
            return "A";
        }
        else if(average>70){
            return "B";
        }
        else if(average>60){
            return "C";
        }
        else if(average>50){
            return "D";
        }
        else {
            return "F";
        }*/

    }

}
