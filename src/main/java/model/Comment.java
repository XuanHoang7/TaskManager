package model;

//This is a POJO class, a POJO is a simple object without dependencies, only described
//by its attributes and methods

public class Comment {

    private String author;

    private String text;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
