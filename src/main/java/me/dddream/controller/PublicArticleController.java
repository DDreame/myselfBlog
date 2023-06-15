package me.dddream.controller;

import com.minis.web.RequestMapping;
import com.minis.web.servlet.ModelAndView;

/***
 * @description : 阅览相关的文章控制器
 * @author : DDDreame
 * @date : 2023/6/15 16:43 
 */
public class PublicArticleController {
    @RequestMapping("/api/v1/article/list")
    public String listArticle() {
        //todo 文章列表
        System.out.println("list Article is not completed");
        return "list Article is not completed";
    }
    @RequestMapping("/api/v1/article/search")
    public String searchArticle() {
        //todo 搜索文章
        System.out.println("search article is not completed");
        return "search article is not completed";
    }

}
