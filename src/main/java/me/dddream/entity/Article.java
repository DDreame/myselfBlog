package me.dddream.entity;

/**
 * @description : 文章实体类
 * @author : DDDreame
 * @date : 2023/6/15 16:14 
 */
public class Article extends EntityBase{
    Long id;
    String title;
    String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
