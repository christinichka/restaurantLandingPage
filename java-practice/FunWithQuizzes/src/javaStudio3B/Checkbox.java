package javaStudio3B;

import java.util.HashMap;

//Checkbox: a question with a fixed set of possible answers, of which any number may be chosen; there is one correct combination of choices
public class Checkbox extends Question {
    private HashMap<String, Boolean> checked = new HashMap<>();

    public Checkbox(String questionString) {
        super(questionString);
    }


}
