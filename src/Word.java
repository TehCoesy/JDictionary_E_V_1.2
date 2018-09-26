public class Word {
    private String word_target, word_explain;

    //Constructor
    Word(String word_target, String word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
    }

    Word() {
        this.word_target = "Default";
        this.word_explain = "Mặc định";
    }

    public String getTarget() {
        return word_target;
    }

    public void setTarget(String word_target) {
        this.word_target = word_target;
    }

    public String getExplain() {
        return word_explain;
    }

    public void setExplain(String word_explain) {
        this.word_explain = word_explain;
    }
}
