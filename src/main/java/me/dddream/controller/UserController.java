package me.dddream.controller;

import com.minis.web.RequestMapping;
/***
 * @description : 所有用户请求
 * @author : DDDreame
 * @date : 2023/6/15 16:34 
 */
public class UserController {

    @RequestMapping("/api/v1/user/add")
    public String addUser() {
        //todo 用户注册
        System.out.println("addUser is not completed");
        return "addUser is not completed";
    }

    @RequestMapping("/api/v1/user/login")
    public String userLogin() {
        //todo 用户登陆
        System.out.println("user Login is not completed");
        return "user Login is not completed";
    }


    @RequestMapping("/api/v1/user/logout")
    public String userLogout() {
        //todo 用户退出登陆
        System.out.println("logout is not completed");
        return "logout is not completed";
    }

}
