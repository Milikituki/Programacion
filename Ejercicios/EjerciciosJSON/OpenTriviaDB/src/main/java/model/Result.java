package model;
import java.util.List;
@lombok.Data
public class Result {
    private String type;
    private String difficulty;
    private String category;
    private String question;
    private String correctAnswer;
    private List<String> incorrectAnswers;

    public void mostrarResultados(){
        System.out.println("category = " + category);
        System.out.println("question = " + question);
        System.out.println("correctAnswer = " + correctAnswer);
    }
}
