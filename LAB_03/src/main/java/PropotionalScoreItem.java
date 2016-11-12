/**
 * Created by mac on 11/9/2016 AD.
 */
public class PropotionalScoreItem {

    // declare various
    private ScoreItem scoreItem;
    private int propotion;


    // create constructor by select Generate > constrcutor
    public PropotionalScoreItem(ScoreItem scoreItem, int propotion) {
        this.scoreItem = scoreItem;
        this.propotion = propotion;
    }


    // create getter and setter  by select Generate > getter setter
    public ScoreItem getScoreItem() {
        return scoreItem;
    }

    public void setScoreItem(ScoreItem scoreItem) {
        this.scoreItem = scoreItem;
    }

    public int getPropotion() {
        return propotion;
    }

    public void setPropotion(int propotion) {
        this.propotion = propotion;
    }


}
