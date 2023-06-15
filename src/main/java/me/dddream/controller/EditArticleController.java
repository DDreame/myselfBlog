package me.dddream.controller;

import com.minis.web.RequestMapping;
import com.minis.web.servlet.ModelAndView;

/***
 * @description : 编辑相关的文章控制器
 * @author : DDDreame
 * @date : 2023/6/15 16:47 
 */
public class EditArticleController {

    @RequestMapping("/api/v1/article/add")
    public String addArticle() {
        //todo 添加文章
        System.out.println("add Article is not completed");
        return "add Article is not completed";
    }

    @RequestMapping("/api/v1/article/del")
    public String delArticle() {
        //todo 删除文章
        System.out.println("del Article is not completed");
        return "del Article is not completed";
    }
}
