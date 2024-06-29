package entities;

public class Task extends Lesson {

    private String description;
    private int questionCount;

    public Task(String title,String description, int questionCount){
        super(title);
        this.description = description;
        this.questionCount = questionCount;
    }

    public int duration(){
        return questionCount*300;
    }
    

}
