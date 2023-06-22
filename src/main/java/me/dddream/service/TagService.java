package me.dddream.service;

import com.minis.jdbc.core.JdbcTemplate;
import me.dddream.entity.Tag;

import java.util.List;

/***
 * @description : Todo
 * @author : DDDreame
 * @date : 2023/6/22 17:10 
 */
public class TagService {

    JdbcTemplate jdbcTemplate;

    /**
     * 获取全部 tag
     * @return tag 列表
     */
    public List<Tag> getTags(){
        return null;
    }

    /**
     * 根据 id 返回 tag 对象
     * @param id tag Id
     * @return tag 对象
     */
    public Tag getTagById(Long id){
        return null;
    }

    /**
     * 添加 tag 对象
     * @param name tag名称
     */
    public void addTag(String name){

    }

    /**
     * 根据 id 更新 tag
     * 或 创建指定 id 的tag
     * @param id tag 的 id
     * @param name tag 的描述
     * @return tag
     */
    public Tag updateTag(Long id, String name){
        return null;
    }

    /**
     * 删除对应的 Tag 数据
     * @param tag tag 对象
     * @return 是否删除成功
     */
    public boolean deleteTag(Tag tag){
        return false;
    }
}

