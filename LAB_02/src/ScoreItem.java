/**
 * Created by TheNurse on 13/9/2559.
 */
public class ScoreItem {
    String name;
    double score;
    double maxScore;
    double weight;

    public ScoreItem() { //select None
    }

    public ScoreItem(String name, double score, double maxScore) {
        this.name = name;
        this.score = score;
        this.maxScore = maxScore;
    }
    public ScoreItem(String name, double score, double maxScore,double weight) {
        this.name = name;
        this.score = score;
        this.maxScore = maxScore;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public double getWeight() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}

}
