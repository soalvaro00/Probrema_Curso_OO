package entities;

public class Task extends Lesson {
    private String description;
    private int numberOfQuestions;

    public Task(String title, String description, int numberOfQuestions) {
        super(title);
        this.description = description;
        this.numberOfQuestions = numberOfQuestions;
    }

    @Override
    public int duration() {
        return numberOfQuestions * 5 * 60; // 5 minutos por questão, convertido para segundos
    }
}

