package p.hin.qingya.entity;

import java.io.Serializable;

public class Interview implements Serializable {
    private int id;
    private int type;
    private String title;
    private String author;
    private String date;
    private String content;
    private String coverContent;
    private int love;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCoverContent() {
        return coverContent;
    }

    public void setCoverContent(String coverContent) {
        this.coverContent = coverContent;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
}
