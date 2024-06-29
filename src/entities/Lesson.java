package entities;

public abstract class Lesson {
    String title;

    Lesson(String title){
        this.title=title;
    };

    public String getTitle(){
        return title;
    }

    public abstract int duration();
}
