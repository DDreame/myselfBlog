package me.dddream.entity;

/***
 * @description : 标签类， 标记文章标签
 * @author : DDDreame
 * @date : 2023/6/15 16:21 
 */
public class Tag extends EntityBase{
    Long id;
    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
