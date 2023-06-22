package me.dddream.service;

import me.dddream.entity.Article;

import java.util.List;

/***
 * @description : 文章服务类
 * @author : DDDreame
 * @date : 2023/6/22 16:30 
 */
public class ArticleService {
    /**
     * 根据时间倒序返回文章列表
     * @return 文章列表
     */
    public List<Article> getArticleList(){
        return null;
    }

    /**
     * 返回指定文章
     * @param id
     * @return 文章实体
     */
    public Article getArticleById(Long id){
        return null;
    }

    /**
     * 添加文章
     * @param article 文章
     * @return 添加文章
     */
    public boolean addArticleById(Article article){
        return false;
    }

    /**
     * 更新文章
     * @param article
     * @return
     */
    public boolean updateArticle(Article article){
        return false;
    }
}
