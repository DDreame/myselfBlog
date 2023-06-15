package me.dddream.controller;

import com.minis.web.RequestMapping;

/***
 * @description : 评论控制器
 * @author : DDDreame
 * @date : 2023/6/15 16:44 
 */
public class CommentController {

    @RequestMapping("/api/v1/comment/add")
    public String addComment() {
        //todo 添加评论
        System.out.println("add comment is not completed");
        return "add comment is not completed";
    }
    @RequestMapping("/api/v1/comment/del")
    public String delComment() {
        //todo 删除评论
        System.out.println("del comment is not completed");
        return "del comment is not completed";
    }
    @RequestMapping("/api/v1/comment/edit")
    public String editComment() {
        //todo 编辑评论
        System.out.println("edit comment is not completed");
        return "edit comment is not completed";
    }
}
