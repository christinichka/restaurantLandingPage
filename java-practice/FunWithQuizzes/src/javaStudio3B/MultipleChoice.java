package javaStudio3B;

import java.util.HashMap;

//Multiple choice: a question with a fixed set of possible answers, of which only one may be chosen and only one answer is correct
public class MultipleChoice extends Question {

    private String answer;

    private HashMap<String, String> multipleChoices = new HashMap();

    public MultipleChoice(String questionString) {
        super(questionString);
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public HashMap<String, String> getMultipleChoices() {
        return multipleChoices;
    }

    public void setMultipleChoices(HashMap<String, String> multipleChoices) {
        this.multipleChoices = multipleChoices;
    }

    public void addMultipleChoice (String String, String choice) {
        this.multipleChoices.put(String, choice);
    }


//convert to string?
}



