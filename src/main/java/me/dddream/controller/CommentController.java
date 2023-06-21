package me.dddream.controller;

import com.minis.web.RequestMapping;
import com.minis.web.ResponseBody;
import me.dddream.common.result.Result;
import me.dddream.common.result.Results;

/***
 * @description : 评论控制器
 * @author : DDDreame
 * @date : 2023/6/15 16:44 
 */
public class CommentController {

    @RequestMapping("/api/v1/comment/add")
    @ResponseBody
    public Result<String> addComment() {
        //todo 添加评论
        System.out.println("add comment is not completed!!");
        return Results.success("add comment is not completed");
    }
    @RequestMapping("/api/v1/comment/del")
    @ResponseBody
    public Result<String> delComment() {
        //todo 删除评论
        System.out.println("del comment is not completed");
        return Results.success("del comment is not completed");
    }
    @RequestMapping("/api/v1/comment/edit")
    @ResponseBody
    public Result<String> editComment() {
        //todo 编辑评论
        System.out.println("edit comment is not completed");
        return Results.success("edit comment is not completed");
    }
}
