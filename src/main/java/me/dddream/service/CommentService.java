package me.dddream.service;

import me.dddream.entity.Comment;

import java.util.List;

/***
 * @description : 评论服务类
 * @author : DDDreame
 * @date : 2023/6/22 16:30 
 */
public class CommentService {
    /**
     * 返回文章全部评论
     * @param articleId 文章id
     * @return 评论列表
     */
    public List<Comment> getCommentList(Long articleId){
        return null;
    }

    /**
     * 根据评论 id 返回对应评论
     * @param commentId 评论id
     * @return 评论对象
     */
    public Comment getCommentById(Long commentId){
        return null;
    }

    /**
     * 添加一条评论
     * @param content 评论正文
     * @param articleId 文章id
     * @param authorId 作者id
     * @return 评论实体
     */
    public Comment addComment(String  content, Long articleId, Long authorId){
        return null;
    }

    /**
     * 添加一条楼中楼评论
     * @param content 评论正文
     * @param articleId  文章id
     * @param authorId 作者id
     * @param commentId 评论父级id
     * @return 评论实体
     */
    public Comment addComment(String  content, Long articleId, Long authorId, Long commentId){
        return null;
    }

    /**
     * 添加一条划线评论
     * @param content 评论正文
     * @param articleId 文章id
     * @param authorId 作者id
     * @param start 偏移起始值
     * @param end 偏移结束值
     * @return 评论实体
     */
    public Comment addComment(String  content, Long articleId, Long authorId, Long start, Long end){
        return null;
    }

    /**
     * 添加一条划线评论
     * @param content 评论正文
     * @param articleId 文章id
     * @param authorId 作者id
     * @param start 偏移起始值
     * @param end 偏移结束值
     * @param commentId 评论父级id
     * @return 评论实体
     */
    public Comment addComment(String  content, Long articleId, Long authorId, Long start, Long end, Long commentId){
        return null;
    }

    /**
     * 根据评论 id 修改评论
     * @param content 评论正文
     * @param commentId 评论的 id
     * @return 评论实体
     */
    public Comment addComment(String  content, Long commentId){
        return null;
    }

    /**
     * 删除一条评论
     * @param commentId
     * @return 删除结果
     */
    public boolean delComment(Long commentId){
        return false;
    }

}
