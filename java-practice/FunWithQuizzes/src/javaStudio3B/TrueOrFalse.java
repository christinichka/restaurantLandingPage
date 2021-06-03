package javaStudio3B;

//True/False: a question that has a true/false answer
public class TrueOrFalse extends Question {

    private String answer;

    public TrueOrFalse(String questionString) {
        super(questionString);
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
//    public static void main(String[] args) {
//        boolean q3 = true;
//        boolean q4 = false;
//
//        if(q3 = true) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

}

