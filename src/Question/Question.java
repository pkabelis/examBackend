package Question;

import java.util.List;

public class Question {
    public Question(){}

    private Category category;
    private List<Answer> answersList;

    private List<Answer> createAnswertList(){
        return answersList;
    }
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
