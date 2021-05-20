public class Criterion {

    private String criteria;
    private int score;

    public Criterion(String criteria) {

        criteria = this.criteria;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {

        if (score < 1 || score > 5) {
            throw new IllegalArgumentException("Criterion grade must be between 1 and 5");
        }  
        else{
            this.score=score;
        }
     
    }

}
    