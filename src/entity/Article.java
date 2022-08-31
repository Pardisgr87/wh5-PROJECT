package entity;

import java.util.Date;

public class Article {
    private int id;
    private String title ;
    private String brief;
    private String content;
    private Date creatDate;
    private boolean isPublished;
    private User userId;

    public Article(int id, String title, String brief, String content, Date creatDate, boolean isPublished, User userId) {
        this.id = id;
        this.title = title;
        this.brief = brief;
        this.content = content;
        this.creatDate = creatDate;
        this.isPublished = isPublished;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
